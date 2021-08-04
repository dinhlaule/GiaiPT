package com.luvina.logic;

public class PhepTinh {
	private double a, b, tong, hieu, tich, thuong;

	public PhepTinh(double a ,double b) {
		this.a=a;
		this.b=b;
	}

	public String tinhTong() {
		String strTong = "";
		tong = a + b;
		strTong = tong + "";
		return strTong;
	}

	public String tinhHieu() {
		String strHieu = "";
		hieu = a - b;
		strHieu = hieu + "";
		return strHieu;
	}

	public String tinhTich() {
		String strTich = "";
		tich = a * b;
		strTich = tich + "";
		return strTich;
	}

	public String tinhThuong() {
		String strThuong = "";
		thuong = a / b;
		strThuong = thuong + "";
		return strThuong;
	}
}
