package com.cts.training.spring.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.training.spring.web.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/dashboard")
	public String home() {
		return "student-home";
	}
	
	@RequestMapping("/profile")
	public String profile(Model model) {
		
		Student student = new Student();
		student.setUname("Dummy");
		
		model.addAttribute("student", student);
		return "student-profile";
	}
	
	@RequestMapping("/save")
	
	public String save(@Valid @ModelAttribute Student student, BindingResult result) {
		
		if(result.hasErrors()) {
			return "student-profile";
		}
		
		System.out.println("NAME : " + student.getUname());
		System.out.println("EMAIL : " + student.getEmail());
		
		return "student-confirm";
	}
	
	
	@InitBinder  
	public void initBinder(WebDataBinder binder) {
		
		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		
		binder.registerCustomEditor(String.class, trimmer);
	}
	
	
}












