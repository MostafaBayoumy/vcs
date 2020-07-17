/**
 * 
 */
package com.vcs.web.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.vcs.model.Pet;
import com.vcs.web.dto.PetDto;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 10:44:57 PM
 *
 */
@Mapper(componentModel = "spring", uses={GenderIdentityLuMapper.class, AnimalKindLuMapper.class, OwnerMapper.class})
public interface PetMapper {

	/**
	 * 
	 * @param pet
	 * @return
	 */
	PetDto map(Pet pet);

	/**
	 * 
	 * @param petDto
	 * @return
	 */
	Pet unMap(PetDto petDto);
	
	/**
	 * 
	 * @param petList
	 * @return
	 */
	List<PetDto> mapList(List<Pet> petList);

	/**
	 * 
	 * @param petDtos
	 * @return
	 */
	List<Pet> unMapList(List<PetDto> petDtos);
}
