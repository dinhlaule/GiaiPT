package com.luvina.logic;

public class Common {
	public static double convertStringToDouble(String value,double defaultValue) {
		double parse =0;
		try {
			parse=Double.parseDouble(value);
		} catch (NumberFormatException e) {
			parse=defaultValue;
		}
		return parse;
	}

}
