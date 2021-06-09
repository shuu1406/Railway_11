package com.vti.backend.Excercise5;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.excercise5.CanBo;
import com.vti.entity.excercise5.CongNhan;
import com.vti.entity.excercise5.KySu;
import com.vti.entity.excercise5.NhanVien;

public class QLCB {
	private List<CanBo> canBos = new ArrayList<>();
	private Scanner scanner;
	public QLCB() {
		canBos = new ArrayList<>();
		scanner = new Scanner(System.in);
	}
	public void addCanBo() {
		System.out.println("Bạn muốn nhập vào: 1 Công nhân, 2 Kỹ Sư, 3 Nhân Viên");
		int temp = scanner.nextInt();
		switch(temp) {
		case 1:
			canBos.add(new CongNhan());
			break;
		case 2:
			canBos.add(new KySu());
			break;
		case 3:
			canBos.add(new NhanVien());
			break;
		}
		System.out.println("Nhập thành công cán bộ" );
	}

	public void findByName() {

	}

	public void printListCanBos() {
		for (CanBo canBo : canBos) {
			System.out.println(canBo);
		}
	}

	public void deleteCanBo(String name) {

	}

	public void deleteCanBo( ) {
		Scanner scanner = new Scanner(System.in);
		String inputName = scanner.nextLine();
		deleteCanBo(inputName);
	}
}
