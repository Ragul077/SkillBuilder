package com.Project.SpringAngular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/student")
    public String studentPage() {
        return "student"; 
    }

//    @GetMapping("/online-courses")
//    public String onlineCoursesPage() {
//        return "online-course"; 
//    }
//
//    @GetMapping("/jobs")
//    public String jobsPage() {
//        return "jobs"; 
//    }
//
//    @GetMapping("/events")
//    public String eventsPage() {
//        return "events"; 
//    }
//
////    @GetMapping("/login")
////    public String login1Page() {
////        return "login1";
////    }
//
//    @GetMapping("/home")
//    public String homePage() {
//        return "home"; 
//    }
//
//    @GetMapping("/student/login")
//    public String loginPage() {
//        return "studentLogin";
//    }
}
