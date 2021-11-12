package com.mvc1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hellocontroller {
	@RequestMapping("/add")
		public String hello() {
			System.out.println("hey_Akshay");
			return "disp.jsp";
		}
	
}
