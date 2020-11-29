package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@Controller
public class StudentController {

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/save")
	public String saveStudent(Student student) {
		StudentService.saveStudent(student);
		System.out.println("successfully saved");
		return "home.jsp";
	}
}
