package com.conuhacks.studyplus.model;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Classroom {
	private String location;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	ArrayList<ClassSubject> c=new ArrayList<ClassSubject>();
}
