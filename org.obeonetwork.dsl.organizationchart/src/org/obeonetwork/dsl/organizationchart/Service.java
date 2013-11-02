/**
 */
package org.obeonetwork.dsl.organizationchart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.Service#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.Service#getEmployees <em>Employees</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.Service#getManager <em>Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
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
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getService_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.organizationchart.Service#getName <em>Name</em>}' attribute.
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
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.organizationchart.Employee#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' reference list.
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getService_Employees()
	 * @see org.obeonetwork.dsl.organizationchart.Employee#getService
	 * @model opposite="service"
	 * @generated
	 */
	EList<Employee> getEmployees();

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.organizationchart.Employee#getIsInChargeOf <em>Is In Charge Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' reference.
	 * @see #setManager(Employee)
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getService_Manager()
	 * @see org.obeonetwork.dsl.organizationchart.Employee#getIsInChargeOf
	 * @model opposite="isInChargeOf"
	 * @generated
	 */
	Employee getManager();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.organizationchart.Service#getManager <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(Employee value);

} // Service
