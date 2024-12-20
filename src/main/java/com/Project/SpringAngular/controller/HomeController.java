package com.Project.SpringAngular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/Home")
	public String Home()
	{
		return "Home";
	}
	@GetMapping("/Home-login")
   public String loginPage() {
       return "login";
    }
	@GetMapping("/Home-signup")
    public String signUpPage() {
        return "signup";
    }
}
