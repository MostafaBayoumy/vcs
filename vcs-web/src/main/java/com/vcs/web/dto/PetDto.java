/**
 * 
 */
package com.vcs.web.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 10:31:53 PM
 *
 */
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)
@ToString
public class PetDto extends BaseDto<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5114832128372596435L;

	@NotNull(message="{petDto.name.notnull}")
	private String name;
	
	@NotNull(message="{genderIdentityLu.notnull}")
	private GenderIdentityLuDto genderIdentityLu;
	
	@NotNull(message="{petDto.birthDate.notnull}")
	private Date birthDate;
	
	@NotNull(message="{animalKindLu.notnull}")
	private AnimalKindLuDto animalKindLu;
	
	@NotNull(message="{petDto.weight.notnull}")
	private Float weight;
	
	@NotNull(message="{owner.notnull}")
	private OwnerDto owner;
	
}
