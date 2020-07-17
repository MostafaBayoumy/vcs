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
 * @createdOn: Jul 14, 2020 - 10:24:02 PM
 *
 */
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)
@ToString
public class DoctorPhoneNumberDto extends BasePhoneNumberDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1206688073679321138L;

	@NotNull(message="{doctorDto.notnull}")
	private DoctorDto doctor;

}
