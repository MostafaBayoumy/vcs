/**
 * 
 */
package com.vcs.web.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.vcs.model.DoctorPhoto;
import com.vcs.web.dto.DoctorPhotoDto;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: Jul 14, 2020 - 10:44:57 PM
 *
 */
@Mapper(componentModel = "spring", uses={DoctorMapper.class})
public interface DoctorPhotoMapper {

	/**
	 * 
	 * @param doctorPhoto
	 * @return
	 */
	DoctorPhotoDto map(DoctorPhoto doctorPhoto);

	/**
	 * 
	 * @param doctorPhotoDto
	 * @return
	 */
	DoctorPhoto unMap(DoctorPhotoDto doctorPhotoDto);
	
	/**
	 * 
	 * @param doctorPhotoList
	 * @return
	 */
	List<DoctorPhotoDto> mapList(List<DoctorPhoto> doctorPhotoList);

	/**
	 * 
	 * @param doctorPhotoDtos
	 * @return
	 */
	List<DoctorPhoto> unMapList(List<DoctorPhotoDto> doctorPhotoDtos);
}
