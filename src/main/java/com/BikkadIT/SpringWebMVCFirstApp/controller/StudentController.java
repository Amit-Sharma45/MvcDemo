package com.BikkadIT.SpringWebMVCFirstApp.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadIT.SpringWebMVCFirstApp.model.Student;

@Controller
public class StudentController {
	@GetMapping("/getStu")
	public ModelAndView getStudent() {
		Student stu = new Student();
		stu.setSid(101);
		stu.setSname("Amit");
		stu.setsAddress("Ch.Dadri");
		ModelAndView mav = new ModelAndView();
		mav.addObject("STU", stu);
		mav.setViewName("student");
		return mav;
	}
	@GetMapping("/getStus")
    public ModelAndView getStudents() {
		Student st1=new Student();
    	st1.setSid(111);
    	st1.setSname("Amit");
    	st1.setsAddress("Ch.Dadri");
    	
    	Student st2=new Student();
    	st2.setSid(222);
    	st2.setSname("Dinesh");
    	st2.setsAddress("Bhiwani");
    	
    	Student st3=new Student();
    	st3.setSid(333);
    	st3.setSname("Sahil");
    	st3.setsAddress("Gurugram");
    	ArrayList <Student> al=new ArrayList<>();
    	al.add(st1);
    	al.add(st2);
    	al.add(st3);
    	
    	ModelAndView mav=new ModelAndView();
    	mav.addObject("STUS", al);
    	mav.setViewName("students");
		return mav;
    	
    
    }
}
