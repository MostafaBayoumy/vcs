/**
 * 
 */
package com.vcs.service;

import java.util.List;

import com.vcs.model.Doctor;
import com.vcs.model.exception.BusinessException;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 6:03:32 PM
 *
 */
public interface DoctorService extends BaseService<Integer, Doctor> {

	List<Doctor> findByClinicId(Integer clinicId) throws BusinessException;
}