package com.opticsolutions.onlinestore.withlist.enteties;

import java.util.List;
import com.opticsolutions.jcf.comporator.hw.Product;
public interface Order {

	boolean isCreditCardNumberValid(String userInput);

	void setCreditCardNumber(String userInput);

	void setProducts(List<Product> products);

	void setCustomerId(int customerId);
	
	int getCustomerId();

}
