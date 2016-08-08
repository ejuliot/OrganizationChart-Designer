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
 * A representation of the model object '<em><b>Organizational Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getEmployees <em>Employees</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getSubStructures <em>Sub Structures</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getOwns <em>Owns</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getManager <em>Manager</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getOrganizationalStructure()
 * @model
 * @generated
 */
public interface OrganizationalStructure extends EObject {
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
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getOrganizationalStructure_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.organizationchart.Employee}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.organizationchart.Employee#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' reference list.
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getOrganizationalStructure_Employees()
	 * @see org.obeonetwork.dsl.organizationchart.Employee#getBelongsTo
	 * @model opposite="belongsTo"
	 * @generated
	 */
	EList<Employee> getEmployees();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.organizationchart.StructureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.obeonetwork.dsl.organizationchart.StructureType
	 * @see #setType(StructureType)
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getOrganizationalStructure_Type()
	 * @model
	 * @generated
	 */
	StructureType getType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.obeonetwork.dsl.organizationchart.StructureType
	 * @see #getType()
	 * @generated
	 */
	void setType(StructureType value);

	/**
	 * Returns the value of the '<em><b>Sub Structures</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.organizationchart.OrganizationalStructure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Structures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Structures</em>' containment reference list.
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getOrganizationalStructure_SubStructures()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrganizationalStructure> getSubStructures();

	/**
	 * Returns the value of the '<em><b>Owns</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.organizationchart.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns</em>' containment reference list.
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getOrganizationalStructure_Owns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getOwns();

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.organizationchart.Employee#getLeads <em>Leads</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' reference.
	 * @see #setManager(Employee)
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getOrganizationalStructure_Manager()
	 * @see org.obeonetwork.dsl.organizationchart.Employee#getLeads
	 * @model opposite="leads"
	 * @generated
	 */
	Employee getManager();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getManager <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(Employee value);

} // OrganizationalStructure
