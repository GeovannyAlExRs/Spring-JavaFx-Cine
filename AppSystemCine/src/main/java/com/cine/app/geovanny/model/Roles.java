package com.cine.app.geovanny.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Roles")
public class Roles implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rol_id;
	
	private String rol_name;
	
	private String rol_description;
	
	private String rol_status;
	
	public Roles() {
	}

	public Roles(int rol_id, String rol_name, String rol_description, String rol_status) {
		this.rol_id = rol_id;
		this.rol_name = rol_name;
		this.rol_description = rol_description;
		this.rol_status = rol_status;
	}

	public int getRol_id() {
		return rol_id;
	}

	public void setRol_id(int rol_id) {
		this.rol_id = rol_id;
	}

	public String getRol_name() {
		return rol_name;
	}

	public void setRol_name(String rol_name) {
		this.rol_name = rol_name;
	}

	public String getRol_description() {
		return rol_description;
	}

	public void setRol_description(String rol_description) {
		this.rol_description = rol_description;
	}

	public String getRol_status() {
		return rol_status;
	}

	public void setRol_status(String rol_status) {
		this.rol_status = rol_status;
	}

	@Override
	public String toString() {
		return "Roles [rol_id=" + rol_id + ", rol_name=" + rol_name + ", rol_description=" + rol_description
				+ ", rol_status=" + rol_status + "]";
	}	
}