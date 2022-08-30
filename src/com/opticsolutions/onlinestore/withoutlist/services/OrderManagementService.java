package com.opticsolutions.onlinestore.withoutlist.services;

import com.opticsolutions.onlinestore.withoutlist.enteties.Order;

public interface OrderManagementService {

	void addOrder(Order order);

	Order[] getOrdersByUserId(int userId);
	
	Order[] getOrders();

}
