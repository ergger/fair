package com.park.fair.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class ThemeParkRide {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotEmpty
	private String name;
	@NotEmpty
	private String description;
	private int thrillfactor;
	private int vomitFactor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getThrillfactor() {
		return thrillfactor;
	}

	public void setThrillfactor(int thrillfactor) {
		this.thrillfactor = thrillfactor;
	}

	public int getVomitFactor() {
		return vomitFactor;
	}

	public void setVomitFactor(int vomitFactor) {
		this.vomitFactor = vomitFactor;
	}

	public ThemeParkRide() {}

	public ThemeParkRide (String name, String description, int thrillfactor, int vomitFactor) {
		this.name = name;
		this.description = description;
		this.thrillfactor = thrillfactor;
		this.vomitFactor = vomitFactor;
	}
	
}
