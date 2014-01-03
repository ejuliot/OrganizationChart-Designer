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
package org.obeonetwork.dsl.organizationchart.design.ui.wizards.newmodel;

import org.eclipse.jface.viewers.IStructuredSelection;

/**
 * The semantic model file creation page.
 * 
 * @author Etienne Juliot
 */
public class OrganizationChartModelWizardNewModelFilePage extends AbstractOrganizationChartModelWizardNewFileCreationPage {

	/**
	 * Constructor.
	 * 
	 * @param pageName
	 *            the page name
	 * @param selection
	 *            the selection
	 */
	public OrganizationChartModelWizardNewModelFilePage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
	}

	protected String getRequiredExtension() {
		return OrganizationChartProjectUtils.MODEL_FILE_EXTENSION;
	}
}
