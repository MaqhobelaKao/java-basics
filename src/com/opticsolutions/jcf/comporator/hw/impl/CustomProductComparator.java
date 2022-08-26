package com.opticsolutions.jcf.comporator.hw.impl;

import java.util.Comparator;

import com.opticsolutions.jcf.comporator.hw.Product;

public class CustomProductComparator implements Comparator<Product> {

	@Override
	public int compare(Product product1, Product product2) {
		int result = product1.getCategoryName().compareTo(product2.getCategoryName());
		if(result == 0){
		    result = product1.getPrice() > product2.getPrice()?  1 : product1.getPrice() == product2.getPrice()? 0 : -1 ;
		}
		if(result == 0) {
		    result = product1.getProductName().compareTo(product2.getProductName());
		}
		return result;
	}



}
