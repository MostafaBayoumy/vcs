/**
 * 
 */
package com.vcs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcs.model.Pet;
import com.vcs.model.exception.BusinessException;
import com.vcs.repository.PetRepository;
import com.vcs.service.PetService;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 6:03:32 PM
 *
 */
@Service
public class PetServiceImpl extends BaseServiceImpl<Integer, Pet> implements PetService {

	@Autowired
	private PetRepository petRepository;
	@Override
	public List<Pet> findByOwnerId(Integer ownerId) throws BusinessException {
		return petRepository.findByOwner_id(ownerId);
	}

}