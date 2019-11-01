package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="associate")
public class Associate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="a_id")
	private int associateId;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="balance")
	private double balance;
	
	@Column(name="f_name")
	private String fname;
	
	@Column(name="l_name")
	private String lname;
	
	@Column(name="t_id")
	private int trainerId;

	public Associate() {
		super();
	}

	public int getAssociateId() {
		return this.associateId;
	}

	public double getBalance() {
		return this.balance;
	}

	public String getFname() {
		return this.fname;
	}

	public String getLname() {
		return this.lname;
	}

	public String getPassword() {
		return this.password;
	}

	public int getTrainerId() {
		return this.trainerId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Associate [associateId=" + this.associateId + ", username="
			+ this.username + ", password=" + this.password + ", balance="
			+ this.balance + ", fname=" + this.fname + ", lname=" + this.lname
			+ ", trainerId=" + this.trainerId + "]";
	}
}
