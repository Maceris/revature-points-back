package com.revature.security;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/**
 * Provides utilities for encryption related utilities.
 *
 * @author David Burks
 *
 */
public class Crypto {

	private static final String ALGORITHM = "PBKDF2WithHmacSHA512";
	private static final int ITERATIONS = 25565;
	private static final SecureRandom random = new SecureRandom();
	private static final int SALT_SIZE = 128;

	/**
	 * Returns a random salt to be used to hash a password.
	 *
	 * @return a 16 bytes random salt
	 */
	private static byte[] getNextSalt() {
		byte[] salt = new byte[Crypto.SALT_SIZE];
		Crypto.random.nextBytes(salt);
		return salt;
	}

	/**
	 * Hash a password with a known salt.
	 *
	 * @param password The password as a char array.
	 * @param salt The salt as a byte array.
	 * @return The hashed result.
	 */
	private static byte[] hash(char[] password, byte[] salt) {
		byte[] hash;
		KeySpec spec = new PBEKeySpec(password, salt, Crypto.ITERATIONS, 512);
		try {
			SecretKeyFactory f = SecretKeyFactory.getInstance(Crypto.ALGORITHM);
			hash = f.generateSecret(spec).getEncoded();
		}
		catch (NoSuchAlgorithmException ex) {
			throw new IllegalStateException(
				"Missing algorithm: " + Crypto.ALGORITHM, ex);
		}
		catch (InvalidKeySpecException ex) {
			throw new IllegalStateException("Invalid SecretKeyFactory", ex);
		}
		return hash;
	}

	/**
	 * Hash a password for storage.
	 *
	 * @param password The string to hash
	 *
	 * @return A salt/hash pair
	 */
	public static SaltedHash hash(String password) {
		if (password == null) {
			throw new IllegalArgumentException();
		}
		return Crypto.hashChars(password.toCharArray());
	}

	/**
	 * Hash a password as char array for storage.
	 *
	 * @param password The char array to hash
	 *
	 * @return A salt/hash pair
	 */
	public static SaltedHash hashChars(char[] password) {
		if (password == null) {
			throw new IllegalArgumentException();
		}
		Encoder enc = Base64.getEncoder();
		byte[] salt = Crypto.getNextSalt();
		byte[] hash = Crypto.hash(password, salt);

		return new SaltedHash(enc.encodeToString(hash),
			enc.encodeToString(salt));
	}

	/**
	 * Hashes the provided password with given salt, and checks to see if it
	 * matches the expected hash.
	 *
	 * @param password The password to hash in plaintext.
	 * @param salt The known salt in Base64 format.
	 * @param expectedHash The known password hash in Base64 format.
	 * @return true if the password matches, false otherwise.
	 */
	public static boolean verifyPassword(String password, String salt,
		String expectedHash) {
		if (password == null) {
			throw new IllegalArgumentException();
		}
		return Crypto.verifyPasswordChars(password.toCharArray(), salt,
			expectedHash);
	}

	/**
	 * Hashes the provided password with given salt, and checks to see if it
	 * matches the expected hash.
	 *
	 * @param password The password to hash in plaintext.
	 * @param salt The known salt in Base64 format.
	 * @param expectedHash The known password hash in Base64 format.
	 * @return true if the password matches, false otherwise.
	 */
	public static boolean verifyPasswordChars(char[] password, String salt,
		String expectedHash) {
		if (password == null || salt == null || expectedHash == null) {
			throw new IllegalArgumentException();
		}
		Decoder dec = Base64.getDecoder();
		byte[] result = Crypto.hash(password, dec.decode(salt));
		Encoder enc = Base64.getEncoder();
		return enc.encodeToString(result).equals(expectedHash);
	}

}
