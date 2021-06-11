package com.vti.entity.excercise5.Q3;

public abstract class HighSchoolStudent extends Student {
		private String clazz;
		private String desiredUniversity;
	public HighSchoolStudent(String name, int id, String clazz,String desiredUniversity ) {
		super(name, id);
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;
	}
	@Override
	public String toString() {
		return "HighSchoolStudent [clazz=" + clazz + ", desiredUniversity=" + desiredUniversity + "]";
	}

}
