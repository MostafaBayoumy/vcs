/**
 * 
 */
package com.vcs.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.vcs.model.Pet;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 6:03:32 PM
 *
 */
@Repository
public interface PetRepository extends BaseRepository<Integer, Pet> {

	List<Pet> findByOwner_id(Integer ownerId);
}