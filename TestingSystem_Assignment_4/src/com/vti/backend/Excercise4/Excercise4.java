package com.vti.backend.Excercise4;

import com.vti.entity.Student;

public class Excercise4 {
	public void question1() {
		Student student1 = new Student("Nghĩa", "Thái Bình");
		student1.setScore(8);

		Student student2 = new Student("Tuấn", "Hải Dương");
		student2.setScore(10);

		Student student3 = new Student("Nam", "Bắc Giang");
		student3.setScore(4);

		student3.plusScore(3);

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
	}
}

