package com.opticsolutions.jcf.onlinestore.services;

import java.util.List;

import com.opticsolutions.jcf.onlinestore.entities.Order;


public interface OrderManagementService {
	void addOrder(Order order);

	List<Order> getOrdersByUserId(int userId);

	List<Order> getOrders();
}
