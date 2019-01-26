package com.conuhacks.studyplus.model;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.conuhacks.studyplus.model.ClassSubject;

@Entity
@Table(name = "Classroom")
public class Classroom {
	private String location;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany
	@JoinColumn(name="classSubject")
	Set<ClassSubject> c  = new HashSet<ClassSubject>();
}
