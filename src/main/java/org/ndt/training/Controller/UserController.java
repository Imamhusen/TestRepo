package org.ndt.training.Controller;

//import java.util.ArrayList;
//import java.util.List;

//import java.util.ArrayList;
//import java.util.List;


import java.util.List;

import org.ndt.training.beans.User;
import org.ndt.training.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@Autowired
	UserService userservice;
	
	@RequestMapping(value="/CreateUser",method=RequestMethod.POST)
	public String Create(@ModelAttribute ("User")User u)
	{
		System.out.println(u.getName());
		userservice.addUser(u);
		
		return "redirect:/CreateUser.html";
	}
	
	@RequestMapping(value="/CreateUser",method=RequestMethod.GET)
	public ModelAndView showForm()
	{
		ModelAndView mv=new ModelAndView("CreateUser");
		
		mv.addObject("command",new User());
		return mv;
		
	}
	@RequestMapping(value="/createuser", method = RequestMethod.POST)  
	 public ModelAndView ShowUserForm() { 
		ModelAndView mv=new ModelAndView("CreateUser");
	  List<User> list2 = userservice.listusers();
	  mv.addObject("LIST2",list2);
	  mv.addObject("command",new User());
	  return mv;
	 
	 }  
}