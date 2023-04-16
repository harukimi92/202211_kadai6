package com.example.demo.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String index(Model model){
		LocalDateTime nowDate = LocalDateTime.now();
		
		model.addAttribute("nowdate",nowDate );

		return "hello";
		
	}
}
