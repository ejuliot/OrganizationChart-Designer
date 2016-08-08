/**
 * Copyright (c) 2014, Obeo
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Etienne Juliot - initial API and implementation
 * 
 */
package org.obeonetwork.dsl.organizationchart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.Function#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.Function#getIsPerformedBy <em>Is Performed By</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.organizationchart.Function#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Performed By</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.organizationchart.Employee}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.organizationchart.Employee#getPerforms <em>Performs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Performed By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Performed By</em>' reference list.
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getFunction_IsPerformedBy()
	 * @see org.obeonetwork.dsl.organizationchart.Employee#getPerforms
	 * @model opposite="performs"
	 * @generated
	 */
	EList<Employee> getIsPerformedBy();

} // Function
