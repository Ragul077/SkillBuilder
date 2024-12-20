package com.Project.SpringAngular.controller;



import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.Project.SpringAngular.models.JobApplication;
import com.Project.SpringAngular.services.JobApplicationService;


import org.springframework.stereotype.Controller;


@Controller
public class JobApplicationController {

    @Autowired
    private JobApplicationService jobApplicationService;
    
    @GetMapping("/apply")
    public String showApplyForm() {
        return "apply";  
    }


    @PostMapping("/apply")
    public String submitJobApplication(
        @RequestParam("jobTitle") String jobTitle,
        @RequestParam("company") String company,
        @RequestParam("location") String location,
        @RequestParam("name") String name,
        @RequestParam("email") String email,
        @RequestParam("resume") MultipartFile resumeFile) {

        JobApplication jobApplication = new JobApplication();
        jobApplication.setJobTitle(jobTitle);
        jobApplication.setCompany(company);
        jobApplication.setLocation(location);
        jobApplication.setName(name);
        jobApplication.setEmail(email);

        try {
            jobApplicationService.saveJobApplication(jobApplication, resumeFile);
        } catch (IOException e) {
            e.printStackTrace();
            return "apply";
        }
        return "job";
    }
}
