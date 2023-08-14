package com.BikkadIT.SpringWebMVCFirstApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class WelcomeController {
	
	@GetMapping("/message")
public ModelAndView welcomeMsg() {
	String msg="Welcome to Bikkad IT";
	ModelAndView mav=new ModelAndView();
	mav.addObject("MSG", msg);
	mav.setViewName("welcome");
	return mav;
}
}
