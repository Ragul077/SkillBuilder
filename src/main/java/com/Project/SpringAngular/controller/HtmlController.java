package com.Project.SpringAngular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

	@GetMapping("/html")
	public String HtmlPage()
	{
		return "html";
	}
}
