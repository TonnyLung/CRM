package com.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCottroller {
	@RequestMapping("/home")
	public String showHomePage() {
		return "home";
	}
	
	@RequestMapping({"/", "/index"})
	public String showIndexPage() {
		return "index";
	}
}
