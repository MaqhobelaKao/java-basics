package com.opticsolutions.onlinestore.withlist.enteties;

import java.util.List;
import com.opticsolutions.jcf.comporator.hw.Product;
public interface Cart {

	boolean isEmpty();

	void addProduct(Product productById);

	List<Product> getProducts();

	void clear();

}

