package com.vti.backend.Excercise1;

import java.time.LocalDate;


import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.PositionName;

public class Excercise1 {

	public static void Question1() {
		Department department1 = new Department();
		Department department2 = new Department("Sale");
		System.out.println(department1);
		System.out.println(department2);

	}
	public static void Question2() {
		Account account1 = new Account();
		Account account2 = new Account(1, "nghiadoan05@gmail.com","Shuu1406","Doan Tuan Nghia");
		Account account3 = new Account(2, "nghiadoan05@gmail.com","Shuu1406","Doan Tuan Nghia", new Position());
		Account account4 = new Account(3, "nghiadoan05@gmail.com","Shuu1406","Doan Tuan Nghia",new Position(),LocalDate.of(2021, 6, 6));
		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);
		System.out.println(account4);
	}
	public static void Question3() {
		Account creator = new Account();
		Group group1 = new Group();
		Group group2 = new Group("Group2",new Account[] {},creator,LocalDate.now());
		Group group3 = new Group("Group3",new String[] {"a","b","c"},creator,LocalDate.now());
		System.out.println(group1);
		System.out.println(group2);
		System.out.println(group3);
	}

}
