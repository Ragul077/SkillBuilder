package com.Project.SpringAngular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JavaController {

	@GetMapping("/java")
	public String JavaPage()
	{
		return"java";
	}
}
