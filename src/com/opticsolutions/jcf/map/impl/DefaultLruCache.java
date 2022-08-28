package com.opticsolutions.jcf.map.impl;

import java.util.LinkedHashMap;
import java.util.Map;

import com.opticsolutions.jcf.map.lruCache;

public class DefaultLruCache extends LinkedHashMap<Integer, Integer> implements lruCache {
	private int capacity;
	
	/**
	 * Default constructor that calls LinkedHashMap constructor
	 * and set initial value that set it to its basic development
	 */
	public DefaultLruCache() {
		super(16, 0.75f, true);
	}
	

	/**
	 * @param capacity capacity that allows the catch to discard elements
	 * if it is exited by the user
	 */
	public DefaultLruCache(int capacity) {
		super(16, 0.75f, true);
		this.capacity = capacity;
	}


	@Override
	public int get(int key) {
		Integer result = super.get(key);
		if(result == null)
			return -1;
		return super.get(key);
	}

	@Override
	public void put(int key, int value) {
		super.put(key, value);
	}

	@Override
	public void setCapacity(int capacity) {
		this.capacity = capacity;

	}
	
	@Override
	public boolean removeEldestEntry(java.util.Map.Entry<Integer, Integer> eldest) {
		if (size() > capacity) {
			return true;
		}
		return false;

	}

}
