package com.vti.backend;

import com.vti.entity.Ex2.Question1.Student;

public class Excercise2 {
	
	public void question1() {
		//a
		Student[] dsStudent = new Student[10];
		for(int i = 0; i <= 9; i++) {
			dsStudent[i] = new Student(i+1,"Nguyễn Văn A" + (i+1), i%3 + 1) ;
			System.out.println(dsStudent[i]);
		}
		//b
		for(int i = 0; i < dsStudent.length; i++) {
			dsStudent[i].diemDanh();
		}
		//c
		for(int i = 0; i < dsStudent.length; i++) {
			if(dsStudent[i].group == 1) {
				dsStudent[i].hocBai();
			}
		}
		//d
		for(int i = 0; i < dsStudent.length; i++) {
			if(dsStudent[i].group == 2) {
				dsStudent[i].donVeSinh();
			}
		}
		
		
	}
}
