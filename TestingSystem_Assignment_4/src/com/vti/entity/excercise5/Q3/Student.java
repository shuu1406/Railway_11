package com.vti.entity.excercise5.Q3;

public abstract class Student extends Person{
		int id;
		String name;
		public Student(String name,int id) {
			super(name);
			this.id = id;			
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
}
