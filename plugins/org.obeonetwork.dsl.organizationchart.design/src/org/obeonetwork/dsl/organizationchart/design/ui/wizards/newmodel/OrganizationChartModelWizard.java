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

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.ui.IWorkbench;
import org.obeonetwork.dsl.organizationchart.design.OrganizationChartDesignerPlugin;

/**
 * The wizard to create a new OrganizationChart designer model.
 * 
 * @author Etienne Juliot
 */
public class OrganizationChartModelWizard extends AbstractNewOrganizationChartModelWizard {
	/**
	 * Remember the selection during initialization for populating the default container.
	 */
	protected IStructuredSelection selection;

	/**
	 * The semantic model creation file page.
	 */
	private OrganizationChartModelWizardNewModelFilePage newModelFilePage;

	/**
	 * The initialization model page.
	 */
	private OrganizationChartModelWizardInitModelPage initModelPage;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean performFinish() {
		Option<IFile> option = newModelFilePage.getModelFile();

		if (option.some()) {
			IFile modelFile = option.get();
			project = modelFile.getProject();

			// Convert project to modeling project
			try {
				ModelingProjectManager.INSTANCE.convertToModelingProject(project, new NullProgressMonitor());
			} catch (CoreException e) {
				OrganizationChartDesignerPlugin.log(IStatus.ERROR, Messages.OrganizationChartModelWizard_UI_Error_CreatingOrganizationChartModel, e);
				return false;
			}

			rootObjectName = initModelPage.getInitialObjectName();
			newOrganizationChartModelFileName = newModelFilePage.getFileName();

			super.performFinish();
			return true;
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		setWindowTitle(Messages.OrganizationChartModelWizard_UI_WizardTitle);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addPages() {
		newModelFilePage = new OrganizationChartModelWizardNewModelFilePage(Messages.OrganizationChartModelWizard_UI_NewModelFilePageId,
				selection);
		newModelFilePage.setTitle(Messages.OrganizationChartModelWizard_UI_NewModelFilePageTitle);
		newModelFilePage.setDescription(Messages.OrganizationChartModelWizard_UI_NewModelFilePageDescription);
		newModelFilePage.setFileName(Messages.OrganizationChartModelWizard_UI_ModelFileDefaultName + OrganizationChartProjectUtils.DOT
				+ OrganizationChartProjectUtils.MODEL_FILE_EXTENSION); //$NON-NLS-1$
		addPage(newModelFilePage);

		initModelPage = new OrganizationChartModelWizardInitModelPage(Messages.OrganizationChartModelWizard_UI_InitModelPageId);
		initModelPage.setTitle(Messages.OrganizationChartModelWizard_UI_InitModelPageTitle);
		initModelPage.setDescription(Messages.OrganizationChartModelWizard_UI_InitModelPageDescription);
		addPage(initModelPage);

		// Try and get the resource selection to determine a current directory for the file dialog.
		if (selection != null && !selection.isEmpty()) {
			// Get the resource...
			//
			final Object selectedElement = selection.iterator().next();
			if (selectedElement instanceof IResource) {
				// Get the resource parent, if its a file.
				IResource selectedResource = (IResource)selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}

				// This gives us a directory...
				if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
					// Set this for the container.
					//
					newModelFilePage.setContainerFullPath(selectedResource.getFullPath());

					// Make up a unique new name here.
					String modelFilename = getNewModelName(selectedResource);
					newModelFilePage.setFileName(modelFilename);
				}
			}
		}
	}

	/**
	 * Compute the name of the new OrganizationChart model.
	 * 
	 * @param selectedResource
	 *            Selected resource
	 * @return Name of the new OrganizationChart model
	 */
	private String getNewModelName(IResource selectedResource) {
		final String defaultModelBaseFilename = Messages.OrganizationChartModelWizard_UI_ModelFileDefaultName;
		String modelFilename = defaultModelBaseFilename + OrganizationChartProjectUtils.DOT
				+ OrganizationChartProjectUtils.MODEL_FILE_EXTENSION;
		for (int i = 1; ((IContainer)selectedResource).findMember(modelFilename) != null; ++i) {
			modelFilename = defaultModelBaseFilename + i + OrganizationChartProjectUtils.DOT
					+ OrganizationChartProjectUtils.MODEL_FILE_EXTENSION;
		}
		return modelFilename;
	}
}
