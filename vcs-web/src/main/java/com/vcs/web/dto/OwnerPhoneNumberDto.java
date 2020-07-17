/**
 * 
 */
package com.vcs.web.dto;

import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 10:29:45 PM
 *
 */
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)
@ToString
public class OwnerPhoneNumberDto extends BasePhoneNumberDto {


	/**
	 * 
	 */
	private static final long serialVersionUID = 8307356200703522598L;

	@NotNull(message="{owner.notnull}")
	private OwnerDto owner;

}
