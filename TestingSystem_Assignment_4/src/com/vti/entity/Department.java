package com.vti.entity;

public class Department {
	int 	id;
	String		name;
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	public Department(String name) {
		super();
		this.name = name;
	}
	public Department() {
		super();
	}
	
	}
	
	
