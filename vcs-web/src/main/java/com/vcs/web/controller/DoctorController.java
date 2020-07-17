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

import com.vcs.model.Doctor;
import com.vcs.model.exception.BusinessException;
import com.vcs.service.DoctorService;
import com.vcs.web.dto.DoctorDto;
import com.vcs.web.mapper.DoctorMapper;
import com.vcs.web.response.SuccessResponse;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: May 25, 2020 - 7:15:46 PM
 *
 */
@RestController
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;

	@Autowired
	private DoctorMapper doctorMapper;

	@PostMapping(value = "/save")
	public SuccessResponse<DoctorDto> save(@RequestBody DoctorDto doctorDto) throws BusinessException {
		Doctor doctor = doctorMapper.unMap(doctorDto);
		doctor = doctorService.save(doctor);
		doctorDto = doctorMapper.map(doctor);
		return new SuccessResponse<DoctorDto>(doctorDto);
	}
	
	@PutMapping(value = "/update")
	public SuccessResponse<DoctorDto> update(@RequestBody DoctorDto doctorDto) throws BusinessException {
		Doctor doctor = doctorMapper.unMap(doctorDto);
		doctor = doctorService.save(doctor);
		doctorDto = doctorMapper.map(doctor);
		return new SuccessResponse<DoctorDto>(doctorDto);
	}
	
	@GetMapping(value = "/{id}")
	public DoctorDto getById(@PathVariable(name="id") Integer id) throws BusinessException {
		Doctor doctor = doctorService.getById(id);
		return doctorMapper.map(doctor);
	}
	
	@GetMapping(value = "/clinic/{clinicId}")
	public SuccessResponse<List<DoctorDto>> getByOwnerId(@PathVariable(name="clinicId") Integer clinicId) throws BusinessException {
		List<Doctor> doctors = doctorService.findByClinicId(clinicId);
		List<DoctorDto> doctorDtos = doctorMapper.mapList(doctors);
		return new SuccessResponse<List<DoctorDto>>(doctorDtos);
	}
	
	@GetMapping
	public SuccessResponse<List<DoctorDto>> getAll() throws BusinessException {
		List<Doctor> doctors = doctorService.findAll();
		List<DoctorDto> doctorDtos = doctorMapper.mapList(doctors);
		return new SuccessResponse<List<DoctorDto>>(doctorDtos);
	}
	
	@DeleteMapping(value = "delete/{id}")
	public SuccessResponse<Boolean> delete(@PathVariable(name="id") Integer id) throws BusinessException {
		Boolean result = doctorService.deleteById(id);
		return new SuccessResponse<Boolean>(result);
	}
	
}
