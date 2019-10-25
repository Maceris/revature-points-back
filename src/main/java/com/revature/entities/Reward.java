package com.revature.entities;

public class Reward {
	private int rewardId;
	private String name;
	private double price;
	private int stock;
	
	public Reward() {
		super();
	}

	public int getRewardId() {
		return rewardId;
	}

	public void setRewardId(int rewardId) {
		this.rewardId = rewardId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Reward [rewardId=" + rewardId + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}
}
