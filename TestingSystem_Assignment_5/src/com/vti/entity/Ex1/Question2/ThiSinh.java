package com.vti.entity.Ex1.Question2;

import java.util.Scanner;

public class ThiSinh {
	int soBaoDanh;
	String hoten;
	String diaChi;
	String mucUuTien;
	KhoiThi	khoi;
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số báo danh: ");
		soBaoDanh = scanner.nextInt();

		System.out.println("Nhập họ tên: ");
		hoten = scanner.nextLine();
		
		System.out.println("Nhập địa chỉ: ");
		diaChi = scanner.nextLine();
		
		System.out.println("Nhập mức ưu tiên: ");
		mucUuTien = scanner.nextLine();
		
		System.out.println("Nhập khối A/B/C");
		khoi = new KhoiThi();
		khoi.setTen(scanner.nextLine());
		
	}
	@Override
	public String toString() {
		return "ThiSinh [soBaoDanh=" + soBaoDanh + ", hoten=" + hoten + ", diaChi=" + diaChi + ", mucUuTien="
				+ mucUuTien + ", khoi=" + khoi + "]";
	}
	
}
