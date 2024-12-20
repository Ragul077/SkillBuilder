package com.Project.SpringAngular.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Project.SpringAngular.models.Enrollment;
import com.Project.SpringAngular.services.EnrollmentService;

@RestController
@RequestMapping("/api/enrollments")
@CrossOrigin(origins = "*")
public class EnrollmentController {

    @Autowired
    private EnrollmentService service;

    @PostMapping
    public ResponseEntity<String> enrollCourse(@RequestBody Enrollment enrollment) {
        try {
            service.saveEnrollment(enrollment);

            // Determine the course URL to redirect to
            String redirectUrl;
            switch (enrollment.getCourse()) {
                case "Cloud Computing":
                    redirectUrl = "cloud1.html";
                    break;
                case "Python":
                    redirectUrl = "python1.html";
                    break;
                case "Java":
                    redirectUrl = "java1.html";
                    break;
                case "JavaScript":
                    redirectUrl = "javascript.html";
                    break;
                case "HTML and CSS":
                    redirectUrl = "htmlcss.html";
                    break;
                case "Machine Learning":
                    redirectUrl = "machinelearning.html";
                    break;
                case "Deep Learning":
                    redirectUrl = "deeplearning.html";
                    break;
                case "React":
                    redirectUrl = "react.html";
                    break;
                case "Mongo DB":
                    redirectUrl = "mongodb.html";
                    break;
                default:
                    return ResponseEntity.badRequest().body("Invalid course selected");
            }

            // Return the redirect URL
            return ResponseEntity.ok(redirectUrl);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Enrollment failed: " + e.getMessage());
        }
    }
}

