package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.Ex1.Question2.ThiSinh;

public class TuyenSinh implements ITTuyenSinh {
	Scanner scanner = new Scanner(System.in);
	List<ThiSinh> thisinhs;
	public TuyenSinh() {
		thisinhs = new ArrayList<>();
		scanner = new Scanner(System.in);
	}
	@Override
	public void addThiSinh() {
		System.out.println("Nhập số thí sinh muốn nhập: ");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			ThiSinh thisinha = new ThiSinh();
			thisinha.nhap();
			thisinhs.add(thisinha);
		}
	}
		
	

	@Override
	public void showInfor() {
		for (ThiSinh thiSinh : thisinhs) {
			System.out.println(thiSinh);
		}
		
	}

	@Override
	public void searchBySBD() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Exit() {
		// TODO Auto-generated method stub
		
	}

}
