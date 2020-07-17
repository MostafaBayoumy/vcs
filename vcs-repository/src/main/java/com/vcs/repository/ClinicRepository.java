/**
 * 
 */
package com.vcs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vcs.model.Clinic;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 6:20:31 PM
 *
 */
@Repository
public interface ClinicRepository extends BaseRepository<Integer, Clinic> {

	@Query("from Clinic c, ClinicPhoneNumber cpn where c.id = cpn.clinic.id and (cpn.phoneNumber "
			+ "LIKE CONCAT('%',:searchText,'%') or UPPER(c.address) LIKE UPPER(CONCAT('%',:searchText,'%')))")
	List<Clinic> findByPhoneNumberOrAddress(@Param("searchText") String searchText);
}