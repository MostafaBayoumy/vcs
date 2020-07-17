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
public abstract class BasePhotoEntity<ID extends Serializable> extends BaseEntity<ID> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4480593017607392798L;
	
	@Column
	private String photoName;
	
	@Column
	private String photoLocation;

}
