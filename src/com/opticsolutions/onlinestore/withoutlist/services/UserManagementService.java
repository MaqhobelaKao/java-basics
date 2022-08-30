package com.opticsolutions.onlinestore.withoutlist.services;

import com.opticsolutions.onlinestore.withoutlist.enteties.User;

public interface UserManagementService {

	String registerUser(User user);
	
	User[] getUsers();

	User getUserByEmail(String userEmail);

}
