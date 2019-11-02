package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * A reward entity backed by the database.
 */
@Entity
@Table(name = "reward")
public class Reward {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "r_id")
	private int rewardId;

	@Column(name = "name")
	private String name;

	@Column(name = "price")
	private double price;

	@Column(name = "stock")
	private int stock;

	/**
	 * Create a new reward bean.
	 */
	public Reward() {
		super();
	}

	/**
	 * Return the name of the reward.
	 *
	 * @return The name of the reward.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Return the price of the reward in revature points.
	 *
	 * @return The price in revature points.
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * Return the unique reward ID.
	 *
	 * @return The reward ID.
	 */
	public int getRewardId() {
		return this.rewardId;
	}

	/**
	 * Return how many of the reward are available for sale currently.
	 *
	 * @return The current stock.
	 */
	public int getStock() {
		return this.stock;
	}

	/**
	 * Set the name of the reward.
	 *
	 * @param name The new name.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Set the price of the reward in revature points.
	 *
	 * @param price The new price, in revature points.
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Set the unique reward ID.
	 *
	 * @param rewardId The new reward ID.
	 */
	public void setRewardId(int rewardId) {
		this.rewardId = rewardId;
	}

	/**
	 * Set how many of the reward are available for sale currently.
	 *
	 * @param stock The new stock amount.
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Reward [rewardId=" + this.rewardId + ", name=" + this.name
			+ ", price=" + this.price + ", stock=" + this.stock + "]";
	}
}
