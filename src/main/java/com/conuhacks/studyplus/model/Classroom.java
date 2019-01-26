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

import lombok.AccessLevel;
import lombok.Setter;
import lombok.Getter;


@Setter(AccessLevel.PACKAGE)
@Entity
@Table(name = "classroom")
public class Classroom {
	private String location;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(targetEntity=Classroom.class)
	@JoinColumn(name="fk_classSubject")
	private Set<ClassSubject> c  = new HashSet<ClassSubject>();
}
