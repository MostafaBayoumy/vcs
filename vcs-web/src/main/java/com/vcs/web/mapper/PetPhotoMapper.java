/**
 * 
 */
package com.vcs.web.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.vcs.model.PetPhoto;
import com.vcs.web.dto.PetPhotoDto;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 10:44:57 PM
 *
 */
@Mapper(componentModel = "spring", uses={PetMapper.class})
public interface PetPhotoMapper {

	/**
	 * 
	 * @param petPhoto
	 * @return
	 */
	PetPhotoDto map(PetPhoto petPhoto);

	/**
	 * 
	 * @param petPhotoDto
	 * @return
	 */
	PetPhoto unMap(PetPhotoDto petPhotoDto);
	
	/**
	 * 
	 * @param petPhotoList
	 * @return
	 */
	List<PetPhotoDto> mapList(List<PetPhoto> petPhotoList);

	/**
	 * 
	 * @param petPhotoDtos
	 * @return
	 */
	List<PetPhoto> unMapList(List<PetPhotoDto> petPhotoDtos);
}
