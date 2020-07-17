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
public abstract class BaseResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3584010602891575844L;

	private Boolean success;
	private Integer status;
	
	/**
	 * @param success
	 * @param status
	 */
	public BaseResponse(Boolean success, Integer status) {
		super();
		this.success = success;
		this.status = status;
	}

	/**
	 * @return the success
	 */
	public Boolean getSuccess() {
		return success;
	}
	/**
	 * @param success the success to set
	 */
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

}
