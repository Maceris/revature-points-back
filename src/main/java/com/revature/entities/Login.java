package com.revature.entities;

/**
 * Not a database entity, but sent in requests.
 */
public class Login {

	private String username;
	private String password;

	/**
	 * Create a new login bean.
	 */
	public Login() {
		super();
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Login [username=" + this.username + ", password="
			+ this.password + "]";
	}

}
