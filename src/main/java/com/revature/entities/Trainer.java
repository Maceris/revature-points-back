package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * A trainer entity backed by the database.
 */
@Entity
@Table(name = "trainer")
public class Trainer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "t_id")
	private int trainerId;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "f_name")
	private String fname;

	@Column(name = "l_name")
	private String lname;

	/**
	 * Create a new trainer bean.
	 */
	public Trainer() {
		super();
	}

	/**
	 * Return the first name of the trainer.
	 *
	 * @return The first name.
	 */
	public String getFname() {
		return this.fname;
	}

	/**
	 * Return the last name of the trainer.
	 *
	 * @return The last name.
	 */
	public String getLname() {
		return this.lname;
	}

	/**
	 * Return the trainers plaintext password.
	 *
	 * @return The password in plaintext, waiting to be stolen.
	 * @apiNote Ches hates everything about this.
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Return the unique trainer ID.
	 *
	 * @return The trainer ID.
	 */
	public int getTrainerId() {
		return this.trainerId;
	}

	/**
	 * Return the trainers username.
	 *
	 * @return The username.
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * Set the first name of the trainer.
	 *
	 * @param fname The new first name.
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * Set the last name of the trainer.
	 *
	 * @param lname The new last name.
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 * Set the plaintext password.
	 *
	 * @param password The password, in plaintext.
	 * @apiNote Ches hates everything about this.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Set the unique trainer ID.
	 *
	 * @param trainerId The new trainer ID.
	 */
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	/**
	 * Set the username of the trainer.
	 *
	 * @param username The new username.
	 */
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
