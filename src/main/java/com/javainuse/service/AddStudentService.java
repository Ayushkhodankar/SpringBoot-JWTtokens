package com.javainuse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javainuse.model.AddStudentModel;
import com.javainuse.repo.AddStudentRepo;

@Service
public class AddStudentService {

	
	@Autowired 
	private AddStudentRepo addStudentRepo;

	public AddStudentModel save(AddStudentModel addStudentModel) {
		return addStudentRepo.save(addStudentModel);
		
	}

	public AddStudentModel findByid(int id) {
		AddStudentModel list = addStudentRepo.findByid(id);
		return list;
	}

	
	public AddStudentModel updateThroughid(AddStudentModel addStudentModel) {
		
		AddStudentModel list=addStudentRepo.saveAndFlush(addStudentModel);
		return list;
	}

	public void DeleteByid(int id) {
		// TODO Auto-generated method stub
		addStudentRepo.deleteById(id);
	}


	

	

	
	
	}

	
	
	
	

	

