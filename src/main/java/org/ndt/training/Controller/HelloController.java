package org.ndt.training.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloController {
	
    @RequestMapping("/hello")
    public ModelAndView helloWorld() {
 
 String message = "Hello World!!, Spring MVC!";
  return new ModelAndView("home", "message", message);
    }

}
