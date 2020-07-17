/**
 * 
 */
package com.vcs.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
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
 * @createdOn: Jul 14, 2020 - 6:06:46 PM
 *
 */
@Entity
@Table(name="OWNER_PHONE_NUMBER")
@AttributeOverrides({ 
	@AttributeOverride(name = "id", column = @Column(name = "OWNER_PHONE_NUMBER_ID")),
	@AttributeOverride(name = "phoneNumber", column = @Column(name = "OWNER_PHONE_NUMBER"))})
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)
@ToString
public class OwnerPhoneNumber extends BasePhoneNumberEntity<Integer>{


	/**
	 * 
	 */
	private static final long serialVersionUID = 8307356200703522598L;

	@ManyToOne
	@JoinColumn(name = "OWNER_ID")
	private Owner owner;

}
