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
	 * Return the plaintext password. I am so sorry.
	 *
	 * @return The password, in plaintext.
	 * @apiNote Ches hates everything about this.
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Return the username.
	 *
	 * @return The username.
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * @param password the password to set
	 * @apiNote Ches hates everything about this.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Set the username.
	 *
	 * @param username The new username.
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
