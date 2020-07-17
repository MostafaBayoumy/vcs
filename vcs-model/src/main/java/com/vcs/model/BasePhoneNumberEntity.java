/**
 * 
 */
package com.vcs.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 5:58:19 PM
 *
 */
@MappedSuperclass
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public abstract class BasePhoneNumberEntity<ID extends Serializable> extends BaseEntity<ID> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7972990234950681023L;
	
	@Column
	private String phoneNumber;

}
