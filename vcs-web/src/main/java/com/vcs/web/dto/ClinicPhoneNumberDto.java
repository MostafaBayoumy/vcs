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
 * @createdOn: Jul 14, 2020 - 6:29:41 PM
 *
 */
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)
@ToString
public class ClinicPhoneNumberDto extends BasePhoneNumberDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4921960096631581138L;
	
	@NotNull(message="{clinicDto.notnull}")
	private ClinicDto clinic;
	
}
