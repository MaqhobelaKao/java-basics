package com.opticsolutions.onlinestore.withlist.services;

import java.util.List;

import com.opticsolutions.onlinestore.withlist.enteties.User;


public interface UserManagementService {

	String registerUser(User user);
	
	List<User> getUsers();

	User getUserByEmail(String userEmail);

}
