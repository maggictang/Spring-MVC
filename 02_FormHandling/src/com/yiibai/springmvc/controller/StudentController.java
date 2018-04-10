package com.yiibai.springmvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yiibai.springmvc.entity.Student;

@Controller
public class StudentController<K> {
	
	@RequestMapping(value="/student",method=RequestMethod.GET)
	public ModelAndView student() {
		//视图名，模型名，模型对象
		//ModelAndView mv = new ModelAndView("student","command",new Student());
		//return mv;
		ModelAndView mv = new ModelAndView();
		mv.addObject("command", new Student());
		mv.setViewName("student");
		return mv;
	}
	
	//运用在参数上，会将客户端传递过来的参数按名称注入到指定对象中，并且会将这个对象自动加入ModelMap中，便于View层使用
	@RequestMapping(value="/addStudent",method=RequestMethod.POST)
	public String addStudent(@ModelAttribute Student student,Map<String, Object> map) { 
		//System.out.println(student);
		map.put("name", student.getName());
		map.put("age", student.getAge());
		map.put("id", student.getId());	
		return "result";
	}
}
