package com.jobpost.dto;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class JobPostDto {

	private String job_role;
	private String jobTitle;
	private String job_type;
	private String job_description;
	private String experience_required;
	private int max_salary;
	private int min_salary;
	@ApiModelProperty(hidden = true)
	private String updatedAt;
	@ApiModelProperty(hidden = true)

	private List<String> jobskills;
	@ApiModelProperty(hidden = true)

	private List<String> jobLocations;

	public List<String> getJobskills() {
		if(jobskills==null) {
			return new ArrayList<>();
			}
			return jobskills;	}

	public void setJobskills(List<String> jobskills) {
		this.jobskills = jobskills;
	}

	public List<String> getJobLocations() {
		if(jobLocations==null) {
			return new ArrayList<>();
			}
			return jobLocations;	}

	public void setJobLocations(List<String> jobLocations) {
		this.jobLocations = jobLocations;
	}

	public String getJob_role() {
		return job_role;
	}

	public void setJob_role(String job_role) {
		this.job_role = job_role;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJob_type() {
		return job_type;
	}

	public void setJob_type(String job_type) {
		this.job_type = job_type;
	}

	public String getJob_description() {
		return job_description;
	}

	public void setJob_description(String job_description) {
		this.job_description = job_description;
	}

	public String getExperience_required() {
		return experience_required;
	}

	public void setExperience_required(String experience_required) {
		this.experience_required = experience_required;
	}

	public int getMax_salary() {
		return max_salary;
	}

	public void setMax_salary(int max_salary) {
		this.max_salary = max_salary;
	}

	public int getMin_salary() {
		return min_salary;
	}

	public void setMin_salary(int min_salary) {
		this.min_salary = min_salary;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "JobPostDto [job_role=" + job_role + ", jobTitle=" + jobTitle + ", job_type=" + job_type
				+ ", job_description=" + job_description + ", experience_required=" + experience_required
				+ ", max_salary=" + max_salary + ", min_salary=" + min_salary + ", updatedAt=" + updatedAt + "]";
	}
}
