/**
 * 
 */
package com.vcs.web.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.vcs.model.Doctor;
import com.vcs.web.dto.DoctorDto;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 10:44:57 PM
 *
 */
@Mapper(componentModel = "spring", uses={ClinicMapper.class})
public interface DoctorMapper {

	/**
	 * 
	 * @param doctor
	 * @return
	 */
	DoctorDto map(Doctor doctor);

	/**
	 * 
	 * @param doctorDto
	 * @return
	 */
	Doctor unMap(DoctorDto doctorDto);
	
	/**
	 * 
	 * @param doctorList
	 * @return
	 */
	List<DoctorDto> mapList(List<Doctor> doctorList);

	/**
	 * 
	 * @param doctorDtos
	 * @return
	 */
	List<Doctor> unMapList(List<DoctorDto> doctorDtos);
}
