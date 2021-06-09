package com.vti.entity.excercise5;

import java.util.Scanner;

import com.vti.entity.Gender;

public class NhanVien extends CanBo{
	private String congviec;

	public NhanVien(String hoTen, int tuoi, Gender gioiTinh, String diaChi) {
		super(hoTen, tuoi, gioiTinh, diaChi);
	}
	public NhanVien() {
		super();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập công việc: ");
		congviec = scanner.nextLine();
	}


	public String getCongviec() {
		return congviec;
	}

	public void setCongviec(String congviec) {
		this.congviec = congviec;
	}
	@Override
	public String toString() {
		return super.toString() + "NhanVien [congviec=" + congviec + "]";
	}
	

	
	
}
