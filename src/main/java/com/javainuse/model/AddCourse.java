package com.javainuse.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;


@Entity
@Data
public class AddCourse 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	private int id;
	private String createdAt;
	private String createdBy;
	private String updatedAt;
	private String updatedBy;
	private String courseName;
	private String courseDuration;
	private String courseTeacher;
	private String courseFees;
}
