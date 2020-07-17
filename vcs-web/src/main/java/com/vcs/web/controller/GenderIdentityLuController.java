package com.vcs.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcs.model.GenderIdentityLu;
import com.vcs.model.exception.BusinessException;
import com.vcs.service.GenderIdentityLuService;
import com.vcs.web.dto.GenderIdentityLuDto;
import com.vcs.web.mapper.GenderIdentityLuMapper;
import com.vcs.web.response.SuccessResponse;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: May 25, 2020 - 7:15:46 PM
 *
 */
@RestController
@RequestMapping("/gender-identity")
public class GenderIdentityLuController {

	@Autowired
	private GenderIdentityLuService genderIdentityLuService;

	@Autowired
	private GenderIdentityLuMapper genderIdentityLuMapper;

	@PostMapping(value = "/save")
	public SuccessResponse<GenderIdentityLuDto> save(@RequestBody GenderIdentityLuDto genderIdentityLuDto) throws BusinessException {
		GenderIdentityLu genderIdentityLu = genderIdentityLuMapper.unMap(genderIdentityLuDto);
		genderIdentityLu = genderIdentityLuService.save(genderIdentityLu);
		genderIdentityLuDto = genderIdentityLuMapper.map(genderIdentityLu);
		return new SuccessResponse<GenderIdentityLuDto>(genderIdentityLuDto);
	}
	
	@PutMapping(value = "/update")
	public SuccessResponse<GenderIdentityLuDto> update(@RequestBody GenderIdentityLuDto genderIdentityLuDto) throws BusinessException {
		GenderIdentityLu genderIdentityLu = genderIdentityLuMapper.unMap(genderIdentityLuDto);
		genderIdentityLu = genderIdentityLuService.save(genderIdentityLu);
		genderIdentityLuDto = genderIdentityLuMapper.map(genderIdentityLu);
		return new SuccessResponse<GenderIdentityLuDto>(genderIdentityLuDto);
	}
	
	@GetMapping(value = "/{id}")
	public SuccessResponse<GenderIdentityLuDto> getById(@PathVariable(name="id") Integer id) throws BusinessException {
		GenderIdentityLu genderIdentityLu = genderIdentityLuService.getById(id);
		GenderIdentityLuDto genderIdentityLuDto = genderIdentityLuMapper.map(genderIdentityLu);
		return new SuccessResponse<GenderIdentityLuDto>(genderIdentityLuDto);
	}
	
	@GetMapping
	public SuccessResponse<List<GenderIdentityLuDto>> getAll() throws BusinessException {
		List<GenderIdentityLu> genderIdentityLuList = genderIdentityLuService.findAll();
		List<GenderIdentityLuDto> genderIdentityLuDtos = genderIdentityLuMapper.mapList(genderIdentityLuList);
		return new SuccessResponse<List<GenderIdentityLuDto>>(genderIdentityLuDtos);
	}
	
	@DeleteMapping(value = "delete/{id}")
	public SuccessResponse<Boolean> delete(@PathVariable(name="id") Integer id) throws BusinessException {
		Boolean result = genderIdentityLuService.deleteById(id);
		return new SuccessResponse<Boolean>(result);
	}
	
}
