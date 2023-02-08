package com.javainuse.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.javainuse.model.AddCourse;

public interface AddCourseRepo  extends JpaRepository<AddCourse, Integer>{

	public AddCourse findByid(int id);

	
	
}
