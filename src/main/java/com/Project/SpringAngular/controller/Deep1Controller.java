package com.Project.SpringAngular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Deep1Controller {

	@GetMapping("/deep1")
	public String Deep1Page()
	{
		return "deep1";
	}
}
