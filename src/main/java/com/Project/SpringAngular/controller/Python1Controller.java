package com.Project.SpringAngular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Python1Controller {

	@GetMapping("/python1")
	public String Python1Page()
	{
		return "python1";
	}
}
