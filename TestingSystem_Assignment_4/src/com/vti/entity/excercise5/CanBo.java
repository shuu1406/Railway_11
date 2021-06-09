package com.vti.entity.excercise5;

import java.util.Scanner;

import com.vti.entity.Gender;

public abstract class CanBo {

	private String hoTen;
	private int tuoi;
	private Gender gioiTinh;
	private String diaChi;

	
	
	

	public CanBo(String hoTen, int tuoi, Gender gioiTinh, String diaChi) {
		
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}
	
	
	public CanBo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập họ tên: ");
		hoTen = scanner.nextLine();
		System.out.println("Mời bạn nhập tuổi: ");
		tuoi = scanner.nextInt();
		System.out.println("Mời bạn nhập giới tính(1: Nam, 2:Nu, 3:Không biết): ");
		setGioiTinh(scanner.nextInt());
		System.out.println("Mời bạn nhập địa chỉ: ");
		diaChi = scanner.nextLine();
		
	}



	public String getHoTen() {
		return hoTen;
	}

	

	public int getTuoi() {
		return tuoi;
	}

	

	private void setGioiTinh(int gioiTinh) {
		if (gioiTinh == 1) {
			this.gioiTinh = Gender.valueOf("MALE");
		} else if (gioiTinh == 2) {
			this.gioiTinh = Gender.valueOf("FEMALE");
		} else {
			this.gioiTinh = Gender.valueOf("UNKNOWN");
		}
	}
	

	public Gender getGioiTinh() {
		return gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	
	@Override
	public String toString() {
		return "CanBo [hoTen=" + hoTen + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + "]";
	}

	

	
}