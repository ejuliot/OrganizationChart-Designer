package org.obeonetwork.dsl.organizationchart.design.ui.wizards.newmodel;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.obeonetwork.dsl.organizationchart.design.OrganizationChartDesignerPlugin;
import org.obeonetwork.dsl.organizationchart.design.InitOrganizationChartModel;

/**
 * Implement the perform finish method when the OrganizationChart creation wizard OK button is pressed.
 * 
 * @author Etienne Juliot
 */
public abstract class AbstractNewOrganizationChartModelWizard extends BasicNewProjectResourceWizard {

	/**
	 * OrganizationChart project.
	 */
	protected IProject project;

	/**
	 * Name of the model root element.
	 */
	protected String rootObjectName;

	/**
	 * Name of the OrganizationChart file.
	 */
	protected String newOrganizationChartModelFileName;

	@Override
	/**
	 * Create a default OrganizationChart model then select it in the explorer and switch to modeling perspective.
	 * The project, the rootObjectName and the newOrganizationChartModelFileName must be initialized before calling the performFinish method.
	 * {@inheritDoc}
	 */
	public boolean performFinish() {
		if (project == null || rootObjectName == null || newOrganizationChartModelFileName == null) {
			throw new IllegalArgumentException();
		}

		// Do not call super as we don't want to use the super perform method to create the project, in our
		// case the project was created using the modeling project api, we need to extends the
		// BasicNewProjectResourceWizard to implement the perspective switch easily.
		InitOrganizationChartModel init = new InitOrganizationChartModel(project, rootObjectName, newOrganizationChartModelFileName);
		try {
			getContainer().run(false, true, init);
		} catch (final InterruptedException e) {
			// Ignore.
			return false;
		} catch (final InvocationTargetException e) {
			OrganizationChartDesignerPlugin.log(IStatus.ERROR, Messages.OrganizationChartModelWizard_UI_Error_CreatingOrganizationChartModel, e);
			return false;
		}

		// Get the newly created OrganizationChart file
		IResource newOrganizationChartModelFile = project.findMember(newOrganizationChartModelFileName);

		// Switch to the modeling perspective
		updatePerspective();

		// Select it in the explorer
		selectAndReveal(newOrganizationChartModelFile, PlatformUI.getWorkbench().getActiveWorkbenchWindow());

		return true;
	}
}
