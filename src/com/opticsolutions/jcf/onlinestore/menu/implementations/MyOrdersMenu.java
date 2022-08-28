package com.opticsolutions.jcf.onlinestore.menu.implementations;

import java.util.List;

import com.opticsolutions.jcf.onlinestore.configs.ApplicationContext;
import com.opticsolutions.jcf.onlinestore.entities.Order;
import com.opticsolutions.jcf.onlinestore.menu.Menu;
import com.opticsolutions.jcf.onlinestore.services.OrderManagementService;
import com.opticsolutions.jcf.onlinestore.services.implementations.DefaultOrderManagementService;


public class MyOrdersMenu implements Menu {

	private ApplicationContext context;
	private OrderManagementService orderManagementService;

	{
		context = ApplicationContext.getInstance();
		orderManagementService = (OrderManagementService) DefaultOrderManagementService.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		if (context.getLoggedInUser() == null) {
			System.out.println(
					"Please, log in or create new account to see list of your orders");
			new MainMenu().start();
			return;
		} else {
			printUserOrdersToConsole();
		}
		new MainMenu().start();
	}

	private void printUserOrdersToConsole() {
		List<Order> loggedInUserOrders = orderManagementService
				.getOrdersByUserId(context.getLoggedInUser().getId());

		if (loggedInUserOrders == null || loggedInUserOrders.size() == 0) {
			System.out.println(
					"Unfortunately, you don't have any orders yet. "
					+ "Navigate back to main menu to place a new order");
		} else {
			for (Order order : loggedInUserOrders) {
				System.out.println(order);
			}
		}
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** MY ORDERS *****");		
	}

}
