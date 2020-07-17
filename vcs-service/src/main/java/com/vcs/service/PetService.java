/**
 * 
 */
package com.vcs.service;

import java.util.List;

import com.vcs.model.Pet;
import com.vcs.model.exception.BusinessException;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 6:03:32 PM
 *
 */
public interface PetService extends BaseService<Integer, Pet> {

	List<Pet> findByOwnerId(Integer ownerId) throws BusinessException;
}