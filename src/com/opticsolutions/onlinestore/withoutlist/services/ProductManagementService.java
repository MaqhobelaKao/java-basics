package com.opticsolutions.onlinestore.withoutlist.services;

import com.opticsolutions.onlinestore.withoutlist.enteties.Product;

public interface ProductManagementService {

	Product[] getProducts();

	Product getProductById(int productIdToAddToCart);

}
