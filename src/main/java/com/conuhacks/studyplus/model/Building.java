package com.conuhacks.studyplus.model;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Building {
	private String buildingName;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String shorthand;
	ArrayList<Classroom> campusBuildings=new ArrayList<Classroom>();
}
