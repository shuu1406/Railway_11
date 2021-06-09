package com.vti.entity.excercise5;

import java.util.Scanner;

import com.vti.entity.Gender;

public class CongNhan extends CanBo {
	public int bac;

	public CongNhan(String hoTen, int tuoi, Gender gioiTinh, String diaChi) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.bac = bac;
		
	}
	
	
	public CongNhan() {
		super();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập bậc : ");
		bac = scanner.nextInt();
	}


	public int getBac() {
		return bac;
	}

	


	@Override
	public String toString() {
		return super.toString() + "CongNhan [bac=" + bac + "]";
	}
	
	
	

}
