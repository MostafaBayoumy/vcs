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
 * @createdOn: Jul 14, 2020 - 6:02:45 PM
 *
 */
@Entity
@Table(name="ANIMAL_KIND_LU")
@AttributeOverrides({ 
	@AttributeOverride(name = "id", column = @Column(name = "ANIMAL_KIND_ID")),
	@AttributeOverride(name = "code", column = @Column(name = "ANIMAL_KIND_CODE")),
	@AttributeOverride(name = "desc", column = @Column(name = "ANIMAL_KIND_DESCRIPTION")) })
public class AnimalKindLu extends BaseLu {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6853058931562134167L;

}
