package com.averageprice.controller;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class ShareControl {
	
	public void multiplyQuantityByPrice(ArrayList<Integer> quantityPurchased, ArrayList<Double> sharePrice, Integer totalOp){
		Double totalSpent = 0.0;
		Integer totalPurchased = 0;
		for(int i = 0; i < totalOp; i++) {
			totalSpent += quantityPurchased.get(i) * sharePrice.get(i);
			totalPurchased += quantityPurchased.get(i);
		}
		divideTotalSpendByTotalAmount(totalSpent, totalPurchased);
	}
	
	public Double divideTotalSpendByTotalAmount(Double totalSpent, Integer totalSharesPurchased) {
		System.out.println("Total investido: " + numberFormat(totalSpent));
		System.out.println("Quantidade: " + totalSharesPurchased);
		
		Double averagePrice = totalSpent / totalSharesPurchased;
		System.out.println("Preço medio: " + numberFormat(averagePrice));
		
		return averagePrice;
	}
	
	public String numberFormat(Double number) {
		return NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(number);
	}
}
