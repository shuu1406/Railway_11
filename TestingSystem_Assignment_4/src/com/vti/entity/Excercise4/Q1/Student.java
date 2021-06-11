package com.vti.entity.Excercise4.Q1;

public class Student {
	private int id;
	private String name;
	private String hometown;
	private float diem;
	public Student(String name, String hometown) {
		super();
		this.name = name;
		this.hometown = hometown;
		this.diem = 0;
	}
	public float getDiem() {
		return diem;
	}
	public void setDiem(float diem) {
		this.diem = diem;
	}
	public void congDiem(float diem) {
		diem += diem ;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	@Override
	public String toString() {
		String grade;
		if (diem < 4.0) {
			grade = "Yếu";
		} else if (diem < 6) {
			grade = "Trung bình";
		} else if (diem < 8) {
			grade = "Khá";
		} else {
			grade = "Gi�?i";
		}

		return "Student{" + "id=" + id + ", name='" + name + '\'' + ", hometown='" + hometown + '\'' + ", diem="
				+ diem + ", xepLoai='" + grade + '\'' + '}';
	}
}
