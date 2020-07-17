/**
 * 
 */
package com.vcs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcs.model.Doctor;
import com.vcs.model.exception.BusinessException;
import com.vcs.repository.DoctorRepository;
import com.vcs.service.DoctorService;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 6:03:32 PM
 *
 */
@Service
public class DoctorServiceImpl extends BaseServiceImpl<Integer, Doctor> implements DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;
	
	@Override
	public List<Doctor> findByClinicId(Integer clinicId) throws BusinessException {
		return doctorRepository.findByClinic_id(clinicId);
	}

}