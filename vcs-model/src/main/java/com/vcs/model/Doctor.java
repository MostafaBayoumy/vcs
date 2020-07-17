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
@Table(name="DOCTOR")
@AttributeOverride(name = "id", column = @Column(name = "DOCTOR_ID"))
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)
@ToString
public class Doctor extends BaseEntity<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1865291819477637203L;

	@Column(name="DOCTOR_NAME")
	private String name;
	
	@Column(name="DOCTOR_BIO")
	private String bio;
	
	@ManyToOne
	@JoinColumn(name = "CLINIC_ID")
	private Clinic clinic;
	
}
