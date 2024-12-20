package com.Project.SpringAngular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeepController {

	@GetMapping("/deep")
	public String DeepPage()
	{
		return "deep";
	}
}
