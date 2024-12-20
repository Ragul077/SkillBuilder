package com.Project.SpringAngular.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.SpringAngular.models.JobApplication;
import com.Project.SpringAngular.models.User;

public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {
	 User findByEmail(String email);
}

