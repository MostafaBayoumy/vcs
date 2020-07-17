/**
 * 
 */
package com.vcs.web.dto;

import java.sql.Timestamp;

import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 6:03:32 PM
 *
 */
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)
@ToString
public class VisitDto extends BaseDto<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6270224244604341423L;

	@NotNull(message="{petDto.notnull}")
	private PetDto pet;
	
	@NotNull(message="{doctorDto.notnull}")
	private DoctorDto doctor;
	
	@NotNull(message="{clinicDto.notnull}")
	private ClinicDto clinic;
	
	@NotNull(message="{visitDto.visitDate.notnull}")
	private Timestamp visitDate;

}
