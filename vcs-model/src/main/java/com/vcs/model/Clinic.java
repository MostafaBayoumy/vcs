/**
 * 
 */
package com.vcs.model;

import java.sql.Time;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 6:20:31 PM
 *
 */
@Entity
@Table(name="CLINIC")
@AttributeOverride(name = "id", column = @Column(name = "CLINIC_ID"))
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)
@ToString
public class Clinic extends BaseEntity<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3167699246322567898L;

	@Column(name="CLINIC_NAME")
	private String name;
	
	@Column(name="CLINIC_ADDRESS")
	private String address;
	
	@Column(name="CLINIC_WORKING_DAYS")
	private String workingDays;
	
	@Column(name="CLINIC_OPEN_TIME")
	private Time openTime;
	
	@Column(name="CLINIC_CLOSE_TIME")
	private Time closeTime;
	
	@Column(name="CLINIC_EMAIL")
	private String email;

}
