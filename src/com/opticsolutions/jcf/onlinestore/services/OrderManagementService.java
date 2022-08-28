package com.opticsolutions.onlinestore.services;

import java.util.List;

import com.opticsolutions.onlinestore.entities.Order;


public interface OrderManagementService {
	void addOrder(Order order);

	List<Order> getOrdersByUserId(int userId);

	List<Order> getOrders();
}
