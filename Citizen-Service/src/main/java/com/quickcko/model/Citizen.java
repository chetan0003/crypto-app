package com.quickcko.model;

import java.io.Serializable;


public class Citizen implements Serializable{
	
	public static final long serialVersionUID = 1;
    
	private Integer id;
	private String name;
	private Integer vaccination_center_id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getVaccination_center_id() {
		return vaccination_center_id;
	}
	public void setVaccination_center_id(Integer vaccination_center_id) {
		this.vaccination_center_id = vaccination_center_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
