/**
 * generated by Xtext 2.12.0
 */
package io.beethoven.partitur.partitur;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Condition Function</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see io.beethoven.partitur.partitur.PartiturPackage#getPartiturConditionFunction()
 * @model
 * @generated
 */
public enum PartiturConditionFunction implements Enumerator
{
  /**
   * The '<em><b>Task Name Equals To</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TASK_NAME_EQUALS_TO_VALUE
   * @generated
   * @ordered
   */
  TASK_NAME_EQUALS_TO(0, "taskNameEqualsTo", "taskNameEqualsTo"),

  /**
   * The '<em><b>Task Response Equals To</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TASK_RESPONSE_EQUALS_TO_VALUE
   * @generated
   * @ordered
   */
  TASK_RESPONSE_EQUALS_TO(1, "taskResponseEqualsTo", "taskResponseEqualsTo"),

  /**
   * The '<em><b>Workflow Name Equals To</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WORKFLOW_NAME_EQUALS_TO_VALUE
   * @generated
   * @ordered
   */
  WORKFLOW_NAME_EQUALS_TO(2, "workflowNameEqualsTo", "workflowNameEqualsTo");

  /**
   * The '<em><b>Task Name Equals To</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Task Name Equals To</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TASK_NAME_EQUALS_TO
   * @model name="taskNameEqualsTo"
   * @generated
   * @ordered
   */
  public static final int TASK_NAME_EQUALS_TO_VALUE = 0;

  /**
   * The '<em><b>Task Response Equals To</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Task Response Equals To</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TASK_RESPONSE_EQUALS_TO
   * @model name="taskResponseEqualsTo"
   * @generated
   * @ordered
   */
  public static final int TASK_RESPONSE_EQUALS_TO_VALUE = 1;

  /**
   * The '<em><b>Workflow Name Equals To</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Workflow Name Equals To</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WORKFLOW_NAME_EQUALS_TO
   * @model name="workflowNameEqualsTo"
   * @generated
   * @ordered
   */
  public static final int WORKFLOW_NAME_EQUALS_TO_VALUE = 2;

  /**
   * An array of all the '<em><b>Condition Function</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final PartiturConditionFunction[] VALUES_ARRAY =
    new PartiturConditionFunction[]
    {
      TASK_NAME_EQUALS_TO,
      TASK_RESPONSE_EQUALS_TO,
      WORKFLOW_NAME_EQUALS_TO,
    };

  /**
   * A public read-only list of all the '<em><b>Condition Function</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<PartiturConditionFunction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Condition Function</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PartiturConditionFunction get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PartiturConditionFunction result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Condition Function</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PartiturConditionFunction getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PartiturConditionFunction result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Condition Function</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PartiturConditionFunction get(int value)
  {
    switch (value)
    {
      case TASK_NAME_EQUALS_TO_VALUE: return TASK_NAME_EQUALS_TO;
      case TASK_RESPONSE_EQUALS_TO_VALUE: return TASK_RESPONSE_EQUALS_TO;
      case WORKFLOW_NAME_EQUALS_TO_VALUE: return WORKFLOW_NAME_EQUALS_TO;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private PartiturConditionFunction(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //PartiturConditionFunction