package com.jobpost.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import io.swagger.annotations.ApiModelProperty;

public class JobSkills implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@ApiModelProperty(hidden = true)
	private String id;
	private String skillName;
	private String skillUpdatedAt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getSkillUpdatedAt() {
		return skillUpdatedAt;
	}

	public void setSkillUpdatedAt(String skillUpdatedAt) {
		this.skillUpdatedAt = skillUpdatedAt;
	}

	@Override
	public String toString() {
		return "JobSkills [id=" + id + ", skillName=" + skillName + ", skillUpdatedAt=" + skillUpdatedAt + "]";
	}

}
