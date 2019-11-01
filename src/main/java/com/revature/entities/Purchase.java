package com.revature.entities;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="purchase")
public class Purchase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="p_id")
	private int purchaseId;
	
	@Column(name="a_id")
	private int associateId;
	
	@Column(name="p_time")
	private BigInteger time;
	
	@Column(name="r_id")
	private int rewardId;

	public Purchase() {
		super();
	}

	public int getAssociateId() {
		return this.associateId;
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
		return "Purchase [purchaseId=" + purchaseId + ", associateId=" + associateId + ", time=" + time + ", rewardId="
				+ rewardId + "]";
	}

	
}
