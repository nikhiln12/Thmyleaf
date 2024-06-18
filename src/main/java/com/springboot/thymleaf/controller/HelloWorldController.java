package com.springboot.thymleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

	@GetMapping("/hello")
	public String helloWorld(Model model) {
		model.addAttribute("message", "Hello World");
		return "helloWorld";
	}
	
	@GetMapping("/addCssJs")
	public String addCss() {
		return "add-css-js";
	}
	
	@GetMapping("/bootStrap")
	public String helloWorld() {
		return "bootstrap";
	}
}
