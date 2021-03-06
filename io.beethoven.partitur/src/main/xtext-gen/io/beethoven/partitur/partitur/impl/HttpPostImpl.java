/**
 * generated by Xtext 2.12.0
 */
package io.beethoven.partitur.partitur.impl;

import io.beethoven.partitur.partitur.HttpBody;
import io.beethoven.partitur.partitur.HttpHeader;
import io.beethoven.partitur.partitur.HttpPost;
import io.beethoven.partitur.partitur.PartiturPackage;
import io.beethoven.partitur.partitur.UriVariables;

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
 * An implementation of the model object '<em><b>Http Post</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.beethoven.partitur.partitur.impl.HttpPostImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link io.beethoven.partitur.partitur.impl.HttpPostImpl#getUriVariables <em>Uri Variables</em>}</li>
 *   <li>{@link io.beethoven.partitur.partitur.impl.HttpPostImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link io.beethoven.partitur.partitur.impl.HttpPostImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HttpPostImpl extends MinimalEObjectImpl.Container implements HttpPost
{
  /**
   * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected static final String URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected String url = URL_EDEFAULT;

  /**
   * The cached value of the '{@link #getUriVariables() <em>Uri Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUriVariables()
   * @generated
   * @ordered
   */
  protected UriVariables uriVariables;

  /**
   * The cached value of the '{@link #getHeaders() <em>Headers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeaders()
   * @generated
   * @ordered
   */
  protected EList<HttpHeader> headers;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected HttpBody body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HttpPostImpl()
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
    return PartiturPackage.Literals.HTTP_POST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUrl()
  {
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrl(String newUrl)
  {
    String oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PartiturPackage.HTTP_POST__URL, oldUrl, url));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UriVariables getUriVariables()
  {
    return uriVariables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUriVariables(UriVariables newUriVariables, NotificationChain msgs)
  {
    UriVariables oldUriVariables = uriVariables;
    uriVariables = newUriVariables;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartiturPackage.HTTP_POST__URI_VARIABLES, oldUriVariables, newUriVariables);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUriVariables(UriVariables newUriVariables)
  {
    if (newUriVariables != uriVariables)
    {
      NotificationChain msgs = null;
      if (uriVariables != null)
        msgs = ((InternalEObject)uriVariables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartiturPackage.HTTP_POST__URI_VARIABLES, null, msgs);
      if (newUriVariables != null)
        msgs = ((InternalEObject)newUriVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartiturPackage.HTTP_POST__URI_VARIABLES, null, msgs);
      msgs = basicSetUriVariables(newUriVariables, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PartiturPackage.HTTP_POST__URI_VARIABLES, newUriVariables, newUriVariables));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HttpHeader> getHeaders()
  {
    if (headers == null)
    {
      headers = new EObjectContainmentEList<HttpHeader>(HttpHeader.class, this, PartiturPackage.HTTP_POST__HEADERS);
    }
    return headers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HttpBody getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(HttpBody newBody, NotificationChain msgs)
  {
    HttpBody oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartiturPackage.HTTP_POST__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(HttpBody newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartiturPackage.HTTP_POST__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartiturPackage.HTTP_POST__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PartiturPackage.HTTP_POST__BODY, newBody, newBody));
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
      case PartiturPackage.HTTP_POST__URI_VARIABLES:
        return basicSetUriVariables(null, msgs);
      case PartiturPackage.HTTP_POST__HEADERS:
        return ((InternalEList<?>)getHeaders()).basicRemove(otherEnd, msgs);
      case PartiturPackage.HTTP_POST__BODY:
        return basicSetBody(null, msgs);
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
      case PartiturPackage.HTTP_POST__URL:
        return getUrl();
      case PartiturPackage.HTTP_POST__URI_VARIABLES:
        return getUriVariables();
      case PartiturPackage.HTTP_POST__HEADERS:
        return getHeaders();
      case PartiturPackage.HTTP_POST__BODY:
        return getBody();
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
      case PartiturPackage.HTTP_POST__URL:
        setUrl((String)newValue);
        return;
      case PartiturPackage.HTTP_POST__URI_VARIABLES:
        setUriVariables((UriVariables)newValue);
        return;
      case PartiturPackage.HTTP_POST__HEADERS:
        getHeaders().clear();
        getHeaders().addAll((Collection<? extends HttpHeader>)newValue);
        return;
      case PartiturPackage.HTTP_POST__BODY:
        setBody((HttpBody)newValue);
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
      case PartiturPackage.HTTP_POST__URL:
        setUrl(URL_EDEFAULT);
        return;
      case PartiturPackage.HTTP_POST__URI_VARIABLES:
        setUriVariables((UriVariables)null);
        return;
      case PartiturPackage.HTTP_POST__HEADERS:
        getHeaders().clear();
        return;
      case PartiturPackage.HTTP_POST__BODY:
        setBody((HttpBody)null);
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
      case PartiturPackage.HTTP_POST__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case PartiturPackage.HTTP_POST__URI_VARIABLES:
        return uriVariables != null;
      case PartiturPackage.HTTP_POST__HEADERS:
        return headers != null && !headers.isEmpty();
      case PartiturPackage.HTTP_POST__BODY:
        return body != null;
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
    result.append(" (url: ");
    result.append(url);
    result.append(')');
    return result.toString();
  }

} //HttpPostImpl
