package com.Project.SpringAngular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class React1Controller {

	@GetMapping("/react1")
	public String ReactPage()
	{
		return"react1";
	}
}
