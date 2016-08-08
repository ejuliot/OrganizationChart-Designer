/**
 */
package org.obeonetwork.dsl.organizationchart;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.organizationchart.OrganizationChartFactory
 * @model kind="package"
 * @generated
 */
public interface OrganizationChartPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "organizationchart";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.obeonetwork.org/dsl/organizationchart/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "organizationChart";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrganizationChartPackage eINSTANCE = org.obeonetwork.dsl.organizationchart.impl.OrganizationChartPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.organizationchart.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.organizationchart.impl.EmployeeImpl
	 * @see org.obeonetwork.dsl.organizationchart.impl.OrganizationChartPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 0;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__FIRSTNAME = 0;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__LASTNAME = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Manages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__MANAGES = 3;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__BELONGS_TO = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Trigraph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__TRIGRAPH = 6;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__MANAGER = 7;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__PERFORMS = 8;

	/**
	 * The feature id for the '<em><b>Leads</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__LEADS = 9;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.organizationchart.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.organizationchart.impl.OrganizationImpl
	 * @see org.obeonetwork.dsl.organizationchart.impl.OrganizationChartPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 1;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__EMPLOYEES = 0;

	/**
	 * The feature id for the '<em><b>Structures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__STRUCTURES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__LOCATIONS = 3;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.organizationchart.impl.OrganizationalStructureImpl <em>Organizational Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.organizationchart.impl.OrganizationalStructureImpl
	 * @see org.obeonetwork.dsl.organizationchart.impl.OrganizationChartPackageImpl#getOrganizationalStructure()
	 * @generated
	 */
	int ORGANIZATIONAL_STRUCTURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_STRUCTURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_STRUCTURE__EMPLOYEES = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_STRUCTURE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Sub Structures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_STRUCTURE__SUB_STRUCTURES = 3;

	/**
	 * The feature id for the '<em><b>Owns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_STRUCTURE__OWNS = 4;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_STRUCTURE__MANAGER = 5;

	/**
	 * The number of structural features of the '<em>Organizational Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATIONAL_STRUCTURE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.organizationchart.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.organizationchart.impl.LocationImpl
	 * @see org.obeonetwork.dsl.organizationchart.impl.OrganizationChartPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__EMPLOYEES = 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.organizationchart.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.organizationchart.impl.FunctionImpl
	 * @see org.obeonetwork.dsl.organizationchart.impl.OrganizationChartPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Performed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IS_PERFORMED_BY = 1;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.organizationchart.StructureType <em>Structure Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.organizationchart.StructureType
	 * @see org.obeonetwork.dsl.organizationchart.impl.OrganizationChartPackageImpl#getStructureType()
	 * @generated
	 */
	int STRUCTURE_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.organizationchart.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.organizationchart.Employee#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Employee#getFirstname()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.organizationchart.Employee#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Employee#getLastname()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Lastname();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.organizationchart.Employee#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Employee#getTitle()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Title();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.organizationchart.Employee#getManages <em>Manages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Manages</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Employee#getManages()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Manages();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.organizationchart.Employee#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Employee#getBelongsTo()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_BelongsTo();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.organizationchart.Employee#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Employee#getLocation()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.organizationchart.Employee#getTrigraph <em>Trigraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigraph</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Employee#getTrigraph()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Trigraph();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.organizationchart.Employee#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Manager</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Employee#getManager()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Manager();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.organizationchart.Employee#getPerforms <em>Performs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Performs</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Employee#getPerforms()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Performs();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.organizationchart.Employee#getLeads <em>Leads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Leads</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Employee#getLeads()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Leads();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.organizationchart.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.organizationchart.Organization#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employees</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Organization#getEmployees()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Employees();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.organizationchart.Organization#getStructures <em>Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structures</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Organization#getStructures()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Structures();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.organizationchart.Organization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Organization#getName()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.organizationchart.Organization#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Organization#getLocations()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Locations();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.organizationchart.OrganizationalStructure <em>Organizational Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organizational Structure</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationalStructure
	 * @generated
	 */
	EClass getOrganizationalStructure();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getName()
	 * @see #getOrganizationalStructure()
	 * @generated
	 */
	EAttribute getOrganizationalStructure_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Employees</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getEmployees()
	 * @see #getOrganizationalStructure()
	 * @generated
	 */
	EReference getOrganizationalStructure_Employees();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getType()
	 * @see #getOrganizationalStructure()
	 * @generated
	 */
	EAttribute getOrganizationalStructure_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getSubStructures <em>Sub Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Structures</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getSubStructures()
	 * @see #getOrganizationalStructure()
	 * @generated
	 */
	EReference getOrganizationalStructure_SubStructures();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getOwns <em>Owns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owns</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getOwns()
	 * @see #getOrganizationalStructure()
	 * @generated
	 */
	EReference getOrganizationalStructure_Owns();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Manager</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.OrganizationalStructure#getManager()
	 * @see #getOrganizationalStructure()
	 * @generated
	 */
	EReference getOrganizationalStructure_Manager();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.organizationchart.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.organizationchart.Location#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Location#getName()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.organizationchart.Location#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Employees</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Location#getEmployees()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Employees();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.organizationchart.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.organizationchart.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.organizationchart.Function#getIsPerformedBy <em>Is Performed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Performed By</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Function#getIsPerformedBy()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_IsPerformedBy();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.organizationchart.StructureType <em>Structure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Structure Type</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.StructureType
	 * @generated
	 */
	EEnum getStructureType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OrganizationChartFactory getOrganizationChartFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.organizationchart.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.organizationchart.impl.EmployeeImpl
		 * @see org.obeonetwork.dsl.organizationchart.impl.OrganizationChartPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__FIRSTNAME = eINSTANCE.getEmployee_Firstname();

		/**
		 * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__LASTNAME = eINSTANCE.getEmployee_Lastname();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__TITLE = eINSTANCE.getEmployee_Title();

		/**
		 * The meta object literal for the '<em><b>Manages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__MANAGES = eINSTANCE.getEmployee_Manages();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__BELONGS_TO = eINSTANCE.getEmployee_BelongsTo();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__LOCATION = eINSTANCE.getEmployee_Location();

		/**
		 * The meta object literal for the '<em><b>Trigraph</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__TRIGRAPH = eINSTANCE.getEmployee_Trigraph();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__MANAGER = eINSTANCE.getEmployee_Manager();

		/**
		 * The meta object literal for the '<em><b>Performs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__PERFORMS = eINSTANCE.getEmployee_Performs();

		/**
		 * The meta object literal for the '<em><b>Leads</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__LEADS = eINSTANCE.getEmployee_Leads();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.organizationchart.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.organizationchart.impl.OrganizationImpl
		 * @see org.obeonetwork.dsl.organizationchart.impl.OrganizationChartPackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__EMPLOYEES = eINSTANCE.getOrganization_Employees();

		/**
		 * The meta object literal for the '<em><b>Structures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__STRUCTURES = eINSTANCE.getOrganization_Structures();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__NAME = eINSTANCE.getOrganization_Name();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__LOCATIONS = eINSTANCE.getOrganization_Locations();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.organizationchart.impl.OrganizationalStructureImpl <em>Organizational Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.organizationchart.impl.OrganizationalStructureImpl
		 * @see org.obeonetwork.dsl.organizationchart.impl.OrganizationChartPackageImpl#getOrganizationalStructure()
		 * @generated
		 */
		EClass ORGANIZATIONAL_STRUCTURE = eINSTANCE.getOrganizationalStructure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATIONAL_STRUCTURE__NAME = eINSTANCE.getOrganizationalStructure_Name();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATIONAL_STRUCTURE__EMPLOYEES = eINSTANCE.getOrganizationalStructure_Employees();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATIONAL_STRUCTURE__TYPE = eINSTANCE.getOrganizationalStructure_Type();

		/**
		 * The meta object literal for the '<em><b>Sub Structures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATIONAL_STRUCTURE__SUB_STRUCTURES = eINSTANCE.getOrganizationalStructure_SubStructures();

		/**
		 * The meta object literal for the '<em><b>Owns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATIONAL_STRUCTURE__OWNS = eINSTANCE.getOrganizationalStructure_Owns();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATIONAL_STRUCTURE__MANAGER = eINSTANCE.getOrganizationalStructure_Manager();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.organizationchart.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.organizationchart.impl.LocationImpl
		 * @see org.obeonetwork.dsl.organizationchart.impl.OrganizationChartPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__NAME = eINSTANCE.getLocation_Name();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__EMPLOYEES = eINSTANCE.getLocation_Employees();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.organizationchart.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.organizationchart.impl.FunctionImpl
		 * @see org.obeonetwork.dsl.organizationchart.impl.OrganizationChartPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Is Performed By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__IS_PERFORMED_BY = eINSTANCE.getFunction_IsPerformedBy();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.organizationchart.StructureType <em>Structure Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.organizationchart.StructureType
		 * @see org.obeonetwork.dsl.organizationchart.impl.OrganizationChartPackageImpl#getStructureType()
		 * @generated
		 */
		EEnum STRUCTURE_TYPE = eINSTANCE.getStructureType();

	}

} //OrganizationChartPackage
