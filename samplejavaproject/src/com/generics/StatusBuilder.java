/*******************************************************************************
 *   NAME:			StatusBuilder.java
 *   DESCRIPTION:	Base class for the StatusBuilder class, used to compile status data
 *   CREATED:		2017
 *   AUTHOR:		The ATS Integration Team 
 *    
 *   ACCURATE BACKGROUND, INC. ("COMPANY") CONFIDENTIAL
 *   (C) Copyright 2017 Accurate Background, Inc., All Rights Reserved.
 *  
 *   NOTICE:  All information contained herein is, and remains the property of COMPANY. The
 *   intellectual and technical concepts contained herein are proprietary to COMPANY and may be
 *   covered by U.S. and Foreign Patents, patents in process, and are protected by trade secret
 *   or copyright law. Dissemination of this information or reproduction of this material is
 *   strictly forbidden unless prior written permission is obtained from COMPANY.  Access to the
 *   source code contained herein is hereby forbidden to anyone except current COMPANY employees,
 *   managers or contractors who have executed Confidentiality and Non-disclosure agreements
 *   explicitly covering such access.
 *   
 *   The copyright notice above does not evidence any actual or intended publication or
 *   disclosure of this source code, which includes information that is confidential and/or
 *   proprietary, and is a trade secret, of COMPANY.  ANY REPRODUCTION, MODIFICATION, DISTRIBUTION,
 *   PUBLIC PERFORMANCE, OR PUBLIC DISPLAY OF OR THROUGH USE OF THIS SOURCE CODE WITHOUT THE EXPRESS
 *   WRITTEN CONSENT OF COMPANY IS STRICTLY PROHIBITED, AND IN VIOLATION OF APPLICABLE LAWS AND
 *   INTERNATIONAL TREATIES.  THE RECEIPT OR POSSESSION OF  THIS SOURCE CODE AND/OR RELATED INFORMATION
 *   DOES NOT CONVEY OR IMPLY ANY RIGHTS TO REPRODUCE, DISCLOSE OR DISTRIBUTE ITS CONTENTS, OR TO MANUFACTURE,
 *   USE, OR SELL ANYTHING THAT IT MAY DESCRIBE,IN WHOLE OR IN PART.
 *
 *******************************************************************************/
package com.generics;


/**
 * Base class for the StatusBuilder class, used to compile status data
 * @param <S> This is the type used to initialize the builder.
 * @param <T> This is the type that is returned by the builder.
 * @author tlin
 */
public abstract class StatusBuilder<S,T> implements Builder<S,T> {
	protected Packager<T> packager;
	
	/**
	 * Set packager to package the order.
	 * @param packager the packager to use
	 */
	public void setPackager(Packager<T> packager){
		this.packager = packager;
	}
	
	/**
	 * Gets the request details from the ATS.
	 */
	public abstract void buildRequestDetails() throws Exception;
	
	/**
	 * Gets the status of the order.
	 */
	public abstract void buildStatus() throws Exception;
}
