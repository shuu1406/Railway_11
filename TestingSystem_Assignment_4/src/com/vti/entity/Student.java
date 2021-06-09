package com.vti.entity;

public class Student {

	private int id;
	private String name;
	private String hometown;
	private float diem;

	public Student(String name, String hometown) {
		this.name = name;
		this.hometown = hometown;
		this.diem = 0;
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

	public float getScore() {
		return diem;
	}

	public void setScore(float diem) {
		this.diem = diem;
	}

	public void plusScore(float diem) {
		this.diem += diem;
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
			grade = "Giỏi";
		}

		return "Student{" + "id=" + id + ", name='" + name + '\'' + ", hometown='" + hometown + '\'' + ", diem="
				+ diem + ", xepLoai='" + grade + '\'' + '}';
	}
}
