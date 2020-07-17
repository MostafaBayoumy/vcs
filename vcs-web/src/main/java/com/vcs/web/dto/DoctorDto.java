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
 * @createdOn: Jul 14, 2020 - 10:23:30 PM
 *
 */
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)
@ToString
public class DoctorDto extends BaseDto<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2911785939705335011L;

	@NotNull(message="{doctorDto.name.notnull}")
	private String name;
	
	@NotNull(message="{doctorDto.bio.notnull}")
	private String bio;
	
	@NotNull(message="{clinicDto.notnull}")
	private ClinicDto clinic;

}
