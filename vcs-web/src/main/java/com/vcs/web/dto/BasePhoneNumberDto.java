/**
 * 
 */
package com.vcs.web.dto;

import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 10:15:24 PM
 *
 */
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public abstract class BasePhoneNumberDto extends BaseDto<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5987634600727337950L;
	
	@NotNull(message="{phoneNumber.notnull}")
	private String phoneNumber;

}
