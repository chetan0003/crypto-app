package com.quickcko.model;

public class Author {

	private String name;
	private String designation;
	private String experience;
	private String thumbnail;
	
	public Author(String name, String designation, String experience, String thumbnail) {
		super();
		this.name = name;
		this.designation = designation;
		this.experience = experience;
		this.thumbnail = thumbnail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	
}
