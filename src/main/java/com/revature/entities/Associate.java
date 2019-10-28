package com.revature.entities;

public class Associate {
	private int associateId;
	private String username;
	private String password;
	private double balance;
	private String fname;
	private String lname;
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
