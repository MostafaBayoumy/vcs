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
@Table(name="VISIT")
@AttributeOverride(name = "id", column = @Column(name = "VISIT_ID"))
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)
@ToString
public class Visit extends BaseEntity<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 827800107632861934L;
	
	@ManyToOne
	@JoinColumn(name = "PET_ID")
	private Pet pet;
	
	@ManyToOne
	@JoinColumn(name = "DOCTOR_ID")
	private Doctor doctor;
	
	@ManyToOne
	@JoinColumn(name = "CLINIC_ID")
	private Clinic clinic;
	
	@Column(name="VISIT_DATE")
	private Date visitDate;

}
