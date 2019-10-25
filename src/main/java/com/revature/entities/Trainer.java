package com.revature.entities;

public class Trainer {
	private int trainerId;
	private String username;
	private String password;
	private String fname;
	private String lname;
	
	public Trainer() {
		super();
	}

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
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

	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", username=" + username + ", password=" + password + ", fname="
				+ fname + ", lname=" + lname + "]";
	}
}
