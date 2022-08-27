package com.opticsolutions.jcf.lists.impl;

import java.util.Iterator;

import com.opticsolutions.jcf.lists.MyList;

public class DefaultMyList implements MyList {

	/**
	 * Pointer to first node.
	 */
	private Node first;

	/**
	 * Pointer to last node.
	 */
	private Node last;

	/**
	 * Total amount of elements in object of MyListImpl.
	 */
	private int size;

	/**
	 * Appends the specified element to the end of this list (optional operation).
	 *
	 * @param e element to be appended to this list
	 * @throws NullPointerException if the specified element is null and this list
	 *                              does not permit null elements
	 */

	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Object e) {
		final Node lastNode = last;
		final Node newNode = new Node(lastNode, e, null);
		last = newNode;
		if (lastNode == null) {
			first = newNode;
		} else {
			lastNode.next = newNode;
		}
        size++;
	}

	@Override
	public void clear() {
		Node head = first;
		
		while(head != null) {
			Node next = head.next;
			head.data = null;
			head.next = null;
			head.previous = null;
			head = next;
		}
		last = null;
		first = null;
		size = 0;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(MyList c) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Nested class which store information about next and previous elements in
	 * container MyList and data of this Node
	 */

	private static class Node {
		private Object data;
		private Node next;
		private Node previous;

		public Node(Node previous, Object data, Node next) {
			this.next = next;
			this.previous = previous;
			this.data = data;
		}

		@Override
		public String toString() {
			return data.toString();
		}

	}

}