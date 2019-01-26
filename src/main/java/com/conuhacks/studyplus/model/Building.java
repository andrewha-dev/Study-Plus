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

import com.conuhacks.studyplus.model.Classroom;
import lombok.AccessLevel;
import lombok.Setter;
import lombok.Getter;


@Setter(AccessLevel.PACKAGE)
@Entity
@Table(name = "building")
public class Building {
	private String buildingName;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String shorthand;
	
	@OneToMany(targetEntity = Building.class)
	@JoinColumn(name="fk_classroom")
	private Set<Classroom> campusBuildings = new HashSet<Classroom>();
}
