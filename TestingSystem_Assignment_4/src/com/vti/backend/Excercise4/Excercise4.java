package com.vti.backend.Excercise4;

import com.vti.entity.Excercise4.Q1.Student;

public class Excercise4 {
	public void question1() {
		Student student1 = new Student("Nghĩa", "Thái Bình");
		student1.setDiem(8);

		Student student2 = new Student("Tuấn", "Hải Dương");
		student2.setDiem(10);

		Student student3 = new Student("Nam", "Bắc Giang");
		student3.setDiem(4);

		student3.setDiem(3);

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
	}
}

