package com.opticsolutions.onlinestore.withlist.services;

import java.util.List;

import com.opticsolutions.onlinestore.withlist.enteties.Order;


public interface OrderManagementService {

	void addOrder(Order order);

	List<Order> getOrdersByUserId(int userId);
	
	List<Order> getOrders();

}
