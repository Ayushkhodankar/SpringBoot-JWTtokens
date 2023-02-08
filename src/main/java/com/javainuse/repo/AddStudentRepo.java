package com.javainuse.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javainuse.model.AddStudentModel;

public interface AddStudentRepo extends JpaRepository<AddStudentModel, Integer>{

	public AddStudentModel findByid(int id);

	

	

	

	

}
