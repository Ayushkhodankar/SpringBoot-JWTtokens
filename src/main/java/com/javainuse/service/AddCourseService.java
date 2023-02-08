package com.javainuse.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javainuse.model.AddCourse;
import com.javainuse.repo.AddCourseRepo;

@Service
public class AddCourseService {

	@Autowired
	private AddCourseRepo addCourseRepo;
	

	public AddCourse save(AddCourse addCourse)
	{
		return addCourseRepo.save(addCourse);
	}

	
	public AddCourse findByid(int id)
	{
		AddCourse list = addCourseRepo.findByid(id);
		return list;
	}



	public AddCourse updateThroughid(AddCourse addCourse) {
		
		AddCourse list= addCourseRepo.saveAndFlush(addCourse);
		return list;
	}
	

	public void DeleteByid(int id) 
	{
		addCourseRepo.deleteById(id);
	}




	
	

	





	

	

	
	
	
	
}
