/**
 * 
 */
package com.vcs.web.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.vcs.model.AnimalKindLu;
import com.vcs.web.dto.AnimalKindLuDto;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 10:44:57 PM
 *
 */
@Mapper(componentModel = "spring")
public interface AnimalKindLuMapper {

	/**
	 * 
	 * @param animalKindLu
	 * @return
	 */
	AnimalKindLuDto map(AnimalKindLu animalKindLu);

	/**
	 * 
	 * @param animalKindLuDto
	 * @return
	 */
	AnimalKindLu unMap(AnimalKindLuDto animalKindLuDto);
	
	/**
	 * 
	 * @param animalKindLuList
	 * @return
	 */
	List<AnimalKindLuDto> mapList(List<AnimalKindLu> animalKindLuList);

	/**
	 * 
	 * @param animalKindLuDtos
	 * @return
	 */
	List<AnimalKindLu> unMapList(List<AnimalKindLuDto> animalKindLuDtos);
}
