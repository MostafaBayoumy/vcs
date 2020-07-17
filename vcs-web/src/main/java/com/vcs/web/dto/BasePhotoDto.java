/**
 * 
 */
package com.vcs.web.dto;

import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 10:16:10 PM
 *
 */
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public abstract class BasePhotoDto extends BaseDto<Integer> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7519584710286607605L;

	@NotNull(message="{photoName.notnull}")
	private String photoName;
	
	@NotNull(message="{photoLocation.notnull}")
	private String photoLocation;

}
