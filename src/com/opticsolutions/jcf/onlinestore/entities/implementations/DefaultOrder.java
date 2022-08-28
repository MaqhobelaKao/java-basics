package com.opticsolutions.jcf.onlinestore.entities.implementations;

import java.util.ArrayList;
import java.util.List;

import com.opticsolutions.jcf.onlinestore.entities.Order;
import com.opticsolutions.jcf.onlinestore.entities.Product;

public class DefaultOrder implements Order {

	private static final int AMOUNT_OF_DIGITS_IN_CREDIT_CARD_NUMBER = 16;

	List<Product> products;
	String creditCardNumber;
	private int customerId;

	@Override
	public boolean isCreditCardNumberValid(String userInput) {
		return creditCardNumber.toCharArray().length == AMOUNT_OF_DIGITS_IN_CREDIT_CARD_NUMBER
				&& !creditCardNumber.contains(" ") && Long.parseLong(creditCardNumber) > 0;
	}

	@Override
	public void setCreditCardNumber(String userInput) {
		if (userInput == null)
			return;

		if (this.isCreditCardNumberValid(userInput))
			this.setCreditCardNumber(userInput);

	}

	@Override
	public void setProducts(List<Product> products) {
		if (products == null)
			return;
		this.products = new ArrayList<>(products);
	}

	@Override
	public void setCustomerId(int customerId) {
		if (customerId < 0)
			return;
		this.setCustomerId(customerId);

	}

	@Override
	public int getCustomerId() {
		return this.getCustomerId();
	}

	@Override
	public String toString() {
		return "DefaultOrder [products=" + products + ", creditCardNumber=" + creditCardNumber + ", customerId="
				+ customerId + "]";
	}

}
