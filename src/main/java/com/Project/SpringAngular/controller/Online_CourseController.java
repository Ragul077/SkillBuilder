package com.Project.SpringAngular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Online_CourseController {

	@GetMapping("/online-course")
	public String OnlinePage()
	{
		return "online-course";
	}
}
