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
 * @createdOn: Jul 14, 2020 - 6:36:01 PM
 *
 */
@Entity
@Table(name="DOCTOR_PHOTO")
@AttributeOverrides({ 
	@AttributeOverride(name = "id", column = @Column(name = "DOCTOR_PHOTO_ID")),
	@AttributeOverride(name = "photoName", column = @Column(name = "DOCTOR_PHOTO_NAME")),
	@AttributeOverride(name = "photoLocation", column = @Column(name = "DOCTOR_PHOTO_LOCATION")) })
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)
@ToString
public class DoctorPhoto extends BasePhotoEntity<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6828092261987295504L;

	@ManyToOne
	@JoinColumn(name = "DOCTOR_ID")
	private Doctor doctor;

}
