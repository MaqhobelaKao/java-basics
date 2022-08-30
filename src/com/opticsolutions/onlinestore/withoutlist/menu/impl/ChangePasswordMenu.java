package com.opticsolutions.onlinestore.withoutlist.menu.impl;

import java.util.Scanner;

import com.opticsolutions.onlinestore.withoutlist.configs.ApplicationContext;
import com.opticsolutions.onlinestore.withoutlist.menu.Menu;

public class ChangePasswordMenu implements Menu {
	
	private ApplicationContext context;
	
	{
		context = ApplicationContext.getInstance();
	}

	@SuppressWarnings("resource")
	@Override
	public void start() {
		printMenuHeader();
		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		context.getLoggedInUser().setPassword(userInput);
		System.out.println("Your password has been successfully changed");
		new MainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** CHANGE PASSWORD *****");
		System.out.print("Enter new password: ");		
	}

}
