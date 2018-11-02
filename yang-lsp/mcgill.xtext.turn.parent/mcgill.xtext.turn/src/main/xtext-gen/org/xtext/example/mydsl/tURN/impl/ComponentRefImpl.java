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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.tURN.BoundOption;
import org.xtext.example.mydsl.tURN.COMPONENTKIND;
import org.xtext.example.mydsl.tURN.ComponentRef;
import org.xtext.example.mydsl.tURN.LongName;
import org.xtext.example.mydsl.tURN.TURNPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.tURN.impl.ComponentRefImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.impl.ComponentRefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.impl.ComponentRefImpl#getLongName <em>Long Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.impl.ComponentRefImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.impl.ComponentRefImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentRefImpl extends URNmodelElementImpl implements ComponentRef
{
  /**
   * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected static final COMPONENTKIND KIND_EDEFAULT = COMPONENTKIND.TEAM;

  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected COMPONENTKIND kind = KIND_EDEFAULT;

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
   * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected BoundOption element;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<BoundOption> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentRefImpl()
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
    return TURNPackage.Literals.COMPONENT_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public COMPONENTKIND getKind()
  {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKind(COMPONENTKIND newKind)
  {
    COMPONENTKIND oldKind = kind;
    kind = newKind == null ? KIND_EDEFAULT : newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TURNPackage.COMPONENT_REF__KIND, oldKind, kind));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TURNPackage.COMPONENT_REF__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TURNPackage.COMPONENT_REF__LONG_NAME, oldLongName, newLongName);
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
        msgs = ((InternalEObject)longName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TURNPackage.COMPONENT_REF__LONG_NAME, null, msgs);
      if (newLongName != null)
        msgs = ((InternalEObject)newLongName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TURNPackage.COMPONENT_REF__LONG_NAME, null, msgs);
      msgs = basicSetLongName(newLongName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TURNPackage.COMPONENT_REF__LONG_NAME, newLongName, newLongName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoundOption getElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElement(BoundOption newElement, NotificationChain msgs)
  {
    BoundOption oldElement = element;
    element = newElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TURNPackage.COMPONENT_REF__ELEMENT, oldElement, newElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(BoundOption newElement)
  {
    if (newElement != element)
    {
      NotificationChain msgs = null;
      if (element != null)
        msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TURNPackage.COMPONENT_REF__ELEMENT, null, msgs);
      if (newElement != null)
        msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TURNPackage.COMPONENT_REF__ELEMENT, null, msgs);
      msgs = basicSetElement(newElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TURNPackage.COMPONENT_REF__ELEMENT, newElement, newElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BoundOption> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<BoundOption>(BoundOption.class, this, TURNPackage.COMPONENT_REF__ELEMENTS);
    }
    return elements;
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
      case TURNPackage.COMPONENT_REF__LONG_NAME:
        return basicSetLongName(null, msgs);
      case TURNPackage.COMPONENT_REF__ELEMENT:
        return basicSetElement(null, msgs);
      case TURNPackage.COMPONENT_REF__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case TURNPackage.COMPONENT_REF__KIND:
        return getKind();
      case TURNPackage.COMPONENT_REF__NAME:
        return getName();
      case TURNPackage.COMPONENT_REF__LONG_NAME:
        return getLongName();
      case TURNPackage.COMPONENT_REF__ELEMENT:
        return getElement();
      case TURNPackage.COMPONENT_REF__ELEMENTS:
        return getElements();
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
      case TURNPackage.COMPONENT_REF__KIND:
        setKind((COMPONENTKIND)newValue);
        return;
      case TURNPackage.COMPONENT_REF__NAME:
        setName((String)newValue);
        return;
      case TURNPackage.COMPONENT_REF__LONG_NAME:
        setLongName((LongName)newValue);
        return;
      case TURNPackage.COMPONENT_REF__ELEMENT:
        setElement((BoundOption)newValue);
        return;
      case TURNPackage.COMPONENT_REF__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends BoundOption>)newValue);
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
      case TURNPackage.COMPONENT_REF__KIND:
        setKind(KIND_EDEFAULT);
        return;
      case TURNPackage.COMPONENT_REF__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TURNPackage.COMPONENT_REF__LONG_NAME:
        setLongName((LongName)null);
        return;
      case TURNPackage.COMPONENT_REF__ELEMENT:
        setElement((BoundOption)null);
        return;
      case TURNPackage.COMPONENT_REF__ELEMENTS:
        getElements().clear();
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
      case TURNPackage.COMPONENT_REF__KIND:
        return kind != KIND_EDEFAULT;
      case TURNPackage.COMPONENT_REF__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TURNPackage.COMPONENT_REF__LONG_NAME:
        return longName != null;
      case TURNPackage.COMPONENT_REF__ELEMENT:
        return element != null;
      case TURNPackage.COMPONENT_REF__ELEMENTS:
        return elements != null && !elements.isEmpty();
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
    result.append(" (kind: ");
    result.append(kind);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ComponentRefImpl
