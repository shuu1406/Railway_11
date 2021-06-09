package com.vti.frontend;

import com.vti.backend.Excercise1.Excercise1;
import com.vti.backend.Excercise4.Excercise4;
import com.vti.backend.Excercise5.QLCB;

public class Program {
	public static void main(String[] args) {
		Excercise1 ex1 = new Excercise1();
//		ex1.Question1();
//		ex1.Question2();
//		ex1.Question3();
//		Excercise4 ex4 = new Excercise4();
//		ex4.question1();
		QLCB qlcb = new QLCB();
		qlcb.addCanBo();
		qlcb.printListCanBos();
	}
}
