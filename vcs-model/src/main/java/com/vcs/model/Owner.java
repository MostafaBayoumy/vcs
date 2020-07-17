/**
 * 
 */
package com.vcs.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
@Entity
@Table(name="OWNER")
@AttributeOverride(name = "id", column = @Column(name = "OWNER_ID"))
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)
@ToString
public class Owner extends BaseEntity<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 650237294726171407L;

	@Column(name="OWNER_NAME")
	private String name;
	
	@Column(name="OWNER_EMAIL")
	private String email;

	@ManyToOne
	@JoinColumn(name = "GENDER_IDENTITY_ID")
	private GenderIdentityLu genderIdentityLu;
	
	@Column(name="OWNER_ADDRESS")
	private String address;

}
