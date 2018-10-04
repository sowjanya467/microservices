package com.jobpost.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jobpost.dto.JobSkills;

@Repository
public interface JobSkillsRepository extends MongoRepository<JobSkills, String>{

	public Optional<JobSkills> findBySkillName(String skillname);
}
