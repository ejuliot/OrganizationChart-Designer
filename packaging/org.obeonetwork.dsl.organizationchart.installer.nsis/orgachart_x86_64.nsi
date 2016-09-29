!include MUI2.nsh
!include LogicLib.nsh
!include x64.nsh

RequestExecutionLevel highest

Function .onInit
  UserInfo::GetAccountType
  Pop $1
  IfSilent +5
    ${if} "$1" == "Admin"
	  StrCpy $INSTDIR "$PROGRAMFILES64\OrganizationChart"
	${else}
	  StrCpy $INSTDIR "$LOCALAPPDATA\OrganizationChart"
	${endif}
  ${if} "$INSTDIR" == ""
    ${if} "$1" == "Admin"
	  StrCpy $INSTDIR "$PROGRAMFILES64\OrganizationChart"
	${else}
	  StrCpy $INSTDIR "$LOCALAPPDATA\OrganizationChart"
	${endif}
  ${endif}
FunctionEnd

Function un.isEmptyDir
  # Stack ->                    # Stack: <directory>
  Exch $0                       # Stack: $0
  Push $1                       # Stack: $1, $0
  FindFirst $0 $1 "$0\*.*"
  strcmp $1 "." 0 _notempty
    FindNext $0 $1
    strcmp $1 ".." 0 _notempty
      ClearErrors
      FindNext $0 $1
      IfErrors 0 _notempty
        FindClose $0
        Pop $1                  # Stack: $0
        StrCpy $0 1
        Exch $0                 # Stack: 1 (true)
        goto _end
     _notempty:
       FindClose $0
       ClearErrors
       Pop $1                   # Stack: $0
       StrCpy $0 0
       Exch $0                  # Stack: 0 (false)
  _end:
FunctionEnd

;--------------------------------
Name "OrganizationChart"
OutFile "OrganizationChart-setup.exe"

;--------------------------------
!define MUI_ICON "logo_win.ico"
!define MUI_HEADERIMAGE
!define MUI_HEADERIMAGE_RIGHT
!define MUI_HEADERIMAGE_BITMAP "orgachart.png"
!define MUI_ABORTWARNING

;--------------------------------
;Pages

!insertmacro MUI_PAGE_WELCOME
!insertmacro MUI_PAGE_DIRECTORY
!insertmacro MUI_PAGE_INSTFILES
!insertmacro MUI_PAGE_FINISH

!insertmacro MUI_UNPAGE_WELCOME
!insertmacro MUI_UNPAGE_CONFIRM
!insertmacro MUI_UNPAGE_INSTFILES
!insertmacro MUI_UNPAGE_FINISH

!insertmacro MUI_LANGUAGE "English"

;--------------------------------
;Installer Sections

Section "OrganizationChart" SecInstall

  SetOutPath $INSTDIR
  
  ; Unzip program files
  File /r ..\org.obeonetwork.dsl.organizationchart.product\target\products\org.obeonetwork.dsl.organizationchart.branding.product\win32\win32\x86_64\OrganizationChart\*.*

  ; Create Desktop & Start Menu shortcuts
  CreateShortCut "$DESKTOP\OrganizationChart.lnk" "$INSTDIR\organizationchart.exe" ""
  CreateDirectory "$SMPROGRAMS\OrganizationChart"
  CreateShortCut "$SMPROGRAMS\OrganizationChart\OrganizationChart.lnk" "$INSTDIR\organizationchart.exe"
  CreateShortCut "$SMPROGRAMS\OrganizationChart\Uninstall OrganizationChart.lnk" "$INSTDIR\uninstall.exe"

  ; Give full control to everyone. Required for updates and temp folder usage.
  ; AccessControl::GrantOnFile "$INSTDIR" "(BU)" "FullAccess"
  
  ; Write registry keys for file association
  WriteRegStr HKCR ".r" "" "OrganizationChartFile"
  WriteRegStr HKCR ".rnw" "" "OrganizationChartFile"
  WriteRegStr HKCR ".rda" "" "OrganizationChartFile"
  WriteRegStr HKCR ".rdata" "" "OrganizationChartFile"
  WriteRegStr HKCR "OrganizationChartFile" "" "Architect File"
  WriteRegStr HKCR "OrganizationChartFile\DefaultIcon" "" "$INSTDIR\organizationchart.exe"
  WriteRegStr HKCR "OrganizationChartFile\shell\Open\Command" "" '"$INSTDIR\organizationchart.exe" "%1"'
    
  ; Write registry keys for uninstallation
  WriteRegStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\OrganizationChart" "DisplayName" "OrganizationChart (remove only)"
  WriteRegStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\OrganizationChart" "UninstallString" "$INSTDIR\uninstall.exe"
  WriteUninstaller "$INSTDIR\uninstall.exe"

SectionEnd

;--------------------------------
;Descriptions

LangString DESC_SecInstall ${LANG_ENGLISH} "The OrganizationChart Application"

!insertmacro MUI_FUNCTION_DESCRIPTION_BEGIN
!insertmacro MUI_DESCRIPTION_TEXT ${SecInstall} $(DESC_SecInstall)
!insertmacro MUI_FUNCTION_DESCRIPTION_END

;--------------------------------
;Uninstaller Section

Section "Uninstall"

  RMDir /r "$INSTDIR\configuration"
  RMDir /r "$INSTDIR\features"
  RMDir /r "$INSTDIR\p2"
  RMDir /r "$INSTDIR\plugins"
  RMDir /r "$INSTDIR\readme"
  RMDir /r "$INSTDIR\workspace"
  RMDir /r "$INSTDIR\jre"
  delete "$INSTDIR\organizationchart.exe"
  delete "$INSTDIR\organizationchart.ini"
  delete "$INSTDIR\artifacts.xml"
  delete "$INSTDIR\epl-v10.html"
  delete "$INSTDIR\notice.html"
  delete "$INSTDIR\.eclipseproduct"
  delete "$INSTDIR\uninstall.exe"
      
  RMDir /r "$SMPROGRAMS\OrganizationChart"
  delete "$DESKTOP\OrganizationChart.lnk"

  Push "$INSTDIR"
	Call un.isEmptyDir
  Pop $0
  StrCmp $0 1 0 +2
    RMDir "$INSTDIR"
SectionEnd