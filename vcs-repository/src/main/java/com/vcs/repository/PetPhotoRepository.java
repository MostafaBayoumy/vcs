/**
 * 
 */
package com.vcs.repository;

import org.springframework.stereotype.Repository;

import com.vcs.model.PetPhoto;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 6:03:32 PM
 *
 */
@Repository
public interface PetPhotoRepository extends BaseRepository<Integer, PetPhoto> {

}