/**
 * 
 */
package com.vcs.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.vcs.model.Doctor;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 6:03:32 PM
 *
 */
@Repository
public interface DoctorRepository extends BaseRepository<Integer, Doctor> {

	List<Doctor> findByClinic_id(Integer clinicId);
}