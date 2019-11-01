package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainer")
public class Trainer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="t_id")
	private int trainerId;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="f_name")
	private String fname;
	
	@Column(name="l_name")
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
