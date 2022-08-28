package com.opticsolutions.onlinestore.entities;

import java.util.List;

public interface Order {

	boolean isCreditCardNumberValid(String userInput);

	void setCreditCardNumber(String userInput);

//	void setProducts(Product[] products);

	void setCustomerId(int customerId);
	
	int getCustomerId();

	void setProducts(List<Product> products);

}