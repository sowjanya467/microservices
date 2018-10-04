package com.jobpost.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jobpost.dto.JobLocations;
@Repository
public interface JobLocationRepository extends MongoRepository<JobLocations, String>{

	public Optional<JobLocations> findByLocationName(String location);
}
