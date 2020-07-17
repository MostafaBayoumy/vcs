package com.vcs.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcs.model.AnimalKindLu;
import com.vcs.model.exception.BusinessException;
import com.vcs.service.AnimalKindLuService;
import com.vcs.web.dto.AnimalKindLuDto;
import com.vcs.web.mapper.AnimalKindLuMapper;
import com.vcs.web.response.SuccessResponse;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: May 25, 2020 - 7:15:46 PM
 *
 */
@RestController
@RequestMapping("/animal-kind")
public class AnimalKindLuController {

	@Autowired
	private AnimalKindLuService animalKindLuService;

	@Autowired
	private AnimalKindLuMapper animalKindLuMapper;

	@PostMapping(value = "/save")
	public SuccessResponse<AnimalKindLuDto> save(@Valid @RequestBody AnimalKindLuDto animalKindLuDto) throws BusinessException {
		AnimalKindLu animalKindLu = animalKindLuMapper.unMap(animalKindLuDto);
		animalKindLu = animalKindLuService.save(animalKindLu);
		animalKindLuDto = animalKindLuMapper.map(animalKindLu);
		return new SuccessResponse<AnimalKindLuDto>(animalKindLuDto);
	}
	
	@PutMapping(value = "/update")
	public SuccessResponse<AnimalKindLuDto> update(@Valid @RequestBody AnimalKindLuDto animalKindLuDto) throws BusinessException {
		AnimalKindLu animalKindLu = animalKindLuMapper.unMap(animalKindLuDto);
		animalKindLu = animalKindLuService.save(animalKindLu);
		animalKindLuDto = animalKindLuMapper.map(animalKindLu);
		return new SuccessResponse<AnimalKindLuDto>(animalKindLuDto);
	}
	
	@GetMapping(value = "/{id}")
	public SuccessResponse<AnimalKindLuDto> getById(@PathVariable(name="id") Integer id) throws BusinessException {
		AnimalKindLu animalKindLu = animalKindLuService.getById(id);
		AnimalKindLuDto animalKindLuDto = animalKindLuMapper.map(animalKindLu);
		return new SuccessResponse<AnimalKindLuDto>(animalKindLuDto);
	}
	
	@GetMapping
	public SuccessResponse<List<AnimalKindLuDto>> getAll() throws BusinessException {
		List<AnimalKindLu> animalKindLuList = animalKindLuService.findAll();
		List<AnimalKindLuDto> animalKindLuDtos = animalKindLuMapper.mapList(animalKindLuList);
		return new SuccessResponse<List<AnimalKindLuDto>>(animalKindLuDtos);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public SuccessResponse<Boolean> delete(@PathVariable(name="id") Integer id) throws BusinessException {
		Boolean result = animalKindLuService.deleteById(id);
		return new SuccessResponse<Boolean>(result);
	}
	
}
