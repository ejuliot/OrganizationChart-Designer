/**
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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.organizationchart.Employee;
import org.obeonetwork.dsl.organizationchart.Function;
import org.obeonetwork.dsl.organizationchart.Location;
import org.obeonetwork.dsl.organizationchart.OrganizationChartPackage;
import org.obeonetwork.dsl.organizationchart.OrganizationalStructure;
import org.obeonetwork.dsl.organizationchart.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.impl.EmployeeImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.impl.EmployeeImpl#getLastname <em>Lastname</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.impl.EmployeeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.impl.EmployeeImpl#getManages <em>Manages</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.impl.EmployeeImpl#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.impl.EmployeeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.impl.EmployeeImpl#getTrigraph <em>Trigraph</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.impl.EmployeeImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.organizationchart.impl.EmployeeImpl#getPerforms <em>Performs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmployeeImpl extends EObjectImpl implements Employee {
	/**
	 * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected String firstname = FIRSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected static final String LASTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected String lastname = LASTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getManages() <em>Manages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManages()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> manages;

	/**
	 * The cached value of the '{@link #getBelongsTo() <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongsTo()
	 * @generated
	 * @ordered
	 */
	protected OrganizationalStructure belongsTo;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The default value of the '{@link #getTrigraph() <em>Trigraph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigraph()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGRAPH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrigraph() <em>Trigraph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigraph()
	 * @generated
	 * @ordered
	 */
	protected String trigraph = TRIGRAPH_EDEFAULT;

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
	 * The cached value of the '{@link #getPerforms() <em>Performs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerforms()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> performs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganizationChartPackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstname(String newFirstname) {
		String oldFirstname = firstname;
		firstname = newFirstname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationChartPackage.EMPLOYEE__FIRSTNAME, oldFirstname, firstname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastname(String newLastname) {
		String oldLastname = lastname;
		lastname = newLastname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationChartPackage.EMPLOYEE__LASTNAME, oldLastname, lastname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationChartPackage.EMPLOYEE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getManages() {
		if (manages == null) {
			manages = new EObjectWithInverseResolvingEList<Employee>(Employee.class, this, OrganizationChartPackage.EMPLOYEE__MANAGES, OrganizationChartPackage.EMPLOYEE__MANAGER);
		}
		return manages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationalStructure getBelongsTo() {
		if (belongsTo != null && belongsTo.eIsProxy()) {
			InternalEObject oldBelongsTo = (InternalEObject)belongsTo;
			belongsTo = (OrganizationalStructure)eResolveProxy(oldBelongsTo);
			if (belongsTo != oldBelongsTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrganizationChartPackage.EMPLOYEE__BELONGS_TO, oldBelongsTo, belongsTo));
			}
		}
		return belongsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationalStructure basicGetBelongsTo() {
		return belongsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBelongsTo(OrganizationalStructure newBelongsTo, NotificationChain msgs) {
		OrganizationalStructure oldBelongsTo = belongsTo;
		belongsTo = newBelongsTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrganizationChartPackage.EMPLOYEE__BELONGS_TO, oldBelongsTo, newBelongsTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsTo(OrganizationalStructure newBelongsTo) {
		if (newBelongsTo != belongsTo) {
			NotificationChain msgs = null;
			if (belongsTo != null)
				msgs = ((InternalEObject)belongsTo).eInverseRemove(this, OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__EMPLOYEES, OrganizationalStructure.class, msgs);
			if (newBelongsTo != null)
				msgs = ((InternalEObject)newBelongsTo).eInverseAdd(this, OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__EMPLOYEES, OrganizationalStructure.class, msgs);
			msgs = basicSetBelongsTo(newBelongsTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationChartPackage.EMPLOYEE__BELONGS_TO, newBelongsTo, newBelongsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrganizationChartPackage.EMPLOYEE__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrganizationChartPackage.EMPLOYEE__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, OrganizationChartPackage.LOCATION__EMPLOYEES, Location.class, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, OrganizationChartPackage.LOCATION__EMPLOYEES, Location.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationChartPackage.EMPLOYEE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrigraph() {
		return trigraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigraph(String newTrigraph) {
		String oldTrigraph = trigraph;
		trigraph = newTrigraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationChartPackage.EMPLOYEE__TRIGRAPH, oldTrigraph, trigraph));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrganizationChartPackage.EMPLOYEE__MANAGER, oldManager, manager));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrganizationChartPackage.EMPLOYEE__MANAGER, oldManager, newManager);
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
				msgs = ((InternalEObject)manager).eInverseRemove(this, OrganizationChartPackage.EMPLOYEE__MANAGES, Employee.class, msgs);
			if (newManager != null)
				msgs = ((InternalEObject)newManager).eInverseAdd(this, OrganizationChartPackage.EMPLOYEE__MANAGES, Employee.class, msgs);
			msgs = basicSetManager(newManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationChartPackage.EMPLOYEE__MANAGER, newManager, newManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getPerforms() {
		if (performs == null) {
			performs = new EObjectWithInverseResolvingEList.ManyInverse<Function>(Function.class, this, OrganizationChartPackage.EMPLOYEE__PERFORMS, OrganizationChartPackage.FUNCTION__IS_PERFORMED_BY);
		}
		return performs;
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
			case OrganizationChartPackage.EMPLOYEE__MANAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getManages()).basicAdd(otherEnd, msgs);
			case OrganizationChartPackage.EMPLOYEE__BELONGS_TO:
				if (belongsTo != null)
					msgs = ((InternalEObject)belongsTo).eInverseRemove(this, OrganizationChartPackage.ORGANIZATIONAL_STRUCTURE__EMPLOYEES, OrganizationalStructure.class, msgs);
				return basicSetBelongsTo((OrganizationalStructure)otherEnd, msgs);
			case OrganizationChartPackage.EMPLOYEE__LOCATION:
				if (location != null)
					msgs = ((InternalEObject)location).eInverseRemove(this, OrganizationChartPackage.LOCATION__EMPLOYEES, Location.class, msgs);
				return basicSetLocation((Location)otherEnd, msgs);
			case OrganizationChartPackage.EMPLOYEE__MANAGER:
				if (manager != null)
					msgs = ((InternalEObject)manager).eInverseRemove(this, OrganizationChartPackage.EMPLOYEE__MANAGES, Employee.class, msgs);
				return basicSetManager((Employee)otherEnd, msgs);
			case OrganizationChartPackage.EMPLOYEE__PERFORMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPerforms()).basicAdd(otherEnd, msgs);
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
			case OrganizationChartPackage.EMPLOYEE__MANAGES:
				return ((InternalEList<?>)getManages()).basicRemove(otherEnd, msgs);
			case OrganizationChartPackage.EMPLOYEE__BELONGS_TO:
				return basicSetBelongsTo(null, msgs);
			case OrganizationChartPackage.EMPLOYEE__LOCATION:
				return basicSetLocation(null, msgs);
			case OrganizationChartPackage.EMPLOYEE__MANAGER:
				return basicSetManager(null, msgs);
			case OrganizationChartPackage.EMPLOYEE__PERFORMS:
				return ((InternalEList<?>)getPerforms()).basicRemove(otherEnd, msgs);
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
			case OrganizationChartPackage.EMPLOYEE__FIRSTNAME:
				return getFirstname();
			case OrganizationChartPackage.EMPLOYEE__LASTNAME:
				return getLastname();
			case OrganizationChartPackage.EMPLOYEE__TITLE:
				return getTitle();
			case OrganizationChartPackage.EMPLOYEE__MANAGES:
				return getManages();
			case OrganizationChartPackage.EMPLOYEE__BELONGS_TO:
				if (resolve) return getBelongsTo();
				return basicGetBelongsTo();
			case OrganizationChartPackage.EMPLOYEE__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case OrganizationChartPackage.EMPLOYEE__TRIGRAPH:
				return getTrigraph();
			case OrganizationChartPackage.EMPLOYEE__MANAGER:
				if (resolve) return getManager();
				return basicGetManager();
			case OrganizationChartPackage.EMPLOYEE__PERFORMS:
				return getPerforms();
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
			case OrganizationChartPackage.EMPLOYEE__FIRSTNAME:
				setFirstname((String)newValue);
				return;
			case OrganizationChartPackage.EMPLOYEE__LASTNAME:
				setLastname((String)newValue);
				return;
			case OrganizationChartPackage.EMPLOYEE__TITLE:
				setTitle((String)newValue);
				return;
			case OrganizationChartPackage.EMPLOYEE__MANAGES:
				getManages().clear();
				getManages().addAll((Collection<? extends Employee>)newValue);
				return;
			case OrganizationChartPackage.EMPLOYEE__BELONGS_TO:
				setBelongsTo((OrganizationalStructure)newValue);
				return;
			case OrganizationChartPackage.EMPLOYEE__LOCATION:
				setLocation((Location)newValue);
				return;
			case OrganizationChartPackage.EMPLOYEE__TRIGRAPH:
				setTrigraph((String)newValue);
				return;
			case OrganizationChartPackage.EMPLOYEE__MANAGER:
				setManager((Employee)newValue);
				return;
			case OrganizationChartPackage.EMPLOYEE__PERFORMS:
				getPerforms().clear();
				getPerforms().addAll((Collection<? extends Function>)newValue);
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
			case OrganizationChartPackage.EMPLOYEE__FIRSTNAME:
				setFirstname(FIRSTNAME_EDEFAULT);
				return;
			case OrganizationChartPackage.EMPLOYEE__LASTNAME:
				setLastname(LASTNAME_EDEFAULT);
				return;
			case OrganizationChartPackage.EMPLOYEE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case OrganizationChartPackage.EMPLOYEE__MANAGES:
				getManages().clear();
				return;
			case OrganizationChartPackage.EMPLOYEE__BELONGS_TO:
				setBelongsTo((OrganizationalStructure)null);
				return;
			case OrganizationChartPackage.EMPLOYEE__LOCATION:
				setLocation((Location)null);
				return;
			case OrganizationChartPackage.EMPLOYEE__TRIGRAPH:
				setTrigraph(TRIGRAPH_EDEFAULT);
				return;
			case OrganizationChartPackage.EMPLOYEE__MANAGER:
				setManager((Employee)null);
				return;
			case OrganizationChartPackage.EMPLOYEE__PERFORMS:
				getPerforms().clear();
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
			case OrganizationChartPackage.EMPLOYEE__FIRSTNAME:
				return FIRSTNAME_EDEFAULT == null ? firstname != null : !FIRSTNAME_EDEFAULT.equals(firstname);
			case OrganizationChartPackage.EMPLOYEE__LASTNAME:
				return LASTNAME_EDEFAULT == null ? lastname != null : !LASTNAME_EDEFAULT.equals(lastname);
			case OrganizationChartPackage.EMPLOYEE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case OrganizationChartPackage.EMPLOYEE__MANAGES:
				return manages != null && !manages.isEmpty();
			case OrganizationChartPackage.EMPLOYEE__BELONGS_TO:
				return belongsTo != null;
			case OrganizationChartPackage.EMPLOYEE__LOCATION:
				return location != null;
			case OrganizationChartPackage.EMPLOYEE__TRIGRAPH:
				return TRIGRAPH_EDEFAULT == null ? trigraph != null : !TRIGRAPH_EDEFAULT.equals(trigraph);
			case OrganizationChartPackage.EMPLOYEE__MANAGER:
				return manager != null;
			case OrganizationChartPackage.EMPLOYEE__PERFORMS:
				return performs != null && !performs.isEmpty();
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
		result.append(" (firstname: ");
		result.append(firstname);
		result.append(", lastname: ");
		result.append(lastname);
		result.append(", title: ");
		result.append(title);
		result.append(", trigraph: ");
		result.append(trigraph);
		result.append(')');
		return result.toString();
	}

} //EmployeeImpl
