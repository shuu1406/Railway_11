package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.Excercise2;
import com.vti.backend.Excercise1_Question1;

public class MyNews {
	static Excercise2 ex2 = new Excercise2();
	static Excercise1_Question1 ex1 = new Excercise1_Question1();
	public static void main(String[] args) {
		//ex2.question1();
//		ex1.Insertnews();
//		ex1.Viewlistnews();
//		ex1.Averagerate();
		menu();
	}
	public static void read() {
		System.out.println("=======MENU=============");
		System.out.println("==  1.Insert news=======");
		System.out.println("==  2.View list news====");
		System.out.println("==  3.Averagerate=======");
		System.out.println("==  4.Thoát=============");
		System.out.println("========================");
	}
	public static void menu() {
		Excercise2 check = new Excercise2();

		int temp;
		do {
			Scanner scanner = new Scanner(System.in);
			read();
			temp = scanner.nextInt();	
			switch (temp) {
			case 1:
				ex1.Insertnews();
				break;
			case 2:
				ex1.Viewlistnews();
				break;
			case 3:
				ex1.Averagerate();
				break;
			case 4:
				ex1.Exit();
				break;
		
			default:
				System.out.println("Nhập sai ! Nhập lại !");
				break;
			}
		} while (temp != 4);

	}
	
	
}
