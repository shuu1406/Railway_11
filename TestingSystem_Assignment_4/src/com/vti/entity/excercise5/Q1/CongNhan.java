package com.vti.entity.excercise5.Q1;

import java.util.Scanner;

public class CongNhan extends CanBo {
	public int bac;

	public CongNhan(String hoTen, int tuoi, Gender gioiTinh, String diaChi) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.bac = bac;
		
	}
	
	
	public CongNhan() {
		super();
		Scanner scanner = new Scanner(System.in);
		System.out.println("M�?i bạn nhập bậc : ");
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
