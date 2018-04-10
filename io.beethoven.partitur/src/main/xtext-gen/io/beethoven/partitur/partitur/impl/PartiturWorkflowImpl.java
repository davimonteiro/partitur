/**
 * generated by Xtext 2.12.0
 */
package io.beethoven.partitur.partitur.impl;

import io.beethoven.partitur.partitur.PartiturHandler;
import io.beethoven.partitur.partitur.PartiturPackage;
import io.beethoven.partitur.partitur.PartiturTask;
import io.beethoven.partitur.partitur.PartiturWorkflow;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.beethoven.partitur.partitur.impl.PartiturWorkflowImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.beethoven.partitur.partitur.impl.PartiturWorkflowImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link io.beethoven.partitur.partitur.impl.PartiturWorkflowImpl#getHandlers <em>Handlers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartiturWorkflowImpl extends MinimalEObjectImpl.Container implements PartiturWorkflow
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
   * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTasks()
   * @generated
   * @ordered
   */
  protected EList<PartiturTask> tasks;

  /**
   * The cached value of the '{@link #getHandlers() <em>Handlers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandlers()
   * @generated
   * @ordered
   */
  protected EList<PartiturHandler> handlers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PartiturWorkflowImpl()
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
    return PartiturPackage.Literals.PARTITUR_WORKFLOW;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PartiturPackage.PARTITUR_WORKFLOW__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PartiturTask> getTasks()
  {
    if (tasks == null)
    {
      tasks = new EObjectContainmentEList<PartiturTask>(PartiturTask.class, this, PartiturPackage.PARTITUR_WORKFLOW__TASKS);
    }
    return tasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PartiturHandler> getHandlers()
  {
    if (handlers == null)
    {
      handlers = new EObjectContainmentEList<PartiturHandler>(PartiturHandler.class, this, PartiturPackage.PARTITUR_WORKFLOW__HANDLERS);
    }
    return handlers;
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
      case PartiturPackage.PARTITUR_WORKFLOW__TASKS:
        return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
      case PartiturPackage.PARTITUR_WORKFLOW__HANDLERS:
        return ((InternalEList<?>)getHandlers()).basicRemove(otherEnd, msgs);
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
      case PartiturPackage.PARTITUR_WORKFLOW__NAME:
        return getName();
      case PartiturPackage.PARTITUR_WORKFLOW__TASKS:
        return getTasks();
      case PartiturPackage.PARTITUR_WORKFLOW__HANDLERS:
        return getHandlers();
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
      case PartiturPackage.PARTITUR_WORKFLOW__NAME:
        setName((String)newValue);
        return;
      case PartiturPackage.PARTITUR_WORKFLOW__TASKS:
        getTasks().clear();
        getTasks().addAll((Collection<? extends PartiturTask>)newValue);
        return;
      case PartiturPackage.PARTITUR_WORKFLOW__HANDLERS:
        getHandlers().clear();
        getHandlers().addAll((Collection<? extends PartiturHandler>)newValue);
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
      case PartiturPackage.PARTITUR_WORKFLOW__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PartiturPackage.PARTITUR_WORKFLOW__TASKS:
        getTasks().clear();
        return;
      case PartiturPackage.PARTITUR_WORKFLOW__HANDLERS:
        getHandlers().clear();
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
      case PartiturPackage.PARTITUR_WORKFLOW__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PartiturPackage.PARTITUR_WORKFLOW__TASKS:
        return tasks != null && !tasks.isEmpty();
      case PartiturPackage.PARTITUR_WORKFLOW__HANDLERS:
        return handlers != null && !handlers.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //PartiturWorkflowImpl
