package com.conuhacks.studyplus.model;
import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Setter;
import lombok.Getter;


@Setter(AccessLevel.PACKAGE)

@Entity
@Table(name = "room")
public class Room {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
    private String summary;
    private String description;
    
}
