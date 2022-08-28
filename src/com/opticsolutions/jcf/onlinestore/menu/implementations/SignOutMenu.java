package com.opticsolutions.jcf.onlinestore.menu.implementations;

import com.opticsolutions.jcf.onlinestore.configs.ApplicationContext;
import com.opticsolutions.jcf.onlinestore.menu.Menu;

public class SignOutMenu implements Menu{

	private ApplicationContext context;
	
	{
		context = ApplicationContext.getInstance();
	}
	
	@Override
	public void start() {
		printMenuHeader();
		context.setLoggedInUser(null);
		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** Sign Out *****");
		System.out.println("Have a nice day! Look forward to welcoming back!");		
	}

}
