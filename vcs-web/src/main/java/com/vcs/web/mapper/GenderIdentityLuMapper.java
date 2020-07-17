/**
 * 
 */
package com.vcs.web.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.vcs.model.GenderIdentityLu;
import com.vcs.web.dto.GenderIdentityLuDto;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 10:44:57 PM
 *
 */
@Mapper(componentModel = "spring")
public interface GenderIdentityLuMapper {

	/**
	 * 
	 * @param genderIdentityLu
	 * @return
	 */
	GenderIdentityLuDto map(GenderIdentityLu genderIdentityLu);

	/**
	 * 
	 * @param genderIdentityLuDto
	 * @return
	 */
	GenderIdentityLu unMap(GenderIdentityLuDto genderIdentityLuDto);
	
	/**
	 * 
	 * @param genderIdentityLuList
	 * @return
	 */
	List<GenderIdentityLuDto> mapList(List<GenderIdentityLu> genderIdentityLuList);

	/**
	 * 
	 * @param genderIdentityLuDtos
	 * @return
	 */
	List<GenderIdentityLu> unMapList(List<GenderIdentityLuDto> genderIdentityLuDtos);
}
