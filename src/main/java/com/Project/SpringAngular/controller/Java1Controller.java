package com.Project.SpringAngular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Java1Controller {

	@GetMapping("/java1")
	public String Java1Page()
	{
		return"java1";
	}
}
