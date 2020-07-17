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

import com.vcs.model.Visit;
import com.vcs.model.exception.BusinessException;
import com.vcs.service.VisitService;
import com.vcs.web.dto.VisitDto;
import com.vcs.web.mapper.VisitMapper;
import com.vcs.web.response.SuccessResponse;

/**
 * @createdBy: Moustafa.Bayoumy
 * @createdOn: May 25, 2020 - 7:15:46 PM
 *
 */
@RestController
@RequestMapping("/visit")
public class VisitController {

	@Autowired
	private VisitService visitService;

	@Autowired
	private VisitMapper visitMapper;

	@PostMapping(value = "/save")
	public SuccessResponse<VisitDto> save(@Valid @RequestBody VisitDto visitDto) throws BusinessException {
		Visit visit = visitMapper.unMap(visitDto);
		visit = visitService.save(visit);
		visitDto = visitMapper.map(visit);
		return new SuccessResponse<VisitDto>(visitDto);
	}
	
	@PutMapping(value = "/update")
	public SuccessResponse<VisitDto> update(@Valid @RequestBody VisitDto visitDto) throws BusinessException {
		Visit visit = visitMapper.unMap(visitDto);
		visit = visitService.save(visit);
		visitDto = visitMapper.map(visit);
		return new SuccessResponse<VisitDto>(visitDto);
	}
	
	@GetMapping(value = "/{id}")
	public SuccessResponse<VisitDto> getById(@PathVariable(name="id") Integer id) throws BusinessException {
		Visit visit = visitService.getById(id);
		VisitDto visitDto = visitMapper.map(visit);
		return new SuccessResponse<VisitDto>(visitDto);
	}
	
	@GetMapping
	public SuccessResponse<List<VisitDto>> getAll() throws BusinessException {
		List<Visit> visits = visitService.findAll();
		List<VisitDto> visitDtos = visitMapper.mapList(visits);
		return new SuccessResponse<List<VisitDto>>(visitDtos);
	}
	
	@DeleteMapping(value = "delete/{id}")
	public SuccessResponse<Boolean> delete(@PathVariable(name="id") Integer id) throws BusinessException {
		Boolean result = visitService.deleteById(id);
		return new SuccessResponse<Boolean>(result);
	}
	
}
