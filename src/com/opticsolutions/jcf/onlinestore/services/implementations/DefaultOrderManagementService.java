package com.opticsolutions.onlinestore.services.implementations;

import java.util.ArrayList;
import java.util.List;

import com.opticsolutions.onlinestore.entities.Order;
import com.opticsolutions.onlinestore.services.OrderManagement;

public class DefaultOrderManagementService implements OrderManagement {

	private static DefaultOrderManagementService instance;
	private List<Order> orders;

	{
		orders = new ArrayList<>();
	}

	public static OrderManagement getInstance() {
		if (instance == null) {
			instance = new DefaultOrderManagementService();
		}
		return instance;
	}

	@Override
	public void addOrder(Order order) {
		if (order == null) {
			return;
		}
		this.orders.add(order);
	}

	@Override
	public List<Order> getOrdersByUserId(int userId) {
		List<Order> filteredOrders = new ArrayList<>();
		for(Order  order : this.orders) {
			if(order != null && order.getCustomerId() == userId) {
				filteredOrders.add(order);
			}
		}
		return filteredOrders;
	}

	@Override
	public List<Order> getOrders() {
		return this.orders;
	}
}
