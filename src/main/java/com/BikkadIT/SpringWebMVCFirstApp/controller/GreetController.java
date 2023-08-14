package com.BikkadIT.SpringWebMVCFirstApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController {
   @GetMapping("/greetmsg")
	public ModelAndView greetMsg() {
		String msg="Wecome For Visiting This Website";
		ModelAndView mav=new ModelAndView();
		mav.addObject("GRT", msg);
		mav.setViewName("greet");
	    return mav;	
	}
	
}
