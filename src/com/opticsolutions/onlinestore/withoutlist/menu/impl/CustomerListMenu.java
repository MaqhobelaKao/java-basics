package com.opticsolutions.onlinestore.withoutlist.menu.impl;

import com.opticsolutions.onlinestore.withoutlist.configs.ApplicationContext;
import com.opticsolutions.onlinestore.withoutlist.enteties.User;
import com.opticsolutions.onlinestore.withoutlist.menu.Menu;
import com.opticsolutions.onlinestore.withoutlist.services.UserManagementService;
import com.opticsolutions.onlinestore.withoutlist.services.impl.DefaultUserManagementService;

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
		User[] users = userManagementService.getUsers();
		
		if (users.length == 0) {
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