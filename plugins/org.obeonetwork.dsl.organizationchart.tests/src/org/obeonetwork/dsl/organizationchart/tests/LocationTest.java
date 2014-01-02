/**
 */
package org.obeonetwork.dsl.organizationchart.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.obeonetwork.dsl.organizationchart.Location;
import org.obeonetwork.dsl.organizationchart.OrganizationChartFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocationTest extends TestCase {

	/**
	 * The fixture for this Location test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Location fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LocationTest.class);
	}

	/**
	 * Constructs a new Location test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Location test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Location fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Location test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Location getFixture() {
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
		setFixture(OrganizationChartFactory.eINSTANCE.createLocation());
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

} //LocationTest
