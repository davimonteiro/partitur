/**
 * generated by Xtext 2.12.0
 */
package io.beethoven.partitur.partitur.impl;

import io.beethoven.partitur.partitur.PartiturCondition;
import io.beethoven.partitur.partitur.PartiturConditionFunction;
import io.beethoven.partitur.partitur.PartiturPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.beethoven.partitur.partitur.impl.PartiturConditionImpl#getConditionFunction <em>Condition Function</em>}</li>
 *   <li>{@link io.beethoven.partitur.partitur.impl.PartiturConditionImpl#getArg <em>Arg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartiturConditionImpl extends MinimalEObjectImpl.Container implements PartiturCondition
{
  /**
   * The default value of the '{@link #getConditionFunction() <em>Condition Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionFunction()
   * @generated
   * @ordered
   */
  protected static final PartiturConditionFunction CONDITION_FUNCTION_EDEFAULT = PartiturConditionFunction.TASK_NAME_EQUALS_TO;

  /**
   * The cached value of the '{@link #getConditionFunction() <em>Condition Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionFunction()
   * @generated
   * @ordered
   */
  protected PartiturConditionFunction conditionFunction = CONDITION_FUNCTION_EDEFAULT;

  /**
   * The default value of the '{@link #getArg() <em>Arg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg()
   * @generated
   * @ordered
   */
  protected static final String ARG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArg() <em>Arg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg()
   * @generated
   * @ordered
   */
  protected String arg = ARG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PartiturConditionImpl()
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
    return PartiturPackage.Literals.PARTITUR_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartiturConditionFunction getConditionFunction()
  {
    return conditionFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditionFunction(PartiturConditionFunction newConditionFunction)
  {
    PartiturConditionFunction oldConditionFunction = conditionFunction;
    conditionFunction = newConditionFunction == null ? CONDITION_FUNCTION_EDEFAULT : newConditionFunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PartiturPackage.PARTITUR_CONDITION__CONDITION_FUNCTION, oldConditionFunction, conditionFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getArg()
  {
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArg(String newArg)
  {
    String oldArg = arg;
    arg = newArg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PartiturPackage.PARTITUR_CONDITION__ARG, oldArg, arg));
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
      case PartiturPackage.PARTITUR_CONDITION__CONDITION_FUNCTION:
        return getConditionFunction();
      case PartiturPackage.PARTITUR_CONDITION__ARG:
        return getArg();
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
      case PartiturPackage.PARTITUR_CONDITION__CONDITION_FUNCTION:
        setConditionFunction((PartiturConditionFunction)newValue);
        return;
      case PartiturPackage.PARTITUR_CONDITION__ARG:
        setArg((String)newValue);
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
      case PartiturPackage.PARTITUR_CONDITION__CONDITION_FUNCTION:
        setConditionFunction(CONDITION_FUNCTION_EDEFAULT);
        return;
      case PartiturPackage.PARTITUR_CONDITION__ARG:
        setArg(ARG_EDEFAULT);
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
      case PartiturPackage.PARTITUR_CONDITION__CONDITION_FUNCTION:
        return conditionFunction != CONDITION_FUNCTION_EDEFAULT;
      case PartiturPackage.PARTITUR_CONDITION__ARG:
        return ARG_EDEFAULT == null ? arg != null : !ARG_EDEFAULT.equals(arg);
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
    result.append(" (conditionFunction: ");
    result.append(conditionFunction);
    result.append(", arg: ");
    result.append(arg);
    result.append(')');
    return result.toString();
  }

} //PartiturConditionImpl
