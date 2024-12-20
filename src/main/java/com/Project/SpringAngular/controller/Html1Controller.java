package com.Project.SpringAngular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Html1Controller {

	@GetMapping("/html1")
	public String Html1Page()
	{
		return "html1";
	}
}
