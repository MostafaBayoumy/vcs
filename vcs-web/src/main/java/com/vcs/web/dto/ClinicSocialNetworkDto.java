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
 * @createdOn: Jul 14, 2020 - 6:20:31 PM
 *
 */
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)
@ToString
public class ClinicSocialNetworkDto extends BaseDto<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8459679330773261039L;

	@NotNull(message="{clinicSocialNetworkDto.code.notnull}")
	private String code;
	
	@NotNull(message="{clinicSocialNetworkDto.url.notnull}")
	private String url;
	
	@NotNull(message="{clinicDto.notnull}")
	private ClinicDto clinic;
	
}
