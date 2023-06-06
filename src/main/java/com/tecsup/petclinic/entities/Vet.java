package com.tecsup.petclinic.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Vet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="first_name")
	private String name;
	@Column(name="last_name")
	private String lastname;
	
	public Vet() {
		super();
	}

	public Vet(Integer id, String name, String lastname) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
	}
	
	public Vet(String name, String lastname) {
		super();
		this.name = name;
		this.lastname = lastname;
	}

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

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
