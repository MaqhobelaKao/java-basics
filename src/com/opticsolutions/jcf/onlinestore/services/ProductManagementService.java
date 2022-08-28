package com.opticsolutions.onlinestore.services;

import java.util.List;

import com.opticsolutions.onlinestore.entities.Product;


public interface ProductManagementService {

	List<Product> getProducts();

	Product getProductById(int productIdToAddToCart);

}
