/*******************************************************************************
 * Copyright (c) 2009, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.organizationchart.design;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.common.tools.api.util.Option;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.obeonetwork.dsl.organizationchart.design.ui.wizards.newmodel.OrganizationChartProjectUtils;

/**
 * An operation to create and initialize a new session with empty semantic OrganizationChart model.
 * 
 * @author Etienne Juliot
 */
public class InitOrganizationChartModel extends WorkspaceModifyOperation {
	/**
	 * The OrganizationChart project.
	 */
	private IProject project;

	/**
	 * The name of the semantic root element.
	 */
	private String rootObjectName;

	/**
	 * The name of the OrganizationChart file.
	 */
	private String organizationChartFileName;

	/**
	 * Constructor.
	 * 
	 * @param modelFile
	 *            An {@link IFile} handle representing the semantic model to create.
	 * @param airdFile
	 *            An {@link IFile} handle representing the session file to create.
	 * @param rootObjectName
	 *            The name of the semantic root element.
	 * @param fileName
	 */
	public InitOrganizationChartModel(IProject project, String rootObjectName, String fileName) {
		super(null);
		this.project = project;
		this.rootObjectName = rootObjectName;
		this.organizationChartFileName = fileName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void execute(final IProgressMonitor monitor) throws CoreException, InterruptedException {
		final Option<ModelingProject> created = ModelingProject.asModelingProject(project);
		if (created.some()) {
			Display.getDefault().syncExec(new Runnable() {

				public void run() {
					// Create default empty OrganizationChart model
					OrganizationChartProjectUtils.createSemanticResource(project, rootObjectName, organizationChartFileName);

					// Enable OrganizationChart viewpoints
					ModelingProject modelingProject = created.get();
					OrganizationChartProjectUtils.enableOrganizationChartViewpoints(modelingProject.getSession());
				}
			});
		}
	}

}
