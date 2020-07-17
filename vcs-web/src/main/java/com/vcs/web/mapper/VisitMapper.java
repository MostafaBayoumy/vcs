/**
 * 
 */
package com.vcs.web.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.vcs.model.Visit;
import com.vcs.web.dto.VisitDto;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 10:44:57 PM
 *
 */
@Mapper(componentModel = "spring", uses={PetMapper.class, DoctorMapper.class, ClinicMapper.class})
public interface VisitMapper {

	/**
	 * 
	 * @param visit
	 * @return
	 */
	VisitDto map(Visit visit);

	/**
	 * 
	 * @param visitDto
	 * @return
	 */
	Visit unMap(VisitDto visitDto);
	
	/**
	 * 
	 * @param visits
	 * @return
	 */
	List<VisitDto> mapList(List<Visit> visits);

	/**
	 * 
	 * @param visitDtos
	 * @return
	 */
	List<Visit> unMapList(List<VisitDto> visitDtos);
}
