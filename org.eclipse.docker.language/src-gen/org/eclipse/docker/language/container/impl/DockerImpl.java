/**
 * generated by Xtext 2.9.2
 */
package org.eclipse.docker.language.container.impl;

import java.util.Collection;

import org.eclipse.docker.language.container.BuildImagesExecution;
import org.eclipse.docker.language.container.ContainerPackage;
import org.eclipse.docker.language.container.ContainerSection;
import org.eclipse.docker.language.container.Docker;
import org.eclipse.docker.language.container.ImageSection;
import org.eclipse.docker.language.container.ImportContainer;
import org.eclipse.docker.language.container.RunContainerDefination;

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
 * An implementation of the model object '<em><b>Docker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.docker.language.container.impl.DockerImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.DockerImpl#getContainerRegion <em>Container Region</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.DockerImpl#getImageRegion <em>Image Region</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.DockerImpl#getBuild <em>Build</em>}</li>
 *   <li>{@link org.eclipse.docker.language.container.impl.DockerImpl#getRuntime <em>Runtime</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DockerImpl extends MinimalEObjectImpl.Container implements Docker
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<ImportContainer> imports;

  /**
   * The cached value of the '{@link #getContainerRegion() <em>Container Region</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainerRegion()
   * @generated
   * @ordered
   */
  protected ContainerSection containerRegion;

  /**
   * The cached value of the '{@link #getImageRegion() <em>Image Region</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImageRegion()
   * @generated
   * @ordered
   */
  protected ImageSection imageRegion;

  /**
   * The cached value of the '{@link #getBuild() <em>Build</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuild()
   * @generated
   * @ordered
   */
  protected BuildImagesExecution build;

  /**
   * The cached value of the '{@link #getRuntime() <em>Runtime</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuntime()
   * @generated
   * @ordered
   */
  protected RunContainerDefination runtime;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DockerImpl()
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
    return ContainerPackage.Literals.DOCKER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImportContainer> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<ImportContainer>(ImportContainer.class, this, ContainerPackage.DOCKER__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerSection getContainerRegion()
  {
    return containerRegion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContainerRegion(ContainerSection newContainerRegion, NotificationChain msgs)
  {
    ContainerSection oldContainerRegion = containerRegion;
    containerRegion = newContainerRegion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContainerPackage.DOCKER__CONTAINER_REGION, oldContainerRegion, newContainerRegion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContainerRegion(ContainerSection newContainerRegion)
  {
    if (newContainerRegion != containerRegion)
    {
      NotificationChain msgs = null;
      if (containerRegion != null)
        msgs = ((InternalEObject)containerRegion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContainerPackage.DOCKER__CONTAINER_REGION, null, msgs);
      if (newContainerRegion != null)
        msgs = ((InternalEObject)newContainerRegion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContainerPackage.DOCKER__CONTAINER_REGION, null, msgs);
      msgs = basicSetContainerRegion(newContainerRegion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.DOCKER__CONTAINER_REGION, newContainerRegion, newContainerRegion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImageSection getImageRegion()
  {
    return imageRegion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImageRegion(ImageSection newImageRegion, NotificationChain msgs)
  {
    ImageSection oldImageRegion = imageRegion;
    imageRegion = newImageRegion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContainerPackage.DOCKER__IMAGE_REGION, oldImageRegion, newImageRegion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImageRegion(ImageSection newImageRegion)
  {
    if (newImageRegion != imageRegion)
    {
      NotificationChain msgs = null;
      if (imageRegion != null)
        msgs = ((InternalEObject)imageRegion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContainerPackage.DOCKER__IMAGE_REGION, null, msgs);
      if (newImageRegion != null)
        msgs = ((InternalEObject)newImageRegion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContainerPackage.DOCKER__IMAGE_REGION, null, msgs);
      msgs = basicSetImageRegion(newImageRegion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.DOCKER__IMAGE_REGION, newImageRegion, newImageRegion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuildImagesExecution getBuild()
  {
    return build;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBuild(BuildImagesExecution newBuild, NotificationChain msgs)
  {
    BuildImagesExecution oldBuild = build;
    build = newBuild;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContainerPackage.DOCKER__BUILD, oldBuild, newBuild);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBuild(BuildImagesExecution newBuild)
  {
    if (newBuild != build)
    {
      NotificationChain msgs = null;
      if (build != null)
        msgs = ((InternalEObject)build).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContainerPackage.DOCKER__BUILD, null, msgs);
      if (newBuild != null)
        msgs = ((InternalEObject)newBuild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContainerPackage.DOCKER__BUILD, null, msgs);
      msgs = basicSetBuild(newBuild, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.DOCKER__BUILD, newBuild, newBuild));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RunContainerDefination getRuntime()
  {
    return runtime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRuntime(RunContainerDefination newRuntime, NotificationChain msgs)
  {
    RunContainerDefination oldRuntime = runtime;
    runtime = newRuntime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContainerPackage.DOCKER__RUNTIME, oldRuntime, newRuntime);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRuntime(RunContainerDefination newRuntime)
  {
    if (newRuntime != runtime)
    {
      NotificationChain msgs = null;
      if (runtime != null)
        msgs = ((InternalEObject)runtime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContainerPackage.DOCKER__RUNTIME, null, msgs);
      if (newRuntime != null)
        msgs = ((InternalEObject)newRuntime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContainerPackage.DOCKER__RUNTIME, null, msgs);
      msgs = basicSetRuntime(newRuntime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContainerPackage.DOCKER__RUNTIME, newRuntime, newRuntime));
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
      case ContainerPackage.DOCKER__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case ContainerPackage.DOCKER__CONTAINER_REGION:
        return basicSetContainerRegion(null, msgs);
      case ContainerPackage.DOCKER__IMAGE_REGION:
        return basicSetImageRegion(null, msgs);
      case ContainerPackage.DOCKER__BUILD:
        return basicSetBuild(null, msgs);
      case ContainerPackage.DOCKER__RUNTIME:
        return basicSetRuntime(null, msgs);
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
      case ContainerPackage.DOCKER__IMPORTS:
        return getImports();
      case ContainerPackage.DOCKER__CONTAINER_REGION:
        return getContainerRegion();
      case ContainerPackage.DOCKER__IMAGE_REGION:
        return getImageRegion();
      case ContainerPackage.DOCKER__BUILD:
        return getBuild();
      case ContainerPackage.DOCKER__RUNTIME:
        return getRuntime();
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
      case ContainerPackage.DOCKER__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ImportContainer>)newValue);
        return;
      case ContainerPackage.DOCKER__CONTAINER_REGION:
        setContainerRegion((ContainerSection)newValue);
        return;
      case ContainerPackage.DOCKER__IMAGE_REGION:
        setImageRegion((ImageSection)newValue);
        return;
      case ContainerPackage.DOCKER__BUILD:
        setBuild((BuildImagesExecution)newValue);
        return;
      case ContainerPackage.DOCKER__RUNTIME:
        setRuntime((RunContainerDefination)newValue);
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
      case ContainerPackage.DOCKER__IMPORTS:
        getImports().clear();
        return;
      case ContainerPackage.DOCKER__CONTAINER_REGION:
        setContainerRegion((ContainerSection)null);
        return;
      case ContainerPackage.DOCKER__IMAGE_REGION:
        setImageRegion((ImageSection)null);
        return;
      case ContainerPackage.DOCKER__BUILD:
        setBuild((BuildImagesExecution)null);
        return;
      case ContainerPackage.DOCKER__RUNTIME:
        setRuntime((RunContainerDefination)null);
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
      case ContainerPackage.DOCKER__IMPORTS:
        return imports != null && !imports.isEmpty();
      case ContainerPackage.DOCKER__CONTAINER_REGION:
        return containerRegion != null;
      case ContainerPackage.DOCKER__IMAGE_REGION:
        return imageRegion != null;
      case ContainerPackage.DOCKER__BUILD:
        return build != null;
      case ContainerPackage.DOCKER__RUNTIME:
        return runtime != null;
    }
    return super.eIsSet(featureID);
  }

} //DockerImpl
