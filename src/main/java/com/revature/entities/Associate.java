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
		return associateId;
	}

	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	@Override
	public String toString() {
		return "Associate [associateId=" + associateId + ", username=" + username + ", password=" + password
				+ ", balance=" + balance + ", fname=" + fname + ", lname=" + lname + ", trainerId=" + trainerId + "]";
	}
}
