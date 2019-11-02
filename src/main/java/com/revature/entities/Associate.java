package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * An associate entity backed by the database.
 */
@Entity
@Table(name = "associate")
public class Associate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "a_id")
	private int associateId;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "balance")
	private double balance;

	@Column(name = "f_name")
	private String fname;

	@Column(name = "l_name")
	private String lname;

	@Column(name = "t_id")
	private int trainerId;

	/**
	 * Create a new associate bean.
	 */
	public Associate() {
		super();
	}

	/**
	 * Return the associates ID.
	 *
	 * @return The associate ID.
	 */
	public int getAssociateId() {
		return this.associateId;
	}

	/**
	 * Return the balance of revature points.
	 *
	 * @return The balance.
	 */
	public double getBalance() {
		return this.balance;
	}

	/**
	 * Return the first name of the associate.
	 *
	 * @return The first name.
	 */
	public String getFname() {
		return this.fname;
	}

	/**
	 * Return the last name of the associate.
	 *
	 * @return The last name.
	 */
	public String getLname() {
		return this.lname;
	}

	/**
	 * Return the password of the associate.
	 *
	 * @apiNote Ches hates everything about this.
	 * @return The password in plaintext, like a monster.
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Return the trainer ID of this associates trainer.
	 *
	 * @return The trainers ID.
	 */
	public int getTrainerId() {
		return this.trainerId;
	}

	/**
	 * Return the username of the associate.
	 *
	 * @return The username.
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * Set the ID of the associate.
	 *
	 * @param associateId The new ID.
	 */
	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}

	/**
	 * Set the revature point balance of the associate.
	 *
	 * @param balance The new balance in revature points.
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * Set the first name of the associate.
	 *
	 * @param fname The new first name.
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * Set the last name of the associate.
	 *
	 * @param lname The new last name.
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 * Set the password of the associate.
	 *
	 * @param password The plaintext password.
	 * @apiNote Ches hates everything about this.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Set the ID of the trainer that this associate is taught by.
	 *
	 * @param trainerId The new trainer ID.
	 */
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	/**
	 * Set the username of the associate.
	 *
	 * @param username The new username.
	 */
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
