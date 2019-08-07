package com.model;

import java.math.BigDecimal;

public class TestDecimal {

	public static void main(String[] args){
		String str = getTaxRatePercent(new BigDecimal(".16"));
		System.out.println(str);

		BigDecimal decimal = new BigDecimal("12.1");
		System.out.println(decimal.intValue());
	}

	public static String getTaxRatePercent(BigDecimal taxRate) {
		if(taxRate != null && taxRate.compareTo(BigDecimal.ZERO) > 0){
			String taxRateStr = taxRate.toString();
			return taxRateStr.substring(taxRateStr.indexOf(".") + 1) + "%";
		}
		return "13%";
	}
}
