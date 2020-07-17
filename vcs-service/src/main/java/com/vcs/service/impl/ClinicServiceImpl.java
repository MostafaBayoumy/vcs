/**
 * 
 */
package com.vcs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcs.model.Clinic;
import com.vcs.model.exception.BusinessException;
import com.vcs.repository.ClinicRepository;
import com.vcs.service.ClinicService;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 6:20:31 PM
 *
 */
@Service
public class ClinicServiceImpl extends BaseServiceImpl<Integer, Clinic> implements ClinicService {

	@Autowired
	private ClinicRepository clinicRepository;
	
	@Override
	public List<Clinic> findByPhoneNumberOrAddress(String searchText) throws BusinessException {
		return clinicRepository.findByPhoneNumberOrAddress(searchText);
	}

}