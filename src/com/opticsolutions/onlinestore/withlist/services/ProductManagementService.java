package com.opticsolutions.onlinestore.withlist.services;

import java.util.List;

import com.opticsolutions.jcf.comporator.hw.Product;

public interface ProductManagementService {

	List<Product> getProducts();

	Product getProductById(int productIdToAddToCart);

}
