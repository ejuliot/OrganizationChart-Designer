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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.common.tools.api.util.Option;
import org.eclipse.sirius.common.tools.api.util.Options;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * An extension to provide OrganizationChart designer custom provider in model content view.
 * 
 * @author Etienne Juliot
 */
public abstract class AbstractOrganizationChartModelWizardNewFileCreationPage extends WizardNewFileCreationPage {

	/**
	 * Constructor.
	 * 
	 * @param pageName
	 *            the page name
	 * @param selection
	 *            the selection
	 */
	public AbstractOrganizationChartModelWizardNewFileCreationPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
	}

	/**
	 * Get the model file.
	 * 
	 * @return Model file
	 */
	public Option<IFile> getModelFile() {
		return Options.newSome(ResourcesPlugin.getWorkspace().getRoot()
				.getFile(getContainerFullPath().append(getFileName())));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected boolean validatePage() {
		if (super.validatePage()) {
			final String requiredExt = getRequiredExtension();
			final String enteredExt = new Path(getFileName()).getFileExtension();
			if (enteredExt == null || !enteredExt.equals(requiredExt)) {
				setErrorMessage(Messages.bind(Messages.OrganizationChartModelWizard_UI_ErrorMsg_BadFileExtension,
						requiredExt));
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	/**
	 * This method should return the extension of the file to create.
	 * 
	 * @return the file extension to create.
	 */
	protected abstract String getRequiredExtension();
}
