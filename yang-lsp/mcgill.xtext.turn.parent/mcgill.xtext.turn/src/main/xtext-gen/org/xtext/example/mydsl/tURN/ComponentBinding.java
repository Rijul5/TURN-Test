/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.tURN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.tURN.ComponentBinding#getComponentIn <em>Component In</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.ComponentBinding#getComponentOut <em>Component Out</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.tURN.TURNPackage#getComponentBinding()
 * @model
 * @generated
 */
public interface ComponentBinding extends Binding
{
  /**
   * Returns the value of the '<em><b>Component In</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component In</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component In</em>' reference.
   * @see #setComponentIn(ComponentRef)
   * @see org.xtext.example.mydsl.tURN.TURNPackage#getComponentBinding_ComponentIn()
   * @model
   * @generated
   */
  ComponentRef getComponentIn();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.tURN.ComponentBinding#getComponentIn <em>Component In</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component In</em>' reference.
   * @see #getComponentIn()
   * @generated
   */
  void setComponentIn(ComponentRef value);

  /**
   * Returns the value of the '<em><b>Component Out</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component Out</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component Out</em>' reference.
   * @see #setComponentOut(ComponentRef)
   * @see org.xtext.example.mydsl.tURN.TURNPackage#getComponentBinding_ComponentOut()
   * @model
   * @generated
   */
  ComponentRef getComponentOut();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.tURN.ComponentBinding#getComponentOut <em>Component Out</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component Out</em>' reference.
   * @see #getComponentOut()
   * @generated
   */
  void setComponentOut(ComponentRef value);

} // ComponentBinding