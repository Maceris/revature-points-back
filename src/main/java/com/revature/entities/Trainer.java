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
		return "Trainer [trainerId=" + this.trainerId + ", username="
			+ this.username + ", password=" + this.password + ", fname="
			+ this.fname + ", lname=" + this.lname + "]";
	}
}
