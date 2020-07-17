/**
 * 
 */
package com.vcs.web.response;

import java.io.Serializable;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 10:13:49 PM
 *
 */
public class ServiceRequest<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3839242636055828424L;
	private Long serviceId;
	private T data;
	private Class<T> type;
	
	public Class<T> getType() {
		return type;
	}
	public Long getServiceId() {
		return serviceId;
	}
	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}

}
