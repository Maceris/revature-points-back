package com.revature.security;

/**
 * A combination of hash and associated salt, both in Base64 format.
 *
 * @author David Burks
 *
 */
public class SaltedHash {

	private final String hash;
	private final String salt;

	/**
	 * Create a new salted hash.
	 *
	 * @param hash The hashed data.
	 * @param salt The salt used during hashing.
	 */
	public SaltedHash(String hash, String salt) {
		super();
		this.hash = hash;
		this.salt = salt;
	}

	/**
	 * Fetches the hash as a Base64 encoded string.
	 *
	 * @return the hash value in Base64 format.
	 */
	public String getHash() {
		return this.hash;
	}

	/**
	 * Fetches the salt as a Base64 encoded string.
	 *
	 * @return the salt value in Base64 format.
	 */
	public String getSalt() {
		return this.salt;
	}

	@Override
	public String toString() {
		return "SaltedHash [hash=" + this.hash + ", salt=" + this.salt + "]";
	}

}
