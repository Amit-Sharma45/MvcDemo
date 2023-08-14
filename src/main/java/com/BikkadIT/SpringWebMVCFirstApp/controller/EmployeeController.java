package com.BikkadIT.SpringWebMVCFirstApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class EmployeeController {
	@GetMapping("/employeemsg")
public String welcomeEmployee(Model model) {
	String msg="Hii Welcome to Bikkad IT";
	model.addAttribute("WELCOME", msg);
	return "welEmp";
	
}
}
