/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.tURN;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intentional Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.tURN.IntentionalElement#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.IntentionalElement#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.IntentionalElement#getLongName <em>Long Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.IntentionalElement#getImportance <em>Importance</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.IntentionalElement#getImportanceQuantitative <em>Importance Quantitative</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.IntentionalElement#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.IntentionalElement#getLinksSrc <em>Links Src</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.tURN.TURNPackage#getIntentionalElement()
 * @model
 * @generated
 */
public interface IntentionalElement extends URNmodelElement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.tURN.IntentionalElementType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.mydsl.tURN.IntentionalElementType
   * @see #setType(IntentionalElementType)
   * @see org.xtext.example.mydsl.tURN.TURNPackage#getIntentionalElement_Type()
   * @model
   * @generated
   */
  IntentionalElementType getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.tURN.IntentionalElement#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.mydsl.tURN.IntentionalElementType
   * @see #getType()
   * @generated
   */
  void setType(IntentionalElementType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.tURN.TURNPackage#getIntentionalElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.tURN.IntentionalElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Long Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Long Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Long Name</em>' containment reference.
   * @see #setLongName(LongName)
   * @see org.xtext.example.mydsl.tURN.TURNPackage#getIntentionalElement_LongName()
   * @model containment="true"
   * @generated
   */
  LongName getLongName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.tURN.IntentionalElement#getLongName <em>Long Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Long Name</em>' containment reference.
   * @see #getLongName()
   * @generated
   */
  void setLongName(LongName value);

  /**
   * Returns the value of the '<em><b>Importance</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.tURN.ImportanceType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Importance</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Importance</em>' attribute.
   * @see org.xtext.example.mydsl.tURN.ImportanceType
   * @see #setImportance(ImportanceType)
   * @see org.xtext.example.mydsl.tURN.TURNPackage#getIntentionalElement_Importance()
   * @model
   * @generated
   */
  ImportanceType getImportance();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.tURN.IntentionalElement#getImportance <em>Importance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Importance</em>' attribute.
   * @see org.xtext.example.mydsl.tURN.ImportanceType
   * @see #getImportance()
   * @generated
   */
  void setImportance(ImportanceType value);

  /**
   * Returns the value of the '<em><b>Importance Quantitative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Importance Quantitative</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Importance Quantitative</em>' attribute.
   * @see #setImportanceQuantitative(int)
   * @see org.xtext.example.mydsl.tURN.TURNPackage#getIntentionalElement_ImportanceQuantitative()
   * @model
   * @generated
   */
  int getImportanceQuantitative();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.tURN.IntentionalElement#getImportanceQuantitative <em>Importance Quantitative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Importance Quantitative</em>' attribute.
   * @see #getImportanceQuantitative()
   * @generated
   */
  void setImportanceQuantitative(int value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see #setUnit(String)
   * @see org.xtext.example.mydsl.tURN.TURNPackage#getIntentionalElement_Unit()
   * @model
   * @generated
   */
  String getUnit();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.tURN.IntentionalElement#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see #getUnit()
   * @generated
   */
  void setUnit(String value);

  /**
   * Returns the value of the '<em><b>Links Src</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.tURN.ElementLink}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Links Src</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links Src</em>' containment reference list.
   * @see org.xtext.example.mydsl.tURN.TURNPackage#getIntentionalElement_LinksSrc()
   * @model containment="true"
   * @generated
   */
  EList<ElementLink> getLinksSrc();

} // IntentionalElement
