package com.opticsolutions.jcf.onlinestore.services;

import java.util.List;

import com.opticsolutions.jcf.onlinestore.entities.User;


public interface UserManagementService {

	String registerUser(User user);

	List<User> getUsers();

	User getUserByEmail(String userEmail);

}
