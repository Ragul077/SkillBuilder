package com.Project.SpringAngular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CloudController {

	@GetMapping("/cloud")
	public String CloudPage()
	{
		return "cloud";
	}
}
