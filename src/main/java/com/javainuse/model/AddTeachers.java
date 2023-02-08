package com.javainuse.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class AddTeachers 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private String createdAt;
	private String createdBy;
	private String updatedAt;
	private String updatedBy;
	private String teacherName;
	private String lectureDuration;
	private String teacherSubject;
	private String teacherSalary;
}
