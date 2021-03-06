/**
 * generated by Xtext 2.12.0
 */
package io.beethoven.partitur.partitur.impl;

import io.beethoven.partitur.partitur.EventType;
import io.beethoven.partitur.partitur.HttpBody;
import io.beethoven.partitur.partitur.HttpDelete;
import io.beethoven.partitur.partitur.HttpGet;
import io.beethoven.partitur.partitur.HttpHeader;
import io.beethoven.partitur.partitur.HttpPost;
import io.beethoven.partitur.partitur.HttpPut;
import io.beethoven.partitur.partitur.PartiturCommand;
import io.beethoven.partitur.partitur.PartiturCommandFunction;
import io.beethoven.partitur.partitur.PartiturCondition;
import io.beethoven.partitur.partitur.PartiturConditionFunction;
import io.beethoven.partitur.partitur.PartiturFactory;
import io.beethoven.partitur.partitur.PartiturHandler;
import io.beethoven.partitur.partitur.PartiturPackage;
import io.beethoven.partitur.partitur.PartiturTask;
import io.beethoven.partitur.partitur.PartiturWorkflow;
import io.beethoven.partitur.partitur.QueryParam;
import io.beethoven.partitur.partitur.UriVariables;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PartiturPackageImpl extends EPackageImpl implements PartiturPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass partiturWorkflowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass partiturTaskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass partiturHandlerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass partiturConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass partiturCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass httpGetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass httpPostEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass httpPutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass httpDeleteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass httpHeaderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uriVariablesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass queryParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass httpBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum partiturConditionFunctionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum partiturCommandFunctionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum eventTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see io.beethoven.partitur.partitur.PartiturPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PartiturPackageImpl()
  {
    super(eNS_URI, PartiturFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PartiturPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PartiturPackage init()
  {
    if (isInited) return (PartiturPackage)EPackage.Registry.INSTANCE.getEPackage(PartiturPackage.eNS_URI);

    // Obtain or create and register package
    PartiturPackageImpl thePartiturPackage = (PartiturPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PartiturPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PartiturPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePartiturPackage.createPackageContents();

    // Initialize created meta-data
    thePartiturPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePartiturPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PartiturPackage.eNS_URI, thePartiturPackage);
    return thePartiturPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPartiturWorkflow()
  {
    return partiturWorkflowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPartiturWorkflow_Name()
  {
    return (EAttribute)partiturWorkflowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPartiturWorkflow_Tasks()
  {
    return (EReference)partiturWorkflowEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPartiturWorkflow_Handlers()
  {
    return (EReference)partiturWorkflowEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPartiturTask()
  {
    return partiturTaskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPartiturTask_Name()
  {
    return (EAttribute)partiturTaskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPartiturTask_PartiturHttpRequest()
  {
    return (EReference)partiturTaskEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPartiturHandler()
  {
    return partiturHandlerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPartiturHandler_Name()
  {
    return (EAttribute)partiturHandlerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPartiturHandler_Event()
  {
    return (EAttribute)partiturHandlerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPartiturHandler_Conditions()
  {
    return (EReference)partiturHandlerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPartiturHandler_Commands()
  {
    return (EReference)partiturHandlerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPartiturCondition()
  {
    return partiturConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPartiturCondition_ConditionFunction()
  {
    return (EAttribute)partiturConditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPartiturCondition_Arg()
  {
    return (EAttribute)partiturConditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPartiturCommand()
  {
    return partiturCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPartiturCommand_CommandFunction()
  {
    return (EAttribute)partiturCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPartiturCommand_Arg()
  {
    return (EAttribute)partiturCommandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHttpGet()
  {
    return httpGetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHttpGet_Url()
  {
    return (EAttribute)httpGetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHttpGet_UriVariables()
  {
    return (EReference)httpGetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHttpGet_Headers()
  {
    return (EReference)httpGetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHttpGet_Params()
  {
    return (EReference)httpGetEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHttpPost()
  {
    return httpPostEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHttpPost_Url()
  {
    return (EAttribute)httpPostEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHttpPost_UriVariables()
  {
    return (EReference)httpPostEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHttpPost_Headers()
  {
    return (EReference)httpPostEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHttpPost_Body()
  {
    return (EReference)httpPostEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHttpPut()
  {
    return httpPutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHttpPut_Url()
  {
    return (EAttribute)httpPutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHttpPut_UriVariables()
  {
    return (EReference)httpPutEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHttpPut_Headers()
  {
    return (EReference)httpPutEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHttpPut_Body()
  {
    return (EReference)httpPutEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHttpDelete()
  {
    return httpDeleteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHttpDelete_Url()
  {
    return (EAttribute)httpDeleteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHttpDelete_UriVariables()
  {
    return (EReference)httpDeleteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHttpDelete_Headers()
  {
    return (EReference)httpDeleteEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHttpHeader()
  {
    return httpHeaderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHttpHeader_Name()
  {
    return (EAttribute)httpHeaderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHttpHeader_Value()
  {
    return (EAttribute)httpHeaderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUriVariables()
  {
    return uriVariablesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUriVariables_Values()
  {
    return (EAttribute)uriVariablesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQueryParam()
  {
    return queryParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQueryParam_Name()
  {
    return (EAttribute)queryParamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQueryParam_Value()
  {
    return (EAttribute)queryParamEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHttpBody()
  {
    return httpBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHttpBody_Value()
  {
    return (EAttribute)httpBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPartiturConditionFunction()
  {
    return partiturConditionFunctionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPartiturCommandFunction()
  {
    return partiturCommandFunctionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getEventType()
  {
    return eventTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartiturFactory getPartiturFactory()
  {
    return (PartiturFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    partiturWorkflowEClass = createEClass(PARTITUR_WORKFLOW);
    createEAttribute(partiturWorkflowEClass, PARTITUR_WORKFLOW__NAME);
    createEReference(partiturWorkflowEClass, PARTITUR_WORKFLOW__TASKS);
    createEReference(partiturWorkflowEClass, PARTITUR_WORKFLOW__HANDLERS);

    partiturTaskEClass = createEClass(PARTITUR_TASK);
    createEAttribute(partiturTaskEClass, PARTITUR_TASK__NAME);
    createEReference(partiturTaskEClass, PARTITUR_TASK__PARTITUR_HTTP_REQUEST);

    partiturHandlerEClass = createEClass(PARTITUR_HANDLER);
    createEAttribute(partiturHandlerEClass, PARTITUR_HANDLER__NAME);
    createEAttribute(partiturHandlerEClass, PARTITUR_HANDLER__EVENT);
    createEReference(partiturHandlerEClass, PARTITUR_HANDLER__CONDITIONS);
    createEReference(partiturHandlerEClass, PARTITUR_HANDLER__COMMANDS);

    partiturConditionEClass = createEClass(PARTITUR_CONDITION);
    createEAttribute(partiturConditionEClass, PARTITUR_CONDITION__CONDITION_FUNCTION);
    createEAttribute(partiturConditionEClass, PARTITUR_CONDITION__ARG);

    partiturCommandEClass = createEClass(PARTITUR_COMMAND);
    createEAttribute(partiturCommandEClass, PARTITUR_COMMAND__COMMAND_FUNCTION);
    createEAttribute(partiturCommandEClass, PARTITUR_COMMAND__ARG);

    httpGetEClass = createEClass(HTTP_GET);
    createEAttribute(httpGetEClass, HTTP_GET__URL);
    createEReference(httpGetEClass, HTTP_GET__URI_VARIABLES);
    createEReference(httpGetEClass, HTTP_GET__HEADERS);
    createEReference(httpGetEClass, HTTP_GET__PARAMS);

    httpPostEClass = createEClass(HTTP_POST);
    createEAttribute(httpPostEClass, HTTP_POST__URL);
    createEReference(httpPostEClass, HTTP_POST__URI_VARIABLES);
    createEReference(httpPostEClass, HTTP_POST__HEADERS);
    createEReference(httpPostEClass, HTTP_POST__BODY);

    httpPutEClass = createEClass(HTTP_PUT);
    createEAttribute(httpPutEClass, HTTP_PUT__URL);
    createEReference(httpPutEClass, HTTP_PUT__URI_VARIABLES);
    createEReference(httpPutEClass, HTTP_PUT__HEADERS);
    createEReference(httpPutEClass, HTTP_PUT__BODY);

    httpDeleteEClass = createEClass(HTTP_DELETE);
    createEAttribute(httpDeleteEClass, HTTP_DELETE__URL);
    createEReference(httpDeleteEClass, HTTP_DELETE__URI_VARIABLES);
    createEReference(httpDeleteEClass, HTTP_DELETE__HEADERS);

    httpHeaderEClass = createEClass(HTTP_HEADER);
    createEAttribute(httpHeaderEClass, HTTP_HEADER__NAME);
    createEAttribute(httpHeaderEClass, HTTP_HEADER__VALUE);

    uriVariablesEClass = createEClass(URI_VARIABLES);
    createEAttribute(uriVariablesEClass, URI_VARIABLES__VALUES);

    queryParamEClass = createEClass(QUERY_PARAM);
    createEAttribute(queryParamEClass, QUERY_PARAM__NAME);
    createEAttribute(queryParamEClass, QUERY_PARAM__VALUE);

    httpBodyEClass = createEClass(HTTP_BODY);
    createEAttribute(httpBodyEClass, HTTP_BODY__VALUE);

    // Create enums
    partiturConditionFunctionEEnum = createEEnum(PARTITUR_CONDITION_FUNCTION);
    partiturCommandFunctionEEnum = createEEnum(PARTITUR_COMMAND_FUNCTION);
    eventTypeEEnum = createEEnum(EVENT_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(partiturWorkflowEClass, PartiturWorkflow.class, "PartiturWorkflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPartiturWorkflow_Name(), ecorePackage.getEString(), "name", null, 0, 1, PartiturWorkflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPartiturWorkflow_Tasks(), this.getPartiturTask(), null, "tasks", null, 0, -1, PartiturWorkflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPartiturWorkflow_Handlers(), this.getPartiturHandler(), null, "handlers", null, 0, -1, PartiturWorkflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(partiturTaskEClass, PartiturTask.class, "PartiturTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPartiturTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, PartiturTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPartiturTask_PartiturHttpRequest(), ecorePackage.getEObject(), null, "partiturHttpRequest", null, 0, 1, PartiturTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(partiturHandlerEClass, PartiturHandler.class, "PartiturHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPartiturHandler_Name(), ecorePackage.getEString(), "name", null, 0, 1, PartiturHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPartiturHandler_Event(), this.getEventType(), "event", null, 0, 1, PartiturHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPartiturHandler_Conditions(), this.getPartiturCondition(), null, "conditions", null, 0, -1, PartiturHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPartiturHandler_Commands(), this.getPartiturCommand(), null, "commands", null, 0, -1, PartiturHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(partiturConditionEClass, PartiturCondition.class, "PartiturCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPartiturCondition_ConditionFunction(), this.getPartiturConditionFunction(), "conditionFunction", null, 0, 1, PartiturCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPartiturCondition_Arg(), ecorePackage.getEString(), "arg", null, 0, 1, PartiturCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(partiturCommandEClass, PartiturCommand.class, "PartiturCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPartiturCommand_CommandFunction(), this.getPartiturCommandFunction(), "commandFunction", null, 0, 1, PartiturCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPartiturCommand_Arg(), ecorePackage.getEString(), "arg", null, 0, 1, PartiturCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(httpGetEClass, HttpGet.class, "HttpGet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHttpGet_Url(), ecorePackage.getEString(), "url", null, 0, 1, HttpGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHttpGet_UriVariables(), this.getUriVariables(), null, "uriVariables", null, 0, 1, HttpGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHttpGet_Headers(), this.getHttpHeader(), null, "headers", null, 0, -1, HttpGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHttpGet_Params(), this.getQueryParam(), null, "params", null, 0, -1, HttpGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(httpPostEClass, HttpPost.class, "HttpPost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHttpPost_Url(), ecorePackage.getEString(), "url", null, 0, 1, HttpPost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHttpPost_UriVariables(), this.getUriVariables(), null, "uriVariables", null, 0, 1, HttpPost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHttpPost_Headers(), this.getHttpHeader(), null, "headers", null, 0, -1, HttpPost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHttpPost_Body(), this.getHttpBody(), null, "body", null, 0, 1, HttpPost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(httpPutEClass, HttpPut.class, "HttpPut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHttpPut_Url(), ecorePackage.getEString(), "url", null, 0, 1, HttpPut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHttpPut_UriVariables(), this.getUriVariables(), null, "uriVariables", null, 0, 1, HttpPut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHttpPut_Headers(), this.getHttpHeader(), null, "headers", null, 0, -1, HttpPut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHttpPut_Body(), this.getHttpBody(), null, "body", null, 0, 1, HttpPut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(httpDeleteEClass, HttpDelete.class, "HttpDelete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHttpDelete_Url(), ecorePackage.getEString(), "url", null, 0, 1, HttpDelete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHttpDelete_UriVariables(), this.getUriVariables(), null, "uriVariables", null, 0, 1, HttpDelete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHttpDelete_Headers(), this.getHttpHeader(), null, "headers", null, 0, -1, HttpDelete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(httpHeaderEClass, HttpHeader.class, "HttpHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHttpHeader_Name(), ecorePackage.getEString(), "name", null, 0, 1, HttpHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHttpHeader_Value(), ecorePackage.getEString(), "value", null, 0, 1, HttpHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uriVariablesEClass, UriVariables.class, "UriVariables", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUriVariables_Values(), ecorePackage.getEString(), "values", null, 0, -1, UriVariables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(queryParamEClass, QueryParam.class, "QueryParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQueryParam_Name(), ecorePackage.getEString(), "name", null, 0, 1, QueryParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQueryParam_Value(), ecorePackage.getEString(), "value", null, 0, 1, QueryParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(httpBodyEClass, HttpBody.class, "HttpBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHttpBody_Value(), ecorePackage.getEString(), "value", null, 0, 1, HttpBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(partiturConditionFunctionEEnum, PartiturConditionFunction.class, "PartiturConditionFunction");
    addEEnumLiteral(partiturConditionFunctionEEnum, PartiturConditionFunction.TASK_NAME_EQUALS_TO);
    addEEnumLiteral(partiturConditionFunctionEEnum, PartiturConditionFunction.TASK_RESPONSE_EQUALS_TO);
    addEEnumLiteral(partiturConditionFunctionEEnum, PartiturConditionFunction.WORKFLOW_NAME_EQUALS_TO);

    initEEnum(partiturCommandFunctionEEnum, PartiturCommandFunction.class, "PartiturCommandFunction");
    addEEnumLiteral(partiturCommandFunctionEEnum, PartiturCommandFunction.START_TASK);
    addEEnumLiteral(partiturCommandFunctionEEnum, PartiturCommandFunction.START_WORKFLOW);
    addEEnumLiteral(partiturCommandFunctionEEnum, PartiturCommandFunction.STOP_WORKFLOW);
    addEEnumLiteral(partiturCommandFunctionEEnum, PartiturCommandFunction.CANCEL_WORKFLOW);

    initEEnum(eventTypeEEnum, EventType.class, "EventType");
    addEEnumLiteral(eventTypeEEnum, EventType.TASK_STARTED);
    addEEnumLiteral(eventTypeEEnum, EventType.TASK_COMPLETED);
    addEEnumLiteral(eventTypeEEnum, EventType.TASK_TIMEDOUT);
    addEEnumLiteral(eventTypeEEnum, EventType.TASK_FAILED);
    addEEnumLiteral(eventTypeEEnum, EventType.WORKFLOW_SCHEDULED);
    addEEnumLiteral(eventTypeEEnum, EventType.WORKFLOW_STARTED);
    addEEnumLiteral(eventTypeEEnum, EventType.WORKFLOW_COMPLETED);

    // Create resource
    createResource(eNS_URI);
  }

} //PartiturPackageImpl
