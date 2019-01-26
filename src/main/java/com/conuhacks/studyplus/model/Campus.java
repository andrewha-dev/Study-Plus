package com.conuhacks.studyplus.model;
import java.sql.Date;

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

import com.conuhacks.studyplus.model.Building;

@Entity
@Table(name = "Campus")
public class Campus {
	private String campusName;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date startDate;
	
	@OneToMany
	@JoinColumn(name="buildings")
	Set<Building> campusBuildings=new HashSet<Building>();
}
