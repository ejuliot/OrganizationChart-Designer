/**
 */
package org.obeonetwork.dsl.organizationchart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.Organization#getEmployees <em>Employees</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.Organization#getServices <em>Services</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.Organization#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.Organization#getLocations <em>Locations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getOrganization()
 * @model
 * @generated
 */
public interface Organization extends EObject {
	/**
	 * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.organizationchart.Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' containment reference list.
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getOrganization_Employees()
	 * @model containment="true"
	 * @generated
	 */
	EList<Employee> getEmployees();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.organizationchart.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getOrganization_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

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
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getOrganization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.organizationchart.Organization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.organizationchart.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getOrganization_Locations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Location> getLocations();

} // Organization
