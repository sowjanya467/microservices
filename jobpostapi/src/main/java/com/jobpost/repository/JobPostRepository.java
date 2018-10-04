package com.jobpost.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jobpost.model.JobPost;
@Repository
public interface JobPostRepository extends MongoRepository<JobPost, String> {

   public Optional<JobPost> findByJobTitle(String t);

public void save(Optional<JobPost> jobPost);
}
