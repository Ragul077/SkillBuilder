package com.Project.SpringAngular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Cloud1Controller {

	@GetMapping("/cloud1")
	public String Cloud1Page()
	{
		return "cloud1";
	}
}
