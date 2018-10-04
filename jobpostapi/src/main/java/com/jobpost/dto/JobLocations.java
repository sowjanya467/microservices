package com.jobpost.dto;

import org.springframework.data.annotation.Id;

import io.swagger.annotations.ApiModelProperty;

public class JobLocations {

	@Id
	@ApiModelProperty(hidden = true)
	private String id;
	private String locationName;
	@ApiModelProperty(hidden = true)
	private String locationUpdatedAt;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getLocationUpdatedAt() {
		return locationUpdatedAt;
	}
	public void setLocationUpdatedAt(String locationUpdatedAt) {
		this.locationUpdatedAt = locationUpdatedAt;
	}

}
