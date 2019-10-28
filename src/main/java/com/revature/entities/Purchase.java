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

	public int getAssociateId() {
		return this.associateId;
	}

	public double getPrice() {
		return this.price;
	}

	public int getPurchaseId() {
		return this.purchaseId;
	}

	public int getRewardId() {
		return this.rewardId;
	}

	public BigInteger getTime() {
		return this.time;
	}

	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public void setRewardId(int rewardId) {
		this.rewardId = rewardId;
	}

	public void setTime(BigInteger time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Purchase [purchaseId=" + this.purchaseId + ", associateId="
			+ this.associateId + ", time=" + this.time + ", price=" + this.price
			+ ", rewardId=" + this.rewardId + "]";
	}
}
