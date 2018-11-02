/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.tURN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decomposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.tURN.Decomposition#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.Decomposition#getLongName <em>Long Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.Decomposition#getDecompositionType <em>Decomposition Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.Decomposition#getDest <em>Dest</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.tURN.TURNPackage#getDecomposition()
 * @model
 * @generated
 */
public interface Decomposition extends URNmodelElement, ElementLink
{
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
   * @see org.xtext.example.mydsl.tURN.TURNPackage#getDecomposition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.tURN.Decomposition#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.example.mydsl.tURN.TURNPackage#getDecomposition_LongName()
   * @model containment="true"
   * @generated
   */
  LongName getLongName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.tURN.Decomposition#getLongName <em>Long Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Long Name</em>' containment reference.
   * @see #getLongName()
   * @generated
   */
  void setLongName(LongName value);

  /**
   * Returns the value of the '<em><b>Decomposition Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.tURN.DecompositionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decomposition Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decomposition Type</em>' attribute.
   * @see org.xtext.example.mydsl.tURN.DecompositionType
   * @see #setDecompositionType(DecompositionType)
   * @see org.xtext.example.mydsl.tURN.TURNPackage#getDecomposition_DecompositionType()
   * @model
   * @generated
   */
  DecompositionType getDecompositionType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.tURN.Decomposition#getDecompositionType <em>Decomposition Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decomposition Type</em>' attribute.
   * @see org.xtext.example.mydsl.tURN.DecompositionType
   * @see #getDecompositionType()
   * @generated
   */
  void setDecompositionType(DecompositionType value);

  /**
   * Returns the value of the '<em><b>Dest</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dest</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dest</em>' reference.
   * @see #setDest(IntentionalElement)
   * @see org.xtext.example.mydsl.tURN.TURNPackage#getDecomposition_Dest()
   * @model
   * @generated
   */
  IntentionalElement getDest();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.tURN.Decomposition#getDest <em>Dest</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dest</em>' reference.
   * @see #getDest()
   * @generated
   */
  void setDest(IntentionalElement value);

} // Decomposition