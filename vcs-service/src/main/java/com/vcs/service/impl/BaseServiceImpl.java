/**
 * 
 */
package com.vcs.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vcs.model.BaseEntity;
import com.vcs.model.exception.BusinessException;
import com.vcs.repository.BaseRepository;
import com.vcs.service.BaseService;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 8:45:08 PM
 *
 */
@Service
public abstract class BaseServiceImpl<ID extends Serializable, T extends BaseEntity<ID>>
		implements BaseService<ID, T> {

	@Autowired
	private BaseRepository<ID, T> baseRepository;


	@Override
	@Transactional
	public T save (T entity) throws BusinessException {
		return baseRepository.save(entity);
	}
	
	@Override
	@Transactional
	public Boolean deleteById(ID id) throws BusinessException {
		baseRepository.deleteById(id);
		return true;
	}

	@Override
	@Transactional(readOnly=true)
	public T getById(ID id) throws BusinessException {
		return baseRepository.getOne(id);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<T> findAll() throws BusinessException {
		return baseRepository.findAll();
	}
	
}
