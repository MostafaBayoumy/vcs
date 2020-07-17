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
 * @createdOn: Jul 14, 2020 - 6:03:32 PM
 *
 */
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)
@ToString
public class PetPhotoDto extends BasePhotoDto{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5842697900101026706L;

	@NotNull(message="{pet.notnull}")
	private PetDto pet;

}
