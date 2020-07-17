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
 * @createdOn: Jul 14, 2020 - 10:14:23 PM
 *
 */
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)
@ToString
public abstract class BaseLuDto extends BaseDto<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4063821560725143889L;
	
	@NotNull(message="{lookup.desc.notnull}")
	private String desc;
	
	@NotNull(message="{lookup.code.notnull}")
	private String code;

}
