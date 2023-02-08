package com.javainuse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.AddTeachers;
import com.javainuse.service.AddTeacherService;

@RestController
public class AddTeachersController {

	@Autowired 
	private AddTeacherService addTeacherService;
	
	
	//Save Code
	@PostMapping("/SaveAddTeacher")
	@ResponseBody
	public AddTeachers SaveAddTeacher(@RequestBody AddTeachers addTeachers)
	{
		AddTeachers list= addTeacherService.save(addTeachers);
		return list;
	}
	
	//Retrieval code
	@PostMapping("/RetrivalAddTeacher")
	@ResponseBody
	public AddTeachers RetrivalAddTeacher(@RequestBody AddTeachers addTeachers)
	{
		AddTeachers list= addTeacherService.findByid(addTeachers.getId());
		return list;
	}
	
	//Update Code
	@PostMapping("/UpdateAddTeacher")
	@ResponseBody
	public AddTeachers UpdateAddTeacher(@RequestBody AddTeachers addTeachers)
	{
		AddTeachers list= addTeacherService.updateThroughid(addTeachers);
		return list;
	}
	
	
	//Delete Code
	@PostMapping("/DeleteAddTeacher")
	@ResponseBody
	public AddTeachers DeleteAddTeacher(@RequestBody AddTeachers addTeachers)
	{
		AddTeachers list= addTeacherService.deleteByid(addTeachers.getId());
		return list;
	}
}
