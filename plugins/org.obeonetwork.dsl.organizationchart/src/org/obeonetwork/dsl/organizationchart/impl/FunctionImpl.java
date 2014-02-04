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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.organizationchart.Employee;
import org.obeonetwork.dsl.organizationchart.Function;
import org.obeonetwork.dsl.organizationchart.OrganizationChartPackage;
import org.obeonetwork.dsl.organizationchart.OrganizationalStructure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.impl.FunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.impl.FunctionImpl#getIsPerformedBy <em>Is Performed By</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.impl.FunctionImpl#getManages <em>Manages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionImpl extends EObjectImpl implements Function {
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
	 * The cached value of the '{@link #getIsPerformedBy() <em>Is Performed By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPerformedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> isPerformedBy;

	/**
	 * The cached value of the '{@link #getManages() <em>Manages</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManages()
	 * @generated
	 * @ordered
	 */
	protected OrganizationalStructure manages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganizationChartPackage.Literals.FUNCTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationChartPackage.FUNCTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getIsPerformedBy() {
		if (isPerformedBy == null) {
			isPerformedBy = new EObjectWithInverseResolvingEList.ManyInverse<Employee>(Employee.class, this, OrganizationChartPackage.FUNCTION__IS_PERFORMED_BY, OrganizationChartPackage.EMPLOYEE__PERFORMS);
		}
		return isPerformedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationalStructure getManages() {
		if (manages != null && manages.eIsProxy()) {
			InternalEObject oldManages = (InternalEObject)manages;
			manages = (OrganizationalStructure)eResolveProxy(oldManages);
			if (manages != oldManages) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrganizationChartPackage.FUNCTION__MANAGES, oldManages, manages));
			}
		}
		return manages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationalStructure basicGetManages() {
		return manages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManages(OrganizationalStructure newManages, NotificationChain msgs) {
		OrganizationalStructure oldManages = manages;
		manages = newManages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrganizationChartPackage.FUNCTION__MANAGES, oldManages, newManages);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManages(OrganizationalStructure newManages) {
		if (newManages != manages) {
			NotificationChain msgs = null;
			if (manages != null)
				msgs = ((InternalEObject)manages).eInverseRemove(this, OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__MANAGER, OrganizationalStructure.class, msgs);
			if (newManages != null)
				msgs = ((InternalEObject)newManages).eInverseAdd(this, OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__MANAGER, OrganizationalStructure.class, msgs);
			msgs = basicSetManages(newManages, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationChartPackage.FUNCTION__MANAGES, newManages, newManages));
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
			case OrganizationChartPackage.FUNCTION__IS_PERFORMED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsPerformedBy()).basicAdd(otherEnd, msgs);
			case OrganizationChartPackage.FUNCTION__MANAGES:
				if (manages != null)
					msgs = ((InternalEObject)manages).eInverseRemove(this, OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__MANAGER, OrganizationalStructure.class, msgs);
				return basicSetManages((OrganizationalStructure)otherEnd, msgs);
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
			case OrganizationChartPackage.FUNCTION__IS_PERFORMED_BY:
				return ((InternalEList<?>)getIsPerformedBy()).basicRemove(otherEnd, msgs);
			case OrganizationChartPackage.FUNCTION__MANAGES:
				return basicSetManages(null, msgs);
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
			case OrganizationChartPackage.FUNCTION__NAME:
				return getName();
			case OrganizationChartPackage.FUNCTION__IS_PERFORMED_BY:
				return getIsPerformedBy();
			case OrganizationChartPackage.FUNCTION__MANAGES:
				if (resolve) return getManages();
				return basicGetManages();
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
			case OrganizationChartPackage.FUNCTION__NAME:
				setName((String)newValue);
				return;
			case OrganizationChartPackage.FUNCTION__IS_PERFORMED_BY:
				getIsPerformedBy().clear();
				getIsPerformedBy().addAll((Collection<? extends Employee>)newValue);
				return;
			case OrganizationChartPackage.FUNCTION__MANAGES:
				setManages((OrganizationalStructure)newValue);
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
			case OrganizationChartPackage.FUNCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OrganizationChartPackage.FUNCTION__IS_PERFORMED_BY:
				getIsPerformedBy().clear();
				return;
			case OrganizationChartPackage.FUNCTION__MANAGES:
				setManages((OrganizationalStructure)null);
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
			case OrganizationChartPackage.FUNCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OrganizationChartPackage.FUNCTION__IS_PERFORMED_BY:
				return isPerformedBy != null && !isPerformedBy.isEmpty();
			case OrganizationChartPackage.FUNCTION__MANAGES:
				return manages != null;
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
		result.append(')');
		return result.toString();
	}

} //FunctionImpl
