/**
 */
package org.obeonetwork.dsl.organizationchart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.Employee#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.Employee#getLastname <em>Lastname</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.Employee#getTitle <em>Title</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.Employee#getManages <em>Manages</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.Employee#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.Employee#getLocation <em>Location</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.Employee#getTrigraph <em>Trigraph</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.Employee#getManager <em>Manager</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.Employee#getPerforms <em>Performs</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.Employee#getLeads <em>Leads</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends EObject {
	/**
	 * Returns the value of the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firstname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstname</em>' attribute.
	 * @see #setFirstname(String)
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getEmployee_Firstname()
	 * @model
	 * @generated
	 */
	String getFirstname();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.organizationchart.Employee#getFirstname <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firstname</em>' attribute.
	 * @see #getFirstname()
	 * @generated
	 */
	void setFirstname(String value);

	/**
	 * Returns the value of the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lastname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lastname</em>' attribute.
	 * @see #setLastname(String)
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getEmployee_Lastname()
	 * @model
	 * @generated
	 */
	String getLastname();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.organizationchart.Employee#getLastname <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lastname</em>' attribute.
	 * @see #getLastname()
	 * @generated
	 */
	void setLastname(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getEmployee_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.organizationchart.Employee#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Manages</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.organizationchart.Employee}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.organizationchart.Employee#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manages</em>' reference list.
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getEmployee_Manages()
	 * @see org.obeonetwork.dsl.organizationchart.Employee#getManager
	 * @model opposite="manager"
	 * @generated
	 */
	EList<Employee> getManages();

	/**
	 * Returns the value of the '<em><b>Belongs To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To</em>' reference.
	 * @see #setBelongsTo(OrganizationalStructure)
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getEmployee_BelongsTo()
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getEmployees
	 * @model opposite="employees"
	 * @generated
	 */
	OrganizationalStructure getBelongsTo();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.organizationchart.Employee#getBelongsTo <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
	void setBelongsTo(OrganizationalStructure value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.organizationchart.Location#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getEmployee_Location()
	 * @see org.obeonetwork.dsl.organizationchart.Location#getEmployees
	 * @model opposite="employees"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.organizationchart.Employee#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Trigraph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigraph</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigraph</em>' attribute.
	 * @see #setTrigraph(String)
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getEmployee_Trigraph()
	 * @model
	 * @generated
	 */
	String getTrigraph();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.organizationchart.Employee#getTrigraph <em>Trigraph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigraph</em>' attribute.
	 * @see #getTrigraph()
	 * @generated
	 */
	void setTrigraph(String value);

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.organizationchart.Employee#getManages <em>Manages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' reference.
	 * @see #setManager(Employee)
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getEmployee_Manager()
	 * @see org.obeonetwork.dsl.organizationchart.Employee#getManages
	 * @model opposite="manages"
	 * @generated
	 */
	Employee getManager();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.organizationchart.Employee#getManager <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(Employee value);

	/**
	 * Returns the value of the '<em><b>Performs</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.organizationchart.Function}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.organizationchart.Function#getIsPerformedBy <em>Is Performed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performs</em>' reference list.
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getEmployee_Performs()
	 * @see org.obeonetwork.dsl.organizationchart.Function#getIsPerformedBy
	 * @model opposite="isPerformedBy"
	 * @generated
	 */
	EList<Function> getPerforms();

	/**
	 * Returns the value of the '<em><b>Leads</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.organizationchart.OrganizationalStructure}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leads</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leads</em>' reference list.
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartPackage#getEmployee_Leads()
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getManager
	 * @model opposite="manager"
	 * @generated
	 */
	EList<OrganizationalStructure> getLeads();

} // Employee
