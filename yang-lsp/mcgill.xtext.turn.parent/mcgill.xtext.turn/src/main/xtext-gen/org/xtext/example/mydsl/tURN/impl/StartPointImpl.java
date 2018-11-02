/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.tURN.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.tURN.Condition;
import org.xtext.example.mydsl.tURN.LongName;
import org.xtext.example.mydsl.tURN.StartPoint;
import org.xtext.example.mydsl.tURN.TURNPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.tURN.impl.StartPointImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.impl.StartPointImpl#getLongName <em>Long Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.impl.StartPointImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.impl.StartPointImpl#getFailKind <em>Fail Kind</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.impl.StartPointImpl#getCatches <em>Catches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartPointImpl extends URNmodelElementImpl implements StartPoint
{
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
   * The cached value of the '{@link #getLongName() <em>Long Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongName()
   * @generated
   * @ordered
   */
  protected LongName longName;

  /**
   * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrecondition()
   * @generated
   * @ordered
   */
  protected Condition precondition;

  /**
   * The default value of the '{@link #getFailKind() <em>Fail Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFailKind()
   * @generated
   * @ordered
   */
  protected static final String FAIL_KIND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFailKind() <em>Fail Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFailKind()
   * @generated
   * @ordered
   */
  protected String failKind = FAIL_KIND_EDEFAULT;

  /**
   * The default value of the '{@link #getCatches() <em>Catches</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCatches()
   * @generated
   * @ordered
   */
  protected static final String CATCHES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCatches() <em>Catches</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCatches()
   * @generated
   * @ordered
   */
  protected String catches = CATCHES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StartPointImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TURNPackage.Literals.START_POINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TURNPackage.START_POINT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LongName getLongName()
  {
    return longName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLongName(LongName newLongName, NotificationChain msgs)
  {
    LongName oldLongName = longName;
    longName = newLongName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TURNPackage.START_POINT__LONG_NAME, oldLongName, newLongName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLongName(LongName newLongName)
  {
    if (newLongName != longName)
    {
      NotificationChain msgs = null;
      if (longName != null)
        msgs = ((InternalEObject)longName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TURNPackage.START_POINT__LONG_NAME, null, msgs);
      if (newLongName != null)
        msgs = ((InternalEObject)newLongName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TURNPackage.START_POINT__LONG_NAME, null, msgs);
      msgs = basicSetLongName(newLongName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TURNPackage.START_POINT__LONG_NAME, newLongName, newLongName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getPrecondition()
  {
    return precondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrecondition(Condition newPrecondition, NotificationChain msgs)
  {
    Condition oldPrecondition = precondition;
    precondition = newPrecondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TURNPackage.START_POINT__PRECONDITION, oldPrecondition, newPrecondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrecondition(Condition newPrecondition)
  {
    if (newPrecondition != precondition)
    {
      NotificationChain msgs = null;
      if (precondition != null)
        msgs = ((InternalEObject)precondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TURNPackage.START_POINT__PRECONDITION, null, msgs);
      if (newPrecondition != null)
        msgs = ((InternalEObject)newPrecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TURNPackage.START_POINT__PRECONDITION, null, msgs);
      msgs = basicSetPrecondition(newPrecondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TURNPackage.START_POINT__PRECONDITION, newPrecondition, newPrecondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFailKind()
  {
    return failKind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFailKind(String newFailKind)
  {
    String oldFailKind = failKind;
    failKind = newFailKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TURNPackage.START_POINT__FAIL_KIND, oldFailKind, failKind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCatches()
  {
    return catches;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCatches(String newCatches)
  {
    String oldCatches = catches;
    catches = newCatches;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TURNPackage.START_POINT__CATCHES, oldCatches, catches));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TURNPackage.START_POINT__LONG_NAME:
        return basicSetLongName(null, msgs);
      case TURNPackage.START_POINT__PRECONDITION:
        return basicSetPrecondition(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TURNPackage.START_POINT__NAME:
        return getName();
      case TURNPackage.START_POINT__LONG_NAME:
        return getLongName();
      case TURNPackage.START_POINT__PRECONDITION:
        return getPrecondition();
      case TURNPackage.START_POINT__FAIL_KIND:
        return getFailKind();
      case TURNPackage.START_POINT__CATCHES:
        return getCatches();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TURNPackage.START_POINT__NAME:
        setName((String)newValue);
        return;
      case TURNPackage.START_POINT__LONG_NAME:
        setLongName((LongName)newValue);
        return;
      case TURNPackage.START_POINT__PRECONDITION:
        setPrecondition((Condition)newValue);
        return;
      case TURNPackage.START_POINT__FAIL_KIND:
        setFailKind((String)newValue);
        return;
      case TURNPackage.START_POINT__CATCHES:
        setCatches((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TURNPackage.START_POINT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TURNPackage.START_POINT__LONG_NAME:
        setLongName((LongName)null);
        return;
      case TURNPackage.START_POINT__PRECONDITION:
        setPrecondition((Condition)null);
        return;
      case TURNPackage.START_POINT__FAIL_KIND:
        setFailKind(FAIL_KIND_EDEFAULT);
        return;
      case TURNPackage.START_POINT__CATCHES:
        setCatches(CATCHES_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TURNPackage.START_POINT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TURNPackage.START_POINT__LONG_NAME:
        return longName != null;
      case TURNPackage.START_POINT__PRECONDITION:
        return precondition != null;
      case TURNPackage.START_POINT__FAIL_KIND:
        return FAIL_KIND_EDEFAULT == null ? failKind != null : !FAIL_KIND_EDEFAULT.equals(failKind);
      case TURNPackage.START_POINT__CATCHES:
        return CATCHES_EDEFAULT == null ? catches != null : !CATCHES_EDEFAULT.equals(catches);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", failKind: ");
    result.append(failKind);
    result.append(", catches: ");
    result.append(catches);
    result.append(')');
    return result.toString();
  }

} //StartPointImpl
