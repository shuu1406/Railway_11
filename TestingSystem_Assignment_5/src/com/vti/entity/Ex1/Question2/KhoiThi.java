package com.vti.entity.Ex1.Question2;

public class KhoiThi {
	String ten;
	String monThi;
	public String getmonThi() {
		if (ten.equals("A")) {
			monThi = "Toán, Lý, Hóa";

		} else if (ten.equals("B")) {
			monThi = "Toán, Hóa, Sinh";

		} else if (ten.equals("C")) {
			monThi = "Văn, Sử, Địa";

		} else {
			monThi = "Không xác định";
		}

		return monThi;

	}
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}
}
