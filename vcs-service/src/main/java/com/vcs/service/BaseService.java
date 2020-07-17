/**
 * 
 */
package com.vcs.service;

import java.io.Serializable;
import java.util.List;

import com.vcs.model.BaseEntity;
import com.vcs.model.exception.BusinessException;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 7:10:07 PM
 *
 */
public interface BaseService<ID extends Serializable, T extends BaseEntity<ID>> {
	/**
	 * Create an entity in the DB
	 * @param entity
	 * @throws BusinessException
	 */
	T save (T entity) throws BusinessException;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws BusinessException
	 */
	Boolean deleteById(ID id) throws BusinessException;
	
	/**
	 * Get Element By ID
	 * @param id
	 * @return
	 * @throws BusinessException
	 */
	T getById(ID id) throws BusinessException;

	/**
	 * 
	 * @return
	 * @throws BusinessException
	 */
	List<T> findAll() throws BusinessException;
	
	
}
