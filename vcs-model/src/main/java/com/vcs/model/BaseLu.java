package com.vcs.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 5:58:30 PM
 *
 */
@MappedSuperclass
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)
@ToString
public abstract class BaseLu extends BaseEntity<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3694551778361432688L;

	@Column
	private String code;

	@Column
	private String desc;
}
