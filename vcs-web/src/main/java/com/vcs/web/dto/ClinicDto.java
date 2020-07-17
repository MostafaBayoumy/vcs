/**
 * 
 */
package com.vcs.web.dto;

import java.sql.Time;

import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 6:20:31 PM
 *
 */
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)
@ToString
public class ClinicDto extends BaseDto<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -690436937735567367L;

	@NotNull(message="{clinicDto.name.notnull}")
	private String name;
	
	@NotNull(message="{clinicDto.address.notnull}")
	private String address;
	
	@NotNull(message="{clinicDto.workingDays.notnull}")
	private String workingDays;
	
	@NotNull(message="{clinicDto.openTime.notnull}")
	private Time openTime;
	
	@NotNull(message="{clinicDto.closeTime.notnull}")
	private Time closeTime;
	
	@NotNull(message="{clinicDto.email.notnull}")
	private String email;
	
}
