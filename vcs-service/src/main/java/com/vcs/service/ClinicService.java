/**
 * 
 */
package com.vcs.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.vcs.model.Clinic;
import com.vcs.model.exception.BusinessException;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 6:20:31 PM
 *
 */
public interface ClinicService extends BaseService<Integer, Clinic> {
	
	List<Clinic> findByPhoneNumberOrAddress(@Param("searchText") String searchText) throws BusinessException;
	
}