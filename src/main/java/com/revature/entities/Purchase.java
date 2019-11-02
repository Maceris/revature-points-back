package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * A purchase entity backed by the database.
 */
@Entity
@Table(name = "purchase")
public class Purchase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "p_id")
	private int purchaseId;

	@Column(name = "a_id")
	private int associateId;

	@Column(name = "p_time")
	private long time;

	@Column(name = "r_id")
	private int rewardId;

	/**
	 * Create a new purchase bean.
	 */
	public Purchase() {
		super();
	}

	/**
	 * Return the ID of the associate that made the purchase.
	 *
	 * @return The associate ID.
	 */
	public int getAssociateId() {
		return this.associateId;
	}

	/**
	 * Return the unique ID of the purchase.
	 *
	 * @return The purchase ID.
	 */
	public int getPurchaseId() {
		return this.purchaseId;
	}

	/**
	 * Return the ID of the reward this purchase was for.
	 *
	 * @return The reward ID.
	 */
	public int getRewardId() {
		return this.rewardId;
	}

	/**
	 * Return the UNIX timestamp for when the purchase occurred.
	 *
	 * @return The time in milliseconds since the epoch at purchase time.
	 */
	public long getTime() {
		return this.time;
	}

	/**
	 * Set the ID of the associate that made the purchase.
	 *
	 * @param associateId The new associate ID.
	 */
	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}

	/**
	 * Set the unique ID of the purchase.
	 *
	 * @param purchaseId The new purchase ID.
	 */
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	/**
	 * Set the ID of the reward this purchase was for.
	 *
	 * @param rewardId The new reward ID.
	 */
	public void setRewardId(int rewardId) {
		this.rewardId = rewardId;
	}

	/**
	 * Set the UNIX timestamp for when the purchase occurred.
	 *
	 * @param time The time in milliseconds since the epoch at purchase time.
	 */
	public void setTime(long time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Purchase [purchaseId=" + this.purchaseId + ", associateId="
			+ this.associateId + ", time=" + this.time + ", rewardId="
			+ this.rewardId + "]";
	}

}
