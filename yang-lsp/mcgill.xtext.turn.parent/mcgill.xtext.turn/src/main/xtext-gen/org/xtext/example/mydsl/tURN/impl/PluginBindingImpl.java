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

import org.xtext.example.mydsl.tURN.Binding;
import org.xtext.example.mydsl.tURN.Condition;
import org.xtext.example.mydsl.tURN.PluginBinding;
import org.xtext.example.mydsl.tURN.TURNPackage;
import org.xtext.example.mydsl.tURN.UCMmap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.tURN.impl.PluginBindingImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.impl.PluginBindingImpl#getReplication <em>Replication</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.impl.PluginBindingImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.impl.PluginBindingImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.impl.PluginBindingImpl#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PluginBindingImpl extends MinimalEObjectImpl.Container implements PluginBinding
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Condition condition;

  /**
   * The default value of the '{@link #getReplication() <em>Replication</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReplication()
   * @generated
   * @ordered
   */
  protected static final int REPLICATION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getReplication() <em>Replication</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReplication()
   * @generated
   * @ordered
   */
  protected int replication = REPLICATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getMap() <em>Map</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMap()
   * @generated
   * @ordered
   */
  protected UCMmap map;

  /**
   * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinding()
   * @generated
   * @ordered
   */
  protected Binding binding;

  /**
   * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindings()
   * @generated
   * @ordered
   */
  protected EList<Binding> bindings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PluginBindingImpl()
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
    return TURNPackage.Literals.PLUGIN_BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs)
  {
    Condition oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TURNPackage.PLUGIN_BINDING__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(Condition newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TURNPackage.PLUGIN_BINDING__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TURNPackage.PLUGIN_BINDING__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TURNPackage.PLUGIN_BINDING__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getReplication()
  {
    return replication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReplication(int newReplication)
  {
    int oldReplication = replication;
    replication = newReplication;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TURNPackage.PLUGIN_BINDING__REPLICATION, oldReplication, replication));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UCMmap getMap()
  {
    if (map != null && map.eIsProxy())
    {
      InternalEObject oldMap = (InternalEObject)map;
      map = (UCMmap)eResolveProxy(oldMap);
      if (map != oldMap)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TURNPackage.PLUGIN_BINDING__MAP, oldMap, map));
      }
    }
    return map;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UCMmap basicGetMap()
  {
    return map;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMap(UCMmap newMap)
  {
    UCMmap oldMap = map;
    map = newMap;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TURNPackage.PLUGIN_BINDING__MAP, oldMap, map));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding getBinding()
  {
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBinding(Binding newBinding, NotificationChain msgs)
  {
    Binding oldBinding = binding;
    binding = newBinding;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TURNPackage.PLUGIN_BINDING__BINDING, oldBinding, newBinding);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBinding(Binding newBinding)
  {
    if (newBinding != binding)
    {
      NotificationChain msgs = null;
      if (binding != null)
        msgs = ((InternalEObject)binding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TURNPackage.PLUGIN_BINDING__BINDING, null, msgs);
      if (newBinding != null)
        msgs = ((InternalEObject)newBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TURNPackage.PLUGIN_BINDING__BINDING, null, msgs);
      msgs = basicSetBinding(newBinding, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TURNPackage.PLUGIN_BINDING__BINDING, newBinding, newBinding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Binding> getBindings()
  {
    if (bindings == null)
    {
      bindings = new EObjectContainmentEList<Binding>(Binding.class, this, TURNPackage.PLUGIN_BINDING__BINDINGS);
    }
    return bindings;
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
      case TURNPackage.PLUGIN_BINDING__CONDITION:
        return basicSetCondition(null, msgs);
      case TURNPackage.PLUGIN_BINDING__BINDING:
        return basicSetBinding(null, msgs);
      case TURNPackage.PLUGIN_BINDING__BINDINGS:
        return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
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
      case TURNPackage.PLUGIN_BINDING__CONDITION:
        return getCondition();
      case TURNPackage.PLUGIN_BINDING__REPLICATION:
        return getReplication();
      case TURNPackage.PLUGIN_BINDING__MAP:
        if (resolve) return getMap();
        return basicGetMap();
      case TURNPackage.PLUGIN_BINDING__BINDING:
        return getBinding();
      case TURNPackage.PLUGIN_BINDING__BINDINGS:
        return getBindings();
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
      case TURNPackage.PLUGIN_BINDING__CONDITION:
        setCondition((Condition)newValue);
        return;
      case TURNPackage.PLUGIN_BINDING__REPLICATION:
        setReplication((Integer)newValue);
        return;
      case TURNPackage.PLUGIN_BINDING__MAP:
        setMap((UCMmap)newValue);
        return;
      case TURNPackage.PLUGIN_BINDING__BINDING:
        setBinding((Binding)newValue);
        return;
      case TURNPackage.PLUGIN_BINDING__BINDINGS:
        getBindings().clear();
        getBindings().addAll((Collection<? extends Binding>)newValue);
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
      case TURNPackage.PLUGIN_BINDING__CONDITION:
        setCondition((Condition)null);
        return;
      case TURNPackage.PLUGIN_BINDING__REPLICATION:
        setReplication(REPLICATION_EDEFAULT);
        return;
      case TURNPackage.PLUGIN_BINDING__MAP:
        setMap((UCMmap)null);
        return;
      case TURNPackage.PLUGIN_BINDING__BINDING:
        setBinding((Binding)null);
        return;
      case TURNPackage.PLUGIN_BINDING__BINDINGS:
        getBindings().clear();
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
      case TURNPackage.PLUGIN_BINDING__CONDITION:
        return condition != null;
      case TURNPackage.PLUGIN_BINDING__REPLICATION:
        return replication != REPLICATION_EDEFAULT;
      case TURNPackage.PLUGIN_BINDING__MAP:
        return map != null;
      case TURNPackage.PLUGIN_BINDING__BINDING:
        return binding != null;
      case TURNPackage.PLUGIN_BINDING__BINDINGS:
        return bindings != null && !bindings.isEmpty();
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
    result.append(" (replication: ");
    result.append(replication);
    result.append(')');
    return result.toString();
  }

} //PluginBindingImpl
