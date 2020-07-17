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
 * @createdOn: Jul 14, 2020 - 10:24:56 PM
 *
 */
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)
@ToString
public class DoctorPhotoDto extends BasePhotoDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3019812864053272054L;
	
	@NotNull(message="{doctorDto.notnull}")
	private DoctorDto doctor;

}
