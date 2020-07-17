/**
 * 
 */
package com.vcs.web.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.vcs.model.DoctorPhoneNumber;
import com.vcs.web.dto.DoctorPhoneNumberDto;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 10:44:57 PM
 *
 */
@Mapper(componentModel = "spring", uses={DoctorMapper.class})
public interface DoctorPhoneNumberMapper {

	/**
	 * 
	 * @param DoctorPhoneNumber
	 * @return
	 */
	DoctorPhoneNumberDto map(DoctorPhoneNumber DoctorPhoneNumber);

	/**
	 * 
	 * @param DoctorPhoneNumberDto
	 * @return
	 */
	DoctorPhoneNumber unMap(DoctorPhoneNumberDto DoctorPhoneNumberDto);
	
	/**
	 * 
	 * @param doctorPhoneNumberList
	 * @return
	 */
	List<DoctorPhoneNumberDto> mapList(List<DoctorPhoneNumber> doctorPhoneNumberList);

	/**
	 * 
	 * @param doctorPhoneNumberDtos
	 * @return
	 */
	List<DoctorPhoneNumber> unMapList(List<DoctorPhoneNumberDto> doctorPhoneNumberDtos);
}
