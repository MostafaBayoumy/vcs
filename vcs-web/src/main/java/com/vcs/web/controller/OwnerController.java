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

import com.vcs.model.Owner;
import com.vcs.model.exception.BusinessException;
import com.vcs.service.OwnerService;
import com.vcs.web.dto.OwnerDto;
import com.vcs.web.mapper.OwnerMapper;
import com.vcs.web.response.SuccessResponse;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: May 25, 2020 - 7:15:46 PM
 *
 */
@RestController
@RequestMapping("/owner")
public class OwnerController {

	@Autowired
	private OwnerService ownerService;

	@Autowired
	private OwnerMapper ownerMapper;

	@PostMapping(value = "/save")
	public SuccessResponse<OwnerDto> save(@RequestBody OwnerDto ownerDto) throws BusinessException {
		Owner owner = ownerMapper.unMap(ownerDto);
		owner = ownerService.save(owner);
		ownerDto = ownerMapper.map(owner);
		return new SuccessResponse<OwnerDto>(ownerDto);
	}
	
	@PutMapping(value = "/update")
	public SuccessResponse<OwnerDto> update(@RequestBody OwnerDto ownerDto) throws BusinessException {
		Owner owner = ownerMapper.unMap(ownerDto);
		owner = ownerService.save(owner);
		ownerDto = ownerMapper.map(owner);
		return new SuccessResponse<OwnerDto>(ownerDto);
	}
	
	@GetMapping(value = "/{id}")
	public SuccessResponse<OwnerDto> getById(@PathVariable(name="id") Integer id) throws BusinessException {
		Owner owner = ownerService.getById(id);
		OwnerDto ownerDto = ownerMapper.map(owner);
		return new SuccessResponse<OwnerDto>(ownerDto);
	}
	
	@GetMapping
	public SuccessResponse<List<OwnerDto>> getAll() throws BusinessException {
		List<Owner> owners = ownerService.findAll();
		List<OwnerDto> ownerDtos = ownerMapper.mapList(owners);
		return new SuccessResponse<List<OwnerDto>>(ownerDtos);
	}
	
	@DeleteMapping(value = "delete/{id}")
	public SuccessResponse<Boolean> delete(@PathVariable(name="id") Integer id) throws BusinessException {
		Boolean result = ownerService.deleteById(id);
		return new SuccessResponse<Boolean>(result);
	}
	
}
