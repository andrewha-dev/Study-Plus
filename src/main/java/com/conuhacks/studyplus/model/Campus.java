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
import lombok.AccessLevel;
import lombok.Setter;
import lombok.Getter;


@Setter(AccessLevel.PACKAGE)

@Entity
@Table(name = "campus")
public class Campus {
	private String campusName;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date startDate;
	
	@OneToMany(targetEntity = Campus.class)
	@JoinColumn(name = "fk_building")
	Set<Building> campusBuildings=new HashSet<Building>();
}
