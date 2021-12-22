package com.averageprice.controller;

import java.text.NumberFormat;
import java.util.Locale;

public class ShareControl {
	
	
	public Double multiplyQuantityByPrice(Integer quantityPurchased, Double sharePrice, Double fee){
		Double totalSpent = quantityPurchased.doubleValue() * sharePrice;		
		
		if(fee > 0) {
			totalSpent = totalSpent + fee;			
		}
		
		//NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(totalSpent);
		return totalSpent;
	}
	
}
