package com.opticsolutions.jcf.onlinestore.services;

import java.util.List;

import com.opticsolutions.jcf.onlinestore.entities.Product;


public interface ProductManagementService {

	List<Product> getProducts();

	Product getProductById(int productIdToAddToCart);

}
