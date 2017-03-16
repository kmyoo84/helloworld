package com.study.maven.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	String message = "Welcome to Spring MVC!!";
	
	@RequestMapping("/hello")
	public ModelAndView showMessage(@RequestParam(value="", required = false, defaultValue = "World") String name){
		
		System.out.println("in Controller");
		
		ModelAndView mv = new ModelAndView("helloWorld");
		
		mv.addObject("name", name);
		mv.addObject("message", message);
		
		return mv;
		
	}
}
