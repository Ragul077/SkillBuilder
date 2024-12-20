package com.Project.SpringAngular.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Project.SpringAngular.models.User;
import com.Project.SpringAngular.services.SignUpService;

@Controller
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    @GetMapping("/signup")
    public String signUpPage() {
        return "signup";
    }

    @PostMapping("/signup")
    public String registerUser(@RequestParam String name, @RequestParam String email, 
                               @RequestParam String password, @RequestParam String confirmPassword, 
                               Model model) {
        if (signUpService.isEmailTaken(email)) {
         //   model.addAttribute("message", "Email already taken.");
            return "signup";
        }

        if (!password.equals(confirmPassword)) {
        //    model.addAttribute("message", "Passwords do not match.");
            return "signup"; 
        }

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        

        signUpService.save(user);
      //  model.addAttribute("message", "Registration successful!");
        
        return "login"; 
    }
}
