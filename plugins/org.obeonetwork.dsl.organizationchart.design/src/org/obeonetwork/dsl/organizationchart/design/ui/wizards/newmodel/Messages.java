/*******************************************************************************
 * Copyright (c) 2014 Etienne Juliot
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Etienne Juliot - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.organizationchart.design.ui.wizards.newmodel;

import org.eclipse.osgi.util.NLS;

// CHECKSTYLE:OFF
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.obeonetwork.dsl.organizationchart.design.ui.wizards.newmodel.messages"; //$NON-NLS-1$

	public static String UIServices_UI_Error_PastingElement;

	public static String OrganizationChartModelWizard_DefaultModelName;

	public static String OrganizationChartModelWizard_DefaultPackageName;

	public static String OrganizationChartModelWizard_UI_Error_CreatingOrganizationChartModel;

	public static String OrganizationChartModelWizard_UI_Error_CreatingOrganizationChartModelSession;

	public static String OrganizationChartModelWizard_UI_ErrorMsg_BadFileExtension;

	public static String OrganizationChartModelWizard_UI_InitModelPageDescription;

	public static String OrganizationChartModelWizard_UI_InitModelPageId;

	public static String OrganizationChartModelWizard_UI_InitModelPageTitle;

	public static String OrganizationChartModelWizard_UI_ModelFileDefaultName;

	public static String OrganizationChartModelWizard_UI_NewModelFilePageDescription;

	public static String OrganizationChartModelWizard_UI_NewModelFilePageId;

	public static String OrganizationChartModelWizard_UI_NewModelFilePageTitle;

	public static String OrganizationChartModelWizard_UI_WizardTitle;

	public static String OrganizationChartModelWizardInitModelPage_ContainerLabel;

	public static String OrganizationChartModelWizardInitModelPage_XmlEncodingLabel;

	public static String OrganizationChartModelWizardInitModelPage_XmlEncodings;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
