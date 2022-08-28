package com.opticsolutions.jcf.onlinestore.menu.implementations;

import java.util.Scanner;

import com.opticsolutions.jcf.onlinestore.configs.ApplicationContext;
import com.opticsolutions.jcf.onlinestore.entities.User;
import com.opticsolutions.jcf.onlinestore.menu.Menu;
import com.opticsolutions.jcf.onlinestore.services.UserManagementService;
import com.opticsolutions.jcf.onlinestore.services.implementations.DefaultUserManagementService;

public class SignInMenu implements Menu {

	private ApplicationContext context;
	private UserManagementService userManagementService;

	{
		context = ApplicationContext.getInstance();
		userManagementService = DefaultUserManagementService.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Please, enter your email: ");
		String userEmail = sc.next();

		System.out.print("Please, enter your password: ");
		String userPassword = sc.next();

		User user = userManagementService.getUserByEmail(userEmail);
		if (user != null && user.getPassword().equals(userPassword)) {
			System.out.printf("Glad to see you back %s %s", user.getFirstName(),
					user.getLastName() + System.lineSeparator());
			context.setLoggedInUser(user);
		} else {
			System.out.println("Unfortunately, such login and password doesn't exist");
		}
		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** Sign In *****");		
	}

}
