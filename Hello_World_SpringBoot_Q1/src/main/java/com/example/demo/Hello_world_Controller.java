package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello_world_Controller {
	
	@GetMapping("/hello")
	  public String greetings(@RequestParam(value= "n", defaultValue="world") String name)
	  {
		  return String.format("Hello,%s!",name);
	  }
	}
				

