package com.conuhacks.studyplus.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ClassSubject {
	private String startTime;
	private String endTime;
	private long milliseconds;
	java.util.Date newdate=new java.util.Date();
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
}

