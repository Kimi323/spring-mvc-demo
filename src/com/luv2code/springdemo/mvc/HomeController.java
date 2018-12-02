package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   //@Controller extends @Component, so they get picked up during component scanning
public class HomeController {
	
	// Define controller method (can be any method name) and return view name
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";  
		// equals WEB-INF/view/main-menu.jsp as we configured in spring-mvc-demo-sevlet.xml
	}
}
