/**
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.tURN;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qual To QMapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.tURN.QualToQMapping#isExceeds <em>Exceeds</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.QualToQMapping#getRealWorldLabel <em>Real World Label</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.QualToQMapping#getQualitativeEvaluation <em>Qualitative Evaluation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.tURN.QualToQMapping#getEvaluation <em>Evaluation</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.tURN.TURNPackage#getQualToQMapping()
 * @model
 * @generated
 */
public interface QualToQMapping extends EObject
{
  /**
   * Returns the value of the '<em><b>Exceeds</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exceeds</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exceeds</em>' attribute.
   * @see #setExceeds(boolean)
   * @see org.xtext.example.mydsl.tURN.TURNPackage#getQualToQMapping_Exceeds()
   * @model
   * @generated
   */
  boolean isExceeds();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.tURN.QualToQMapping#isExceeds <em>Exceeds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exceeds</em>' attribute.
   * @see #isExceeds()
   * @generated
   */
  void setExceeds(boolean value);

  /**
   * Returns the value of the '<em><b>Real World Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Real World Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Real World Label</em>' attribute.
   * @see #setRealWorldLabel(String)
   * @see org.xtext.example.mydsl.tURN.TURNPackage#getQualToQMapping_RealWorldLabel()
   * @model
   * @generated
   */
  String getRealWorldLabel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.tURN.QualToQMapping#getRealWorldLabel <em>Real World Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Real World Label</em>' attribute.
   * @see #getRealWorldLabel()
   * @generated
   */
  void setRealWorldLabel(String value);

  /**
   * Returns the value of the '<em><b>Qualitative Evaluation</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.tURN.QualitativeLabel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualitative Evaluation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualitative Evaluation</em>' attribute.
   * @see org.xtext.example.mydsl.tURN.QualitativeLabel
   * @see #setQualitativeEvaluation(QualitativeLabel)
   * @see org.xtext.example.mydsl.tURN.TURNPackage#getQualToQMapping_QualitativeEvaluation()
   * @model
   * @generated
   */
  QualitativeLabel getQualitativeEvaluation();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.tURN.QualToQMapping#getQualitativeEvaluation <em>Qualitative Evaluation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualitative Evaluation</em>' attribute.
   * @see org.xtext.example.mydsl.tURN.QualitativeLabel
   * @see #getQualitativeEvaluation()
   * @generated
   */
  void setQualitativeEvaluation(QualitativeLabel value);

  /**
   * Returns the value of the '<em><b>Evaluation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evaluation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evaluation</em>' attribute.
   * @see #setEvaluation(int)
   * @see org.xtext.example.mydsl.tURN.TURNPackage#getQualToQMapping_Evaluation()
   * @model
   * @generated
   */
  int getEvaluation();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.tURN.QualToQMapping#getEvaluation <em>Evaluation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Evaluation</em>' attribute.
   * @see #getEvaluation()
   * @generated
   */
  void setEvaluation(int value);

} // QualToQMapping