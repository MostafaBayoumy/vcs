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
 * @createdOn: Jul 14, 2020 - 10:28:33 PM
 *
 */
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)
@ToString
public class OwnerDto extends BaseDto<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7694197267268093087L;

	@NotNull(message="{ownerDto.name.notnull}")
	private String name;
	
	@NotNull(message="{ownerDto.email.notnull}")
	private String email;

	@NotNull(message="{genderIdentityLu.notnull}")
	private GenderIdentityLuDto genderIdentityLu;
	
	@NotNull(message="{ownerDto.address.notnull}")
	private String address;

}
