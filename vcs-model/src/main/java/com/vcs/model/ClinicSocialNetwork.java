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
 * @createdOn: Jul 14, 2020 - 6:20:31 PM
 *
 */
@Entity
@Table(name="CLINIC_SOCIAL_NETWORK")
@AttributeOverride(name = "id", column = @Column(name = "CLINIC_SOCIAL_NETWORK_ID"))
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true)
@ToString
public class ClinicSocialNetwork extends BaseEntity<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4647534378529145974L;

	@Column(name="CLINIC_SOCIAL_NETWORK_CODE")
	private String code;
	
	@Column(name="CLINIC_SOCIAL_NETWORK_URL")
	private String url;
	
	@ManyToOne
	@JoinColumn(name = "CLINIC_ID")
	private Clinic clinic;

}
