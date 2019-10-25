package com.revature.entities;

import java.math.BigInteger;

public class Purchase {
	private int purchaseId;
	private int associateId;
	private BigInteger time;
	private double price;
	private int rewardId;
	
	public Purchase() {
		super();
	}

	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public int getAssociateId() {
		return associateId;
	}

	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}

	public BigInteger getTime() {
		return time;
	}

	public void setTime(BigInteger time) {
		this.time = time;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRewardId() {
		return rewardId;
	}

	public void setRewardId(int rewardId) {
		this.rewardId = rewardId;
	}

	@Override
	public String toString() {
		return "Purchase [purchaseId=" + purchaseId + ", associateId=" + associateId + ", time=" + time + ", price="
				+ price + ", rewardId=" + rewardId + "]";
	}
}
