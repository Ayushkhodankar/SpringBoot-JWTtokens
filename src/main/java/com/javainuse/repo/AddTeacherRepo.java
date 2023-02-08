package com.javainuse.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javainuse.model.AddTeachers;

public interface AddTeacherRepo extends JpaRepository<AddTeachers, Integer> {

	public AddTeachers findByid(int id);

	public AddTeachers deleteByid(int id);

}
