package com.Project.SpringAngular.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.SpringAngular.models.Enrollment;
import com.Project.SpringAngular.repository.EnrollmentRepository;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository repository;

    public Enrollment saveEnrollment(Enrollment enrollment) {
        // Additional business logic (e.g., email validation) can go here
        return repository.save(enrollment);
    }
}

