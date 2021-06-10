package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.TuyenSinh;

public class Ex1_Q2 {
	public static void main(String[] args) {
		Q2();
	}
	
	private static void Q2() {

		TuyenSinh tuyenSinh = new TuyenSinh();
		Scanner scanner = new Scanner(System.in);

		int choose;

		do {
			Menu();
			choose = scanner.nextInt();

			switch (choose) {

			case 1:
				tuyenSinh.addThiSinh();
				break;

			case 2:
				tuyenSinh.showInfor();
				break;

			case 3:
				tuyenSinh.searchBySBD();
				break;

			case 4:
				break;

			default:
				System.out.println("Nhập sai ! Vui lòng nhập lại !");
				break;
			}

		} while (choose != 4);

		scanner.close();
	}
	private static void Menu() {
		System.out.println("===============MENU=================");
		System.out.println("=||1. Thêm mới thí sinh          ||=");
		System.out.println("=||2. Hiện thông tin thí sinh    ||=");
		System.out.println("=||3. Tìm kiếm theo số báo danh  ||=");
		System.out.println("=||4. Thoát                      ||=");		
	}
}
