package com.opticsolutions.jcf.onlinestore.entities.implementations;

import com.opticsolutions.jcf.onlinestore.entities.User;

public class DefaultUser implements User {
	private int id;
	private String firstName;
	private String lastName;
	private String password;
	private String email;

	/**
	 * default constructor
	 */
	public DefaultUser() {
	}

	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param password
	 * @param email
	 */
	public DefaultUser(int id, String firstName, String lastName, String password, String email) {
		this.id  = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	}

	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getEmail() {
		return this.email;
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public void setPassword(String newPassword) {
		if (newPassword == null)
			return;
		this.password = newPassword;

	}

	@Override
	public void setEmail(String newEmail) {
		if (newEmail == null)
			return;
		this.email = newEmail;
	}

	void clearState() {
		
	}

	@Override
	public String toString() {
		return "DefaultUser [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + ", email=" + email + "]";
	}

	
	
}
