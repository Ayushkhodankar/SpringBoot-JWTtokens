package com.javainuse.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.AddCourse;
import com.javainuse.service.AddCourseService;

@RestController
@CrossOrigin()
public class HelloWorldController {

	@Autowired
	private AddCourseService addCourseService;
	
	@RequestMapping({ "/hello" })
	public String hello() 
	{
		return "Hello World";
	}

	
	//AddCourse Starts Here
	//Save Code
	@PostMapping("/getAddCourse")
	@ResponseBody
	public AddCourse getAddCourse(@RequestBody AddCourse addCourse)
	{
		return addCourseService.save(addCourse);
	}
	  
	//Retrieve Code 
	@PostMapping("/retriveAddCourse")
	@ResponseBody
	public AddCourse retriveAddCourse(@RequestBody AddCourse addCourse)
	{
		AddCourse list = addCourseService.findByid(addCourse.getId());
		return list;	
	}
	
	//Update Code
	@PostMapping("/UpdateAddCourse")
	@ResponseBody
	public AddCourse UpdateAddCourse(@RequestBody AddCourse addCourse)
	{
		AddCourse list = addCourseService.updateThroughid(addCourse);
		return list;
	}
	
	
	//Delete Code
	@PostMapping("/DeleteAddCourse")
	@ResponseBody
	public void DeleteAddCourse(@RequestBody AddCourse addCourse)
	{
		addCourseService.DeleteByid(addCourse.getId());
	}
	
	
}
