package com.vti.backend.Excercise1;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;

public class Excercise1 {

	//1
	public void question1() {

		//1
		Department department = new Department();
		Department department1 = new Department("Sale");

		
		System.out.println(department);
		System.out.println(department1);
	}

	//2
	public void question2() {
		// a
		Account account = new Account();
		System.out.println(account);

		// b
		Account account1 = new Account(1, "dang@gmail.com", "dangblack", "Nguyễn Hải Đăng");
		System.out.println(account1);

		// c
		Position position1 = new Position();
		Position position2 = new Position();
		Account account2 = new Account(2, "dang@gmail.com", "dangblack", "Nguyễn Hải Đăng", position1);
		System.out.println(account2);

		// d
		Account account3 = new Account(3, "dang@gmail.com", "dangblack", "Nguyễn Hải Đăng", position2,
				LocalDate.parse("2020-05-15"));
		System.out.println(account3);
	}

	//3:
	
	public void question3() {
		// a
		Group group = new Group();
		System.out.println(group);

		// b
		Account creator = new Account(1, "dang1@gmail.com", "dangblack1", "Nguyễn Hải Đăng1");
		Account account2 = new Account(2, "dang2@gmail.com", "dangblack2", "Nguyễn Hải Đăng2");
		Account account3 = new Account(3, "dang3@gmail.com", "dangblack3", "Nguyễn Hải Đăng3"
				);
		Account[] accounts = { creator, account2, account3 };
		Group group1 = new Group(1, "Sale", creator, accounts, LocalDate.parse("2020-05-15"));
		System.out.println(group1);

		// c
		String[] usernames = { "dangblack1", "dangblack2", "dangblack3" };
		System.out.println(group1);
		Group group2 = new Group(2, "Boss of Director", creator, usernames, LocalDate.parse("2020-05-15"));
		System.out.println(group2);
	}
}
