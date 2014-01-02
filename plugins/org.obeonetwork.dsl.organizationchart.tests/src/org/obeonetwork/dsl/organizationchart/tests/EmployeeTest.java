/**
 */
package org.obeonetwork.dsl.organizationchart.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.obeonetwork.dsl.organizationchart.Employee;
import org.obeonetwork.dsl.organizationchart.OrganizationChartFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmployeeTest extends TestCase {

	/**
	 * The fixture for this Employee test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Employee fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EmployeeTest.class);
	}

	/**
	 * Constructs a new Employee test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Employee test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Employee fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Employee test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Employee getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OrganizationChartFactory.eINSTANCE.createEmployee());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EmployeeTest
