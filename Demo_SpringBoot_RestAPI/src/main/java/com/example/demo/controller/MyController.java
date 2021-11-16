package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Course;
import com.example.demo.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService controlservice;
	
	
	@GetMapping("/Hello")
	public String Hello() {
		return "Welcome to Course Application";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		
		return this.controlservice.getCourses();
		
	}
	
	@GetMapping("/course/{courseId}")
	public Course getCourse(@PathVariable String courseId){
		return this.controlservice.getCourse(Long.parseLong(courseId));
		
	}
	
	
	

}
