package com.opticsolutions.onlinestore.services;

import java.util.List;

import com.opticsolutions.onlinestore.entities.User;


public interface UserManagementService {

	String registerUser(User user);

	List<User> getUsers();

	User getUserByEmail(String userEmail);

}
