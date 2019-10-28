package com.revature.entities;

public class Reward {
	private int rewardId;
	private String name;
	private double price;
	private int stock;

	public Reward() {
		super();
	}

	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public int getRewardId() {
		return this.rewardId;
	}

	public int getStock() {
		return this.stock;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setRewardId(int rewardId) {
		this.rewardId = rewardId;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Reward [rewardId=" + this.rewardId + ", name=" + this.name
			+ ", price=" + this.price + ", stock=" + this.stock + "]";
	}
}
