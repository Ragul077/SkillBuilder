package com.Project.SpringAngular.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.Project.SpringAngular.models.JobApplication;
import com.Project.SpringAngular.models.User;
import com.Project.SpringAngular.repository.JobApplicationRepository;
import com.Project.SpringAngular.repository.UserRepository;

import java.io.File;
import java.io.IOException;

@Service
public class JobApplicationService {

    @Autowired
    private JobApplicationRepository jobApplicationRepository;


    public JobApplication saveJobApplication(JobApplication application, MultipartFile resumeFile) throws IOException {

        String resumePath = saveResumeFile(resumeFile);
        application.setResumeFilePath(resumePath);

     
        return jobApplicationRepository.save(application);
    }


    private String saveResumeFile(MultipartFile file) throws IOException {
        String directoryPath = "C:/uploads"; 
        File directory = new File(directoryPath);
        
        if (!directory.exists()) {
            directory.mkdirs(); 
        }

        String filePath = directoryPath + "/" + file.getOriginalFilename();
        file.transferTo(new File(filePath)); 

        return filePath;  
    }
   
}

