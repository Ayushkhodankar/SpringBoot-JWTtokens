package com.javainuse.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class AddStudentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	
}
