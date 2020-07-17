/**
 * 
 */
package com.vcs.web.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.vcs.model.Owner;
import com.vcs.web.dto.OwnerDto;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 10:44:57 PM
 *
 */
@Mapper(componentModel = "spring", uses={GenderIdentityLuMapper.class})
public interface OwnerMapper {

	/**
	 * 
	 * @param owner
	 * @return
	 */
	OwnerDto map(Owner owner);

	/**
	 * 
	 * @param ownerDto
	 * @return
	 */
	Owner unMap(OwnerDto ownerDto);
	
	/**
	 * 
	 * @param ownerList
	 * @return
	 */
	List<OwnerDto> mapList(List<Owner> ownerList);

	/**
	 * 
	 * @param ownerDtos
	 * @return
	 */
	List<Owner> unMapList(List<OwnerDto> ownerDtos);
}
