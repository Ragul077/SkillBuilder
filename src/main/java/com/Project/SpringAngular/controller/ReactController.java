package com.Project.SpringAngular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReactController {

	@GetMapping("/react")
	public String ReactPage()
	{
		return"react";
	}
}
