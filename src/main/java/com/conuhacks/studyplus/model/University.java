package com.conuhacks.studyplus.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.conuhacks.studyplus.model.Campus;

@Entity
@Table(name = "University")
public class University {
	private String name;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="campus")
	private Campus campusGround;
}
