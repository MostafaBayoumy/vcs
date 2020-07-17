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
 * @createdOn: Jul 14, 2020 - 6:29:41 PM
 *
 */
@Entity
@Table(name="CLINIC_PHONE_NUMBER")
@AttributeOverrides({ 
	@AttributeOverride(name = "id", column = @Column(name = "CLINIC_PHONE_NUMBER_ID")),
	@AttributeOverride(name = "phoneNumber", column = @Column(name = "CLINIC_PHONE_NUMBER"))})
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)
@ToString
public class ClinicPhoneNumber extends BasePhoneNumberEntity<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3506070824679513794L;

	@ManyToOne
	@JoinColumn(name = "CLINIC_ID")
	private Clinic clinic;

}
