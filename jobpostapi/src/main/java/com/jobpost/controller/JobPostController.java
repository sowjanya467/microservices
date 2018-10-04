package com.jobpost.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jobpost.dto.JobLocations;
import com.jobpost.dto.JobPostDto;
import com.jobpost.dto.JobSkills;
import com.jobpost.exceptions.JobPostingException;
import com.jobpost.model.JobPost;
import com.jobpost.model.ResponseDto;
import com.jobpost.service.JobPostService;

@RestController
@RequestMapping(value="/jobapi")
public class JobPostController {
	
	@Autowired
	private JobPostService service;
	
	@PostMapping(value="/postjob")
	public ResponseEntity<ResponseDto> createJob(@RequestBody JobPostDto jobModel) throws JobPostingException{
		
		service.postJob(jobModel);
		ResponseDto response=new ResponseDto();
		response.setStatus(201);
		response.setMessage("job posted successfully!!");
		return new ResponseEntity<>(response,HttpStatus.CREATED);
		
	}
	@PostMapping(value="/postlocation")
	public ResponseEntity<ResponseDto> createlocation(@RequestBody JobLocations jobLocations) throws JobPostingException{
		
		service.postLocations(jobLocations);
		ResponseDto response=new ResponseDto();
		response.setStatus(201);
		response.setMessage("job location posted successfully!!");
		return new ResponseEntity<>(response,HttpStatus.CREATED);
		
	}
	@PostMapping(value="/postskills")
	public ResponseEntity<ResponseDto> createlocation(@RequestBody JobSkills jobskills) throws JobPostingException{
		
		service.postSkills(jobskills);
		ResponseDto response=new ResponseDto();
		response.setStatus(200);
		response.setMessage("job skills posted successfully!!");
		return new ResponseEntity<>(response,HttpStatus.CREATED);
		
	}
	@PostMapping(value="/addlocation")
	public ResponseEntity<ResponseDto> addLocationToJobpost(@RequestParam String locationId,@RequestParam String jobId) throws JobPostingException{
		
		service.addLocations(locationId, jobId);
		ResponseDto response=new ResponseDto();
		response.setStatus(200);
		response.setMessage("job skills posted successfully!!");
		return new ResponseEntity<>(response,HttpStatus.CREATED);
		
	}
	@PostMapping(value="/addskill")
	public ResponseEntity<ResponseDto> addSkillToJobpost(@RequestParam String skillId,@RequestParam String jobId) throws JobPostingException{
		
		service.addSkills(skillId, jobId);
		ResponseDto response=new ResponseDto();
		response.setStatus(200);
		response.setMessage("job skills posted successfully!!");
		return new ResponseEntity<>(response,HttpStatus.CREATED);
		
	}
	

}
