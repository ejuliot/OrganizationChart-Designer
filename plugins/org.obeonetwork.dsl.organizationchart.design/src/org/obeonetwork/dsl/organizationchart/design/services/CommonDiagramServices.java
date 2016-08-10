package org.obeonetwork.dsl.organizationchart.design.services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.sirius.common.tools.api.util.WorkspaceUtil;
//import org.eclipse.core.runtime.Platform;
import org.obeonetwork.dsl.organizationchart.Employee;
//import org.obeonetwork.dsl.organizationchart.design.Activator;
//import org.osgi.framework.Bundle;

public class CommonDiagramServices {
	
	private final static String[] imgExt = new String[] {"jpg", "svg", "png", "gif"}; 

	/**
	 * Automatically find a picture to associate to an Employee.
	 * Image files need to be store in a "pictures" folder at the root of the project.
	 * Search priority is:
	 * - trigraph.ext
	 * - firstname lastname.ext
	 * where ext can be jpg, svg, png, gif.
	 * @param emp
	 * @return
	 */
	public String getPicture(Employee emp) {
		IWorkspaceRoot wk = ResourcesPlugin.getWorkspace().getRoot();
		String prjName = emp.eResource().getURI().segment(1); // find project name
		IProject prj = wk.getProject(prjName);
		IFolder folder = prj.getFolder("pictures");
		String folderURI = "/" + prjName + "/pictures/";
		
		if (folder.exists()) {
			String picFileName;
			
			picFileName = getPicture(folder, emp.getTrigraph());
			if (picFileName != null) return folderURI + picFileName;
			
			picFileName = getPicture(folder, emp.getFirstname() + ' ' + emp.getLastname());
			if (picFileName != null) return folderURI + picFileName;
		}
		
		return "/org.obeonetwork.dsl.organizationchart.design/images/man64.png";
	}
	
	private String getPicture(IFolder folder, String filename) {
		for (String ext : imgExt) {			
			if (folder.findMember(filename + '.' + ext) != null)
				return filename + '.' + ext;
			if (folder.findMember(filename + '.' + ext.toUpperCase()) != null)
				return filename + '.' + ext.toUpperCase();
		}
		return null;
	};
}
