package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reward")
public class Reward {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="r_id")
	private int rewardId;
	@Column(name="name")
	private String name;
	@Column(name="price")
	private double price;
	@Column(name="stock")
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
