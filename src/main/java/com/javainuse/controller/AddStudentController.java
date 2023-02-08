package com.javainuse.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.AddStudentModel;
import com.javainuse.service.AddStudentService;

@RestController
public class AddStudentController {

	@Autowired
	private AddStudentService addStudentService;
	
	
	//Save Code
	@PostMapping("/SaveAddStudent")
	@ResponseBody
	public AddStudentModel SaveAddStudent(@RequestBody AddStudentModel addStudentModel)
	{
		return addStudentService.save(addStudentModel);
	}
	
	
	//Retrieve Code
	@PostMapping("/RetrivalAddStudent")
	@ResponseBody
	public AddStudentModel RetrivalAddStudent(@RequestBody AddStudentModel addStudentModel)
	{
		AddStudentModel list = addStudentService.findByid(addStudentModel.getId());
		return list;
	}
	
	
	//Update code
	@PostMapping("/UpdateAddStudent")
	@ResponseBody
	public AddStudentModel UpdateAddStudent(@RequestBody AddStudentModel addStudentModel)
	{
		
		AddStudentModel list=addStudentService.updateThroughid(addStudentModel);
		return list;
	}
	
	
	//Delete Code
	@PostMapping("/DeleteAddStudent")
	@ResponseBody
	public void DeleteAddStudent(@RequestBody AddStudentModel addStudentModel)
	{
		addStudentService.DeleteByid(addStudentModel.getId());

	}
	
}
