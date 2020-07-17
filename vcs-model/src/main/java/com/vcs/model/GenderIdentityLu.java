/**
 * 
 */
package com.vcs.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 6:01:31 PM
 *
 */
@Entity
@Table(name="GENDER_IDENTITY_LU")
@AttributeOverrides({ 
	@AttributeOverride(name = "id", column = @Column(name = "GENDER_IDENTITY_ID")),
	@AttributeOverride(name = "code", column = @Column(name = "GENDER_IDENTITY_CODE")),
	@AttributeOverride(name = "desc", column = @Column(name = "GENDER_IDENTITY_DESCRIPTION")) })
public class GenderIdentityLu extends BaseLu {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1881073583154350452L;


}
