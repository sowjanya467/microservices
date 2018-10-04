package com.jobpost.service;

import com.jobpost.dto.JobLocations;
import com.jobpost.dto.JobPostDto;
import com.jobpost.dto.JobSkills;
import com.jobpost.exceptions.JobPostingException;
import com.jobpost.model.JobPost;

public interface JobPostService {

	public void postJob(JobPostDto jobModel) throws JobPostingException;

	public void postSkills(JobSkills jobSkills) throws JobPostingException;

	public void postLocations(JobLocations jobLocations) throws JobPostingException;

	void addLocations(String locationId, String jobId) throws JobPostingException;

	void addSkills(String skillId, String jobId) throws JobPostingException;

}