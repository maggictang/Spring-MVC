package com.yiibai.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController{

   @RequestMapping(method = RequestMethod.GET)
   public ModelAndView printHello(HttpServletRequest req,HttpServletResponse resp) {
	   ModelAndView mad = new ModelAndView();  
	   mad.addObject("message", "Hello Spring MVC Framework!");
	   return mad;
   }

}