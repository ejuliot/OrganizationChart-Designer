/**
 */
package org.obeonetwork.dsl.organizationchart.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.obeonetwork.dsl.organizationchart.Organization;
import org.obeonetwork.dsl.organizationchart.OrganizationChartFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrganizationTest extends TestCase {

	/**
	 * The fixture for this Organization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Organization fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrganizationTest.class);
	}

	/**
	 * Constructs a new Organization test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Organization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Organization fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Organization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Organization getFixture() {
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
		setFixture(OrganizationChartFactory.eINSTANCE.createOrganization());
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

} //OrganizationTest
