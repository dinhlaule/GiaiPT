package com.luvina.logic;

public class PhuongTrinhBacHai {
	private double a,b,c,x1,x2;
	private String cauTraLoi;
	
	public PhuongTrinhBacHai(double a, double b,double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void tinhNghiem() {
		double denTa ;
		denTa = b*b -4*a*c;
		if (a==0) {
			cauTraLoi="PT không phải là PTBH";
		}else {
			if (denTa==0) {
				x1=x2=-b/(2*a);
				cauTraLoi = "Phương trình có nghiệm kép là :\n x1=x2="+x1;
			}else if (denTa>0) {
				x1=(-b-Math.sqrt(denTa))/(2*a);
				x2 =(-b+Math.sqrt(denTa))/(2*a);
				cauTraLoi="Phương trình có hai nghiệm phân biệt :\n x1 = "+x1+"\n x2 = "+x2;
			}else if (denTa<0) {
				cauTraLoi="PTVN";
			}
				
			
		}
		
	}
	
	public String inKQ() {
		return cauTraLoi;
	}

}
