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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vcs.model.Clinic;
import com.vcs.model.exception.BusinessException;
import com.vcs.service.ClinicService;
import com.vcs.web.dto.ClinicDto;
import com.vcs.web.mapper.ClinicMapper;
import com.vcs.web.response.SuccessResponse;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: May 25, 2020 - 7:15:46 PM
 *
 */
@RestController
@RequestMapping("/clinic")
public class ClinicController {

	@Autowired
	private ClinicService clinicService;

	@Autowired
	private ClinicMapper clinicMapper;

	@PostMapping(value = "/save")
	public SuccessResponse<ClinicDto> save(@RequestBody ClinicDto clinicDto) throws BusinessException {
		Clinic clinic = clinicMapper.unMap(clinicDto);
		clinic = clinicService.save(clinic);
		clinicDto = clinicMapper.map(clinic);
		return new SuccessResponse<ClinicDto>(clinicDto);
	}
	
	@PutMapping(value = "/update")
	public SuccessResponse<ClinicDto> update(@RequestBody ClinicDto clinicDto) throws BusinessException {
		Clinic clinic = clinicMapper.unMap(clinicDto);
		clinic = clinicService.save(clinic);
		clinicDto = clinicMapper.map(clinic);
		return new SuccessResponse<ClinicDto>(clinicDto);
	}
	
	@GetMapping(value = "/{id}")
	public SuccessResponse<ClinicDto> getById(@PathVariable(name="id") Integer id) throws BusinessException {
		Clinic clinic = clinicService.getById(id);
		ClinicDto clinicDto = clinicMapper.map(clinic);
		return new SuccessResponse<ClinicDto>(clinicDto);
	}
	
	@GetMapping(value = "/search")
	public SuccessResponse<List<ClinicDto>> findByPhoneNumberOrAddress(@RequestParam(name="searchText") String searchText) throws BusinessException {
		List<Clinic> clinicList = clinicService.findByPhoneNumberOrAddress(searchText);
		List<ClinicDto> clinicDtos = clinicMapper.mapList(clinicList);
		return new SuccessResponse<List<ClinicDto>>(clinicDtos);
	}
	
	@GetMapping
	public SuccessResponse<List<ClinicDto>> getAll() throws BusinessException {
		List<Clinic> clinics = clinicService.findAll();
		List<ClinicDto> clinicDtos = clinicMapper.mapList(clinics);
		return new SuccessResponse<List<ClinicDto>>(clinicDtos);
	}
	
	@DeleteMapping(value = "delete/{id}")
	public SuccessResponse<Boolean> delete(@PathVariable(name="id") Integer id) throws BusinessException {
		Boolean result = clinicService.deleteById(id);
		return new SuccessResponse<Boolean>(result);
	}
	
}
