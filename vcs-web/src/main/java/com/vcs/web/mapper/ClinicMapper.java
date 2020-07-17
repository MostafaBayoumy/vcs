/**
 * 
 */
package com.vcs.web.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.vcs.model.Clinic;
import com.vcs.web.dto.ClinicDto;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 10:44:57 PM
 *
 */
@Mapper(componentModel = "spring")
public interface ClinicMapper {

	/**
	 * 
	 * @param clinic
	 * @return
	 */
	ClinicDto map(Clinic clinic);

	/**
	 * 
	 * @param clinicDto
	 * @return
	 */
	Clinic unMap(ClinicDto clinicDto);
	
	/**
	 * 
	 * @param clinicList
	 * @return
	 */
	List<ClinicDto> mapList(List<Clinic> clinicList);

	/**
	 * 
	 * @param clinicDtos
	 * @return
	 */
	List<Clinic> unMapList(List<ClinicDto> clinicDtos);
}
