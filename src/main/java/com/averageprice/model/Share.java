package com.averageprice.model;

public class Share {
	private Double fee;
	private Double sharePrice;
	private Integer totalAmount;
	private Integer quantityPurchased;

	public Share() {
		
	}
	
	public Share(Double fee, Double sharePrice, Integer totalAmount, Integer quantityPurchased) {
		super();
		this.fee = fee;
		this.sharePrice = sharePrice;
		this.totalAmount = totalAmount;
		this.quantityPurchased = quantityPurchased;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public Double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(Double sharePrice) {
		this.sharePrice = sharePrice;
	}

	public Integer getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Integer getQuantityPurchased() {
		return quantityPurchased;
	}

	public void setQuantityPurchased(Integer quantityPurchased) {
		this.quantityPurchased = quantityPurchased;
	}

}
