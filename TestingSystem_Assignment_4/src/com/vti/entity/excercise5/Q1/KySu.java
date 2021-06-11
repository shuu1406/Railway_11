package com.vti.entity.excercise5.Q1;

import java.util.Scanner;

public class KySu extends CanBo{
	private String nganhDaoTao;

	public KySu(String hoTen, int tuoi, Gender gioiTinh, String diaChi) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}
	public KySu() {
		super();
		Scanner scanner = new Scanner(System.in);
		System.out.println("M�?i bạn nhập ngành đào tạo : ");
		nganhDaoTao = scanner.nextLine();
	}


	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	@Override
	public String toString() {
		return  super.toString() + "KySu [nganhDaoTao=" + nganhDaoTao + "]";
	}

	
	
}
