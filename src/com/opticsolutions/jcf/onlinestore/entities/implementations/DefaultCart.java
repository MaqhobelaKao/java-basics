package com.opticsolutions.onlinestore.entities.implementations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opticsolutions.onlinestore.entities.Cart;
import com.opticsolutions.onlinestore.entities.Product;



public class DefaultCart implements Cart {
	private List<Product> products;

	
	{
		products = new ArrayList<>();
	}
	
	@Override
	public boolean isEmpty() {
		return this.products.isEmpty();
	}

	@Override
	public void addProduct(Product product) {
		if (product == null) {
			return;
		}
		this.products.add(product);
	}

	@Override
	public List<Product> getProducts() {
//		return Collections.unmodifiableList(this.products); // returns unmodifiable List
		return this.products;
	}

	@Override
	public void clear() {
		products.clear();
	}

}
