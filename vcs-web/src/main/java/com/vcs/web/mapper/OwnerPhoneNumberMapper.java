/**
 * 
 */
package com.vcs.web.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.vcs.model.OwnerPhoneNumber;
import com.vcs.web.dto.OwnerPhoneNumberDto;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 10:44:57 PM
 *
 */
@Mapper(componentModel = "spring", uses={OwnerMapper.class})
public interface OwnerPhoneNumberMapper {

	/**
	 * 
	 * @param ownerPhoneNumber
	 * @return
	 */
	OwnerPhoneNumberDto map(OwnerPhoneNumber ownerPhoneNumber);

	/**
	 * 
	 * @param ownerPhoneNumberDto
	 * @return
	 */
	OwnerPhoneNumber unMap(OwnerPhoneNumberDto ownerPhoneNumberDto);
	
	/**
	 * 
	 * @param ownerPhoneNumberList
	 * @return
	 */
	List<OwnerPhoneNumberDto> mapList(List<OwnerPhoneNumber> ownerPhoneNumberList);

	/**
	 * 
	 * @param ownerPhoneNumberDtos
	 * @return
	 */
	List<OwnerPhoneNumber> unMapList(List<OwnerPhoneNumberDto> ownerPhoneNumberDtos);
}
