package com.opticsolutions.onlinestore.menu.implementations;

import java.util.List;

import com.opticsolutions.onlinestore.configs.ApplicationContext;
import com.opticsolutions.onlinestore.entities.User;
import com.opticsolutions.onlinestore.menu.Menu;
import com.opticsolutions.onlinestore.services.UserManagementService;
import com.opticsolutions.onlinestore.services.implementations.DefaultUserManagementService;


public class CustomerListMenu implements Menu {

	private ApplicationContext context;
	
	private UserManagementService userManagementService;
	
	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}
	
	@Override
	public void start() {
		printMenuHeader();
		List<User> users = userManagementService.getUsers();
		
		if (users.size() == 0) {
			System.out.println("Unfortunately, there are no customers.");
		} else {
			for (User user : users) {
				System.out.println(user);
			}
		}
		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** USERS *****");		
	}

}
