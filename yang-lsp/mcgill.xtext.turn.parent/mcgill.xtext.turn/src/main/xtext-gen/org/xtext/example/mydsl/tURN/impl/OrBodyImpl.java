/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.tURN.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.tURN.OrBody;
import org.xtext.example.mydsl.tURN.PathBody;
import org.xtext.example.mydsl.tURN.RegularOrFork;
import org.xtext.example.mydsl.tURN.TURNPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Or Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.tURN.impl.OrBodyImpl#getElseBody <em>Else Body</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.impl.OrBodyImpl#getRegularBody <em>Regular Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrBodyImpl extends MinimalEObjectImpl.Container implements OrBody
{
  /**
   * The cached value of the '{@link #getElseBody() <em>Else Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseBody()
   * @generated
   * @ordered
   */
  protected PathBody elseBody;

  /**
   * The cached value of the '{@link #getRegularBody() <em>Regular Body</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegularBody()
   * @generated
   * @ordered
   */
  protected EList<RegularOrFork> regularBody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrBodyImpl()
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
    return TURNPackage.Literals.OR_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathBody getElseBody()
  {
    return elseBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseBody(PathBody newElseBody, NotificationChain msgs)
  {
    PathBody oldElseBody = elseBody;
    elseBody = newElseBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TURNPackage.OR_BODY__ELSE_BODY, oldElseBody, newElseBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseBody(PathBody newElseBody)
  {
    if (newElseBody != elseBody)
    {
      NotificationChain msgs = null;
      if (elseBody != null)
        msgs = ((InternalEObject)elseBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TURNPackage.OR_BODY__ELSE_BODY, null, msgs);
      if (newElseBody != null)
        msgs = ((InternalEObject)newElseBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TURNPackage.OR_BODY__ELSE_BODY, null, msgs);
      msgs = basicSetElseBody(newElseBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TURNPackage.OR_BODY__ELSE_BODY, newElseBody, newElseBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RegularOrFork> getRegularBody()
  {
    if (regularBody == null)
    {
      regularBody = new EObjectContainmentEList<RegularOrFork>(RegularOrFork.class, this, TURNPackage.OR_BODY__REGULAR_BODY);
    }
    return regularBody;
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
      case TURNPackage.OR_BODY__ELSE_BODY:
        return basicSetElseBody(null, msgs);
      case TURNPackage.OR_BODY__REGULAR_BODY:
        return ((InternalEList<?>)getRegularBody()).basicRemove(otherEnd, msgs);
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
      case TURNPackage.OR_BODY__ELSE_BODY:
        return getElseBody();
      case TURNPackage.OR_BODY__REGULAR_BODY:
        return getRegularBody();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TURNPackage.OR_BODY__ELSE_BODY:
        setElseBody((PathBody)newValue);
        return;
      case TURNPackage.OR_BODY__REGULAR_BODY:
        getRegularBody().clear();
        getRegularBody().addAll((Collection<? extends RegularOrFork>)newValue);
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
      case TURNPackage.OR_BODY__ELSE_BODY:
        setElseBody((PathBody)null);
        return;
      case TURNPackage.OR_BODY__REGULAR_BODY:
        getRegularBody().clear();
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
      case TURNPackage.OR_BODY__ELSE_BODY:
        return elseBody != null;
      case TURNPackage.OR_BODY__REGULAR_BODY:
        return regularBody != null && !regularBody.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OrBodyImpl
