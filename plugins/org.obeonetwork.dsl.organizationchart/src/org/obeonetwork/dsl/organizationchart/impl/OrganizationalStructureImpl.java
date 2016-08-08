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
package org.obeonetwork.dsl.organizationchart.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.organizationchart.Employee;
import org.obeonetwork.dsl.organizationchart.Function;
import org.obeonetwork.dsl.organizationchart.OrganizationChartPackage;
import org.obeonetwork.dsl.organizationchart.OrganizationalStructure;
import org.obeonetwork.dsl.organizationchart.StructureType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organizational Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.impl.OrganizationalStructureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.impl.OrganizationalStructureImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.impl.OrganizationalStructureImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.impl.OrganizationalStructureImpl#getSubStructures <em>Sub Structures</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.impl.OrganizationalStructureImpl#getOwns <em>Owns</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.impl.OrganizationalStructureImpl#getManager <em>Manager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganizationalStructureImpl extends EObjectImpl implements OrganizationalStructure {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmployees() <em>Employees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> employees;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final StructureType TYPE_EDEFAULT = StructureType.TEAM;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected StructureType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubStructures() <em>Sub Structures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganizationalStructure> subStructures;

	/**
	 * The cached value of the '{@link #getOwns() <em>Owns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwns()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> owns;

	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected Employee manager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationalStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganizationChartPackage.Literals.ORGANIZATIONAL_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getEmployees() {
		if (employees == null) {
			employees = new EObjectWithInverseResolvingEList<Employee>(Employee.class, this, OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__EMPLOYEES, OrganizationChartPackage.EMPLOYEE__BELONGS_TO);
		}
		return employees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(StructureType newType) {
		StructureType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationalStructure> getSubStructures() {
		if (subStructures == null) {
			subStructures = new EObjectContainmentEList<OrganizationalStructure>(OrganizationalStructure.class, this, OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__SUB_STRUCTURES);
		}
		return subStructures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getOwns() {
		if (owns == null) {
			owns = new EObjectContainmentEList<Function>(Function.class, this, OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__OWNS);
		}
		return owns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee getManager() {
		if (manager != null && manager.eIsProxy()) {
			InternalEObject oldManager = (InternalEObject)manager;
			manager = (Employee)eResolveProxy(oldManager);
			if (manager != oldManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__MANAGER, oldManager, manager));
			}
		}
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee basicGetManager() {
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManager(Employee newManager, NotificationChain msgs) {
		Employee oldManager = manager;
		manager = newManager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__MANAGER, oldManager, newManager);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManager(Employee newManager) {
		if (newManager != manager) {
			NotificationChain msgs = null;
			if (manager != null)
				msgs = ((InternalEObject)manager).eInverseRemove(this, OrganizationChartPackage.EMPLOYEE__LEADS, Employee.class, msgs);
			if (newManager != null)
				msgs = ((InternalEObject)newManager).eInverseAdd(this, OrganizationChartPackage.EMPLOYEE__LEADS, Employee.class, msgs);
			msgs = basicSetManager(newManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__MANAGER, newManager, newManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__EMPLOYEES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmployees()).basicAdd(otherEnd, msgs);
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__MANAGER:
				if (manager != null)
					msgs = ((InternalEObject)manager).eInverseRemove(this, OrganizationChartPackage.EMPLOYEE__LEADS, Employee.class, msgs);
				return basicSetManager((Employee)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__EMPLOYEES:
				return ((InternalEList<?>)getEmployees()).basicRemove(otherEnd, msgs);
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__SUB_STRUCTURES:
				return ((InternalEList<?>)getSubStructures()).basicRemove(otherEnd, msgs);
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__OWNS:
				return ((InternalEList<?>)getOwns()).basicRemove(otherEnd, msgs);
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__MANAGER:
				return basicSetManager(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__NAME:
				return getName();
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__EMPLOYEES:
				return getEmployees();
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__TYPE:
				return getType();
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__SUB_STRUCTURES:
				return getSubStructures();
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__OWNS:
				return getOwns();
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__MANAGER:
				if (resolve) return getManager();
				return basicGetManager();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__NAME:
				setName((String)newValue);
				return;
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__EMPLOYEES:
				getEmployees().clear();
				getEmployees().addAll((Collection<? extends Employee>)newValue);
				return;
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__TYPE:
				setType((StructureType)newValue);
				return;
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__SUB_STRUCTURES:
				getSubStructures().clear();
				getSubStructures().addAll((Collection<? extends OrganizationalStructure>)newValue);
				return;
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__OWNS:
				getOwns().clear();
				getOwns().addAll((Collection<? extends Function>)newValue);
				return;
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__MANAGER:
				setManager((Employee)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__EMPLOYEES:
				getEmployees().clear();
				return;
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__SUB_STRUCTURES:
				getSubStructures().clear();
				return;
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__OWNS:
				getOwns().clear();
				return;
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__MANAGER:
				setManager((Employee)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__EMPLOYEES:
				return employees != null && !employees.isEmpty();
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__TYPE:
				return type != TYPE_EDEFAULT;
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__SUB_STRUCTURES:
				return subStructures != null && !subStructures.isEmpty();
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__OWNS:
				return owns != null && !owns.isEmpty();
			case OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__MANAGER:
				return manager != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //OrganizationalStructureImpl
