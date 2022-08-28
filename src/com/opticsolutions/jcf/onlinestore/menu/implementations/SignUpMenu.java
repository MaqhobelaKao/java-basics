package com.opticsolutions.jcf.onlinestore.menu.implementations;

import java.util.Scanner;

import com.opticsolutions.jcf.onlinestore.configs.ApplicationContext;
import com.opticsolutions.jcf.onlinestore.entities.User;
import com.opticsolutions.jcf.onlinestore.entities.implementations.DefaultUser;
import com.opticsolutions.jcf.onlinestore.menu.Menu;
import com.opticsolutions.jcf.onlinestore.services.UserManagementService;
import com.opticsolutions.jcf.onlinestore.services.implementations.DefaultUserManagementService;

public class SignUpMenu implements Menu {

	private UserManagementService userManagementService;
	private ApplicationContext context;

	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter your first name: ");
		String firstName = sc.next();
		System.out.print("Please, enter your last name: ");
		String lastName = sc.next();
		System.out.print("Please, enter your password: ");
		String password = sc.next();
		System.out.print("Please, enter your email: ");
		
		sc = new Scanner(System.in);
		String email = sc.nextLine();

		User user = new DefaultUser(1,firstName, lastName, password, email);
		
		String errorMessage = userManagementService.registerUser(user);
		if (errorMessage == null || errorMessage.isEmpty()) {
			context.setLoggedInUser(user);
			System.out.println("New user is created");
		} else {
			System.out.println(errorMessage);
		}

		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** SIGN UP *****");		
	}

}