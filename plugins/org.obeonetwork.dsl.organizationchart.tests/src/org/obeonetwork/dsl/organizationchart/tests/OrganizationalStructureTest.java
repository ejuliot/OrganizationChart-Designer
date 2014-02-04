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
package org.obeonetwork.dsl.organizationchart.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.obeonetwork.dsl.organizationchart.OrganizationChartFactory;
import org.obeonetwork.dsl.organizationchart.OrganizationalStructure;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Organizational Structure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrganizationalStructureTest extends TestCase {

	/**
	 * The fixture for this Organizational Structure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationalStructure fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrganizationalStructureTest.class);
	}

	/**
	 * Constructs a new Organizational Structure test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationalStructureTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Organizational Structure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OrganizationalStructure fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Organizational Structure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationalStructure getFixture() {
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
		setFixture(OrganizationChartFactory.eINSTANCE.createOrganizationalStructure());
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

} //OrganizationalStructureTest
