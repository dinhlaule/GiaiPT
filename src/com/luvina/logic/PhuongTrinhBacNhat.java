package com.luvina.logic;

public class PhuongTrinhBacNhat {
	private double a, b, x;
	private String cauTraLoi;

	public PhuongTrinhBacNhat(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public void tinhNghiem() {
		if (a == 0) {
			cauTraLoi = "PT không phải là PTBN";
		} else {
			x = -b / a;
			cauTraLoi = x + "";
		}

	}

	public String inKQ() {
		return cauTraLoi;
	}
}
