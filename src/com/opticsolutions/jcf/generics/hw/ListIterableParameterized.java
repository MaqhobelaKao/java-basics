package com.opticsolutions.jcf.generics.hw;

/**
 * Implementing this interface allows an object to returns
 * object of ListIterator.
 * 
 * @author Maqhobela Kao
 *
 */

public interface ListIterableParameterized<T> {
	
	/**
	 * Returns object of ListIterator.
	 * 
	 * @return object of ListIterator
	 */
	ListIteratorParameterized<T> listIterator();
}
