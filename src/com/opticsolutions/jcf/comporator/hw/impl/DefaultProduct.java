package com.opticsolutions.jcf.comporator.hw.impl;

import com.opticsolutions.jcf.comporator.hw.Product;

public class DefaultProduct implements Product {
	private int id;
	private String productName;
	private String productCategory;
	private double price;

	

	 

	/**
	 * @param id
	 * @param productName
	 * @param productCategory
	 * @param price
	 */
	public DefaultProduct(int id, String productName, String productCategory, double price) {
		this.id = id;
		this.productName = productName;
		this.productCategory = productCategory;
		this.price = price;
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public String getProductName() {
		return this.productName;
	}

	@Override
	public String getCategoryName() {
		return this.productCategory;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public String toString() {
		return "DefaultProduct [id=" + id + ", productName=" + productName + ", price=" + price + ", productCategory="
				+ productCategory + "]";
	}
	
	

}
