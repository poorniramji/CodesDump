package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
//@RestController was introduced in Spring 4, its a combination of @Controller and @ResponseBody
public class CourseList {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/courseList")
	public List<CourceModel> getAllCourceList() {
		List<CourceModel> courseList = 	courseService.getAllCourceList();
		return courseList;
	}
	
	//@PathVariable - Springboot ; @PathParam - In JAX RS
	
	@RequestMapping("/courseList/{courseName}")
	public Optional<CourceModel> getCourse(@PathVariable String courseName) {
		Optional<CourceModel> courseModel= courseService.getCourseName(courseName);
		return courseModel;
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value=("/courseList"))
	public void addCourse(@RequestBody CourceModel course) {
		courseService.addCourse(course);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value=("/courseList/{courseName}"))
	public void updateCourse(@RequestBody CourceModel course, @PathVariable String courseName) {
		courseService.updateCourse(course,courseName);
	
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value=("/courseList/{courseName}"))
	public void deleteCourse(@PathVariable String courseName) {
		courseService.deleteCourse(courseName);
	}

}
