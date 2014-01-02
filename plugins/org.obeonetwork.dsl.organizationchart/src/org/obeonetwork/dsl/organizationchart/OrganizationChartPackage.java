/**
 */
package org.obeonetwork.dsl.organizationchart;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Manages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__MANAGES = 3;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Is In Charge Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__IS_IN_CHARGE_OF = 6;

	/**
	 * The feature id for the '<em><b>Trigraph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__TRIGRAPH = 7;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__MANAGER = 8;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = 9;

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
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__SERVICES = 1;

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
	 * The meta object id for the '{@link org.obeonetwork.dsl.organizationchart.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.organizationchart.impl.ServiceImpl
	 * @see org.obeonetwork.dsl.organizationchart.impl.OrganizationChartPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__EMPLOYEES = 1;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__MANAGER = 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 3;

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
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.organizationchart.Employee#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Employee#getFunction()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Function();

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
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.organizationchart.Employee#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Employee#getService()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Service();

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
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.organizationchart.Employee#getIsInChargeOf <em>Is In Charge Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is In Charge Of</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Employee#getIsInChargeOf()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_IsInChargeOf();

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
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.organizationchart.Organization#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Organization#getServices()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Services();

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
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.organizationchart.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.organizationchart.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.organizationchart.Service#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Employees</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Service#getEmployees()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Employees();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.organizationchart.Service#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Manager</em>'.
	 * @see org.obeonetwork.dsl.organizationchart.Service#getManager()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Manager();

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
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__FUNCTION = eINSTANCE.getEmployee_Function();

		/**
		 * The meta object literal for the '<em><b>Manages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__MANAGES = eINSTANCE.getEmployee_Manages();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__SERVICE = eINSTANCE.getEmployee_Service();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__LOCATION = eINSTANCE.getEmployee_Location();

		/**
		 * The meta object literal for the '<em><b>Is In Charge Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__IS_IN_CHARGE_OF = eINSTANCE.getEmployee_IsInChargeOf();

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
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__SERVICES = eINSTANCE.getOrganization_Services();

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
		 * The meta object literal for the '{@link org.obeonetwork.dsl.organizationchart.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.organizationchart.impl.ServiceImpl
		 * @see org.obeonetwork.dsl.organizationchart.impl.OrganizationChartPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__EMPLOYEES = eINSTANCE.getService_Employees();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__MANAGER = eINSTANCE.getService_Manager();

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

	}

} //OrganizationChartPackage
