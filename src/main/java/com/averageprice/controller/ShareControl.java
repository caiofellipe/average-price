package com.averageprice.controller;

import java.util.ArrayList;

public class ShareControl {
	
	public void multiplyQuantityByPrice(ArrayList<Integer> quantityPurchased, ArrayList<Double> sharePrice, Integer totalOp){
		Double totalSpent = 0.0;
		Integer totalPurchased = 0;
		for(int i = 0; i < totalOp; i++) {
			totalSpent = quantityPurchased.get(i) * sharePrice.get(i);
			totalPurchased += quantityPurchased.get(i);
			System.out.println("Custo da operação " + i + " " + totalSpent + "/ Ações na operação: " + quantityPurchased.get(i) + " / total ações:  " + totalPurchased);			
		}
		
		
		//NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(totalSpent);
	}
	
	/*
	public void averagePrice(Integer quantity) {}
	*/
	public void divideTotalSpendByTotalAmount(Float totalSpent, Integer totalSharesPurchased) {}
}
