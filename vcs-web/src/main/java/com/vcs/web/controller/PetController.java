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

import com.vcs.model.Pet;
import com.vcs.model.exception.BusinessException;
import com.vcs.service.PetService;
import com.vcs.web.dto.PetDto;
import com.vcs.web.mapper.PetMapper;
import com.vcs.web.response.SuccessResponse;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: May 25, 2020 - 7:15:46 PM
 *
 */
@RestController
@RequestMapping("/pet")
public class PetController {

	@Autowired
	private PetService petService;

	@Autowired
	private PetMapper petMapper;

	@PostMapping(value = "/save")
	public SuccessResponse<PetDto> save(@RequestBody PetDto petDto) throws BusinessException {
		Pet pet = petMapper.unMap(petDto);
		pet = petService.save(pet);
		petDto = petMapper.map(pet);
		return new SuccessResponse<PetDto>(petDto);
	}
	
	@PutMapping(value = "/update")
	public SuccessResponse<PetDto> update(@RequestBody PetDto petDto) throws BusinessException {
		Pet pet = petMapper.unMap(petDto);
		pet = petService.save(pet);
		petDto = petMapper.map(pet);
		return new SuccessResponse<PetDto>(petDto);
	}
	
	@GetMapping(value = "/{id}")
	public SuccessResponse<PetDto> getById(@PathVariable(name="id") Integer id) throws BusinessException {
		Pet pet = petService.getById(id);
		PetDto petDto = petMapper.map(pet);
		return new SuccessResponse<PetDto>(petDto);
	}
	
	@GetMapping(value = "/owner/{ownerId}")
	public SuccessResponse<List<PetDto>> getByOwnerId(@PathVariable(name="ownerId") Integer ownerId) throws BusinessException {
		List<Pet> pets = petService.findByOwnerId(ownerId);
		List<PetDto> petDtos = petMapper.mapList(pets);
		return new SuccessResponse<List<PetDto>>(petDtos);
	}
	
	@GetMapping
	public SuccessResponse<List<PetDto>> getAll() throws BusinessException {
		List<Pet> pets = petService.findAll();
		List<PetDto> petDtos = petMapper.mapList(pets);
		return new SuccessResponse<List<PetDto>>(petDtos);
	}
	
	@DeleteMapping(value = "delete/{id}")
	public SuccessResponse<Boolean> delete(@PathVariable(name="id") Integer id) throws BusinessException {
		return new SuccessResponse<Boolean>(petService.deleteById(id));
	}
	
}
