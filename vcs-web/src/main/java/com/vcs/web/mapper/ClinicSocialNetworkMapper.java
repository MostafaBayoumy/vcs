/**
 * 
 */
package com.vcs.web.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.vcs.model.ClinicSocialNetwork;
import com.vcs.web.dto.ClinicSocialNetworkDto;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 10:44:57 PM
 *
 */
@Mapper(componentModel = "spring", uses={ClinicMapper.class})
public interface ClinicSocialNetworkMapper {

	/**
	 * 
	 * @param clinicSocialNetwork
	 * @return
	 */
	ClinicSocialNetworkDto map(ClinicSocialNetwork clinicSocialNetwork);

	/**
	 * 
	 * @param clinicSocialNetworkDto
	 * @return
	 */
	ClinicSocialNetwork unMap(ClinicSocialNetworkDto clinicSocialNetworkDto);
	
	/**
	 * 
	 * @param clinicSocialNetworkList
	 * @return
	 */
	List<ClinicSocialNetworkDto> mapList(List<ClinicSocialNetwork> clinicSocialNetworkList);

	/**
	 * 
	 * @param clinicSocialNetworkDtos
	 * @return
	 */
	List<ClinicSocialNetwork> unMapList(List<ClinicSocialNetworkDto> clinicSocialNetworkDtos);
}
