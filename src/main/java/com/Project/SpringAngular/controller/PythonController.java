package com.Project.SpringAngular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PythonController {

	@GetMapping("/python")
	public String PythonPage()
	{
		return "python";
	}
}
