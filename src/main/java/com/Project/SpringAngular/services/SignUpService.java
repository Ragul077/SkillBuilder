package com.Project.SpringAngular.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.SpringAngular.models.User;
import com.Project.SpringAngular.repository.UserRepository;



@Service
public class SignUpService {

    @Autowired
    private UserRepository userRepository;

    public void save(User user) {
    	userRepository.save(user);
    }

   

    public boolean isEmailTaken(String email) {
    	 return userRepository.findByEmail(email) != null;
    }
    
}
