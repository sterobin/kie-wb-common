/**
 * <copyright>
 * 
 * Copyright (c) 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Reiner Hille-Doering (SAP AG) - initial API and implementation and/or initial documentation
 * 
 * </copyright>
 */
package org.eclipse.bpmn2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.MessageFlow#getMessageRef <em>Message Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.MessageFlow#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.MessageFlow#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.MessageFlow#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 *
 * @see org.eclipse.bpmn2.Bpmn2Package#getMessageFlow()
 * @model extendedMetaData="name='tMessageFlow' kind='elementOnly'"
 * @generated
 */
public interface MessageFlow extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Message Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Ref</em>' reference.
	 * @see #setMessageRef(Message)
	 * @see org.eclipse.bpmn2.Bpmn2Package#getMessageFlow_MessageRef()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='messageRef'"
	 * @generated
	 */
	Message getMessageRef();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.MessageFlow#getMessageRef <em>Message Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Ref</em>' reference.
	 * @see #getMessageRef()
	 * @generated
	 */
	void setMessageRef(Message value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.bpmn2.Bpmn2Package#getMessageFlow_Name()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.MessageFlow#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Ref</em>' reference.
	 * @see #setSourceRef(InteractionNode)
	 * @see org.eclipse.bpmn2.Bpmn2Package#getMessageFlow_SourceRef()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='sourceRef'"
	 * @generated
	 */
	InteractionNode getSourceRef();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.MessageFlow#getSourceRef <em>Source Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ref</em>' reference.
	 * @see #getSourceRef()
	 * @generated
	 */
	void setSourceRef(InteractionNode value);

	/**
	 * Returns the value of the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Ref</em>' reference.
	 * @see #setTargetRef(InteractionNode)
	 * @see org.eclipse.bpmn2.Bpmn2Package#getMessageFlow_TargetRef()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='targetRef'"
	 * @generated
	 */
	InteractionNode getTargetRef();

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.MessageFlow#getTargetRef <em>Target Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Ref</em>' reference.
	 * @see #getTargetRef()
	 * @generated
	 */
	void setTargetRef(InteractionNode value);

} // MessageFlow
