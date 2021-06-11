package com.vti.backend.Excercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.excercise5.Q1.CanBo;
import com.vti.entity.excercise5.Q1.Gender;

public class QLCB {
	List<CanBo> dsCanBo = new ArrayList<CanBo>();
	public void addNewCanBo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap vao ten can bo: ");
		String name = scanner.nextLine();
		CanBo canbo1 = new  CanBo(name,0,Gender.UNKNOWN,"") {};	
		dsCanBo.add(canbo1);
		
	}
	public void showInfoDsCanBo() {
		for (CanBo canbo : dsCanBo) {
			System.out.println(canbo);
		}
	}
	public void searchByName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap vao ten can bo muon tim: ");
		String name = scanner.nextLine();
		for (CanBo canbo : dsCanBo) {
			if(canbo.getHoTen().toLowerCase().indexOf(name.toLowerCase()) >= 0) {
				System.out.println(canbo);
			}
		}
	}
	public void deleteByName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap vao ten can bo muon xoa: ");
		String name = scanner.nextLine();
		for(int i = 0; i < dsCanBo.size();i++) {
			if(dsCanBo.get(i).getHoTen().toLowerCase().indexOf(name.toLowerCase()) >= 0) {
				dsCanBo.remove(i);
				i --;
			}
		}
	}
}
