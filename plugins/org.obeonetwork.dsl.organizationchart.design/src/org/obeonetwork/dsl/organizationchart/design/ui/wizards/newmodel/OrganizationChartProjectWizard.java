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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.obeonetwork.dsl.organizationchart.design.OrganizationChartDesignerPlugin;

/**
 * The wizard to create a new OrganizationChart designer project.
 * 
 * @author Etienne Juliot
 */
public class OrganizationChartProjectWizard extends AbstractNewOrganizationChartModelWizard {
	protected OrganizationChartModelWizardInitModelPage modelPage;

	protected WizardNewProjectCreationPage newProjectPage;

	@Override
	public void addPages() {
		// we're not calling the super as we want to control the project creation, we don't want the default
		// page.
		// super.addPages();

		newProjectPage = new WizardNewProjectCreationPage("Project"); //$NON-NLS-1$
		newProjectPage.setInitialProjectName("");
		newProjectPage.setTitle("Create a OrganizationChart Modeling project");
		newProjectPage.setDescription("Enter a project name"); //$NON-NLS-1$
		addPage(newProjectPage);

		modelPage = new OrganizationChartModelWizardInitModelPage(Messages.OrganizationChartModelWizard_UI_InitModelPageId);
		modelPage.setTitle(Messages.OrganizationChartModelWizard_UI_InitModelPageTitle);
		modelPage.setDescription(Messages.OrganizationChartModelWizard_UI_InitModelPageDescription);
		addPage(modelPage);
	}

	@Override
	public boolean performFinish() {
		try {
			project = ModelingProjectManager.INSTANCE.createNewModelingProject(
					newProjectPage.getProjectName(), newProjectPage.getLocationPath(), true,
					new NullProgressMonitor());
			rootObjectName = modelPage.getInitialObjectName();
			newOrganizationChartModelFileName = modelPage.getInitialObjectName().toLowerCase() + OrganizationChartProjectUtils.DOT
					+ OrganizationChartProjectUtils.MODEL_FILE_EXTENSION;

			super.performFinish();
		} catch (CoreException e) {
			OrganizationChartDesignerPlugin.log(IStatus.ERROR, Messages.OrganizationChartModelWizard_UI_Error_CreatingOrganizationChartModel, e);
			return false;
		}

		return true;
	}
}
