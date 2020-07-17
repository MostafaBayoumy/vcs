/**
 * 
 */
package com.vcs.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcs.model.BaseEntity;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 7:00:02 PM
 *
 */
public interface BaseRepository<ID extends Serializable, T extends BaseEntity<ID>> extends JpaRepository<T, ID> {
	
	
}
