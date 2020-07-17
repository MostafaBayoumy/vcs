/**
 * 
 */
package com.vcs.model;

import java.util.Date;

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
@Table(name="PET")
@AttributeOverride(name = "id", column = @Column(name = "PET_ID"))@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)
@ToString
public class Pet extends BaseEntity<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3562807609419529993L;

	@Column(name="PET_NAME")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "GENDER_IDENTITY_ID")
	private GenderIdentityLu genderIdentityLu;
	
	@Column(name="PET_BIRTH_DATE")
	private Date birthDate;
	
	@ManyToOne
	@JoinColumn(name = "ANIMAL_KIND_ID")
	private AnimalKindLu animalKindLu;
	
	@Column(name="PET_WEIGHT")
	private Float weight;
	
	@ManyToOne
	@JoinColumn(name = "OWNER_ID")
	private Owner owner;

}
