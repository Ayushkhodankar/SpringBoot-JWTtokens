package com.javainuse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javainuse.model.AddTeachers;
import com.javainuse.repo.AddTeacherRepo;

@Service
public class AddTeacherService
{
	
	@Autowired 
	private AddTeacherRepo addTeacherRepo;

	
	public AddTeachers save(AddTeachers addTeachers) {
		AddTeachers list= addTeacherRepo.save(addTeachers);
		return list;
		
	}


	public AddTeachers findByid(int id) {
		
		AddTeachers list= addTeacherRepo.findByid(id);
	    return list;
	}


	

	public AddTeachers deleteByid(int id) {
		AddTeachers list= addTeacherRepo.deleteByid(id);
		return list;
	}


	public AddTeachers updateThroughid(AddTeachers addTeachers) {
		
		AddTeachers list= addTeacherRepo.saveAndFlush(addTeachers);
		return list;
	}


	
}
