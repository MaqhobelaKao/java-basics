package com.opticsolutions.jcf.generics.hw;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Doubly-linked list implementation of the MyList interface.
 *
 * All of the operations perform as could be expected for a doubly-linked list.
 * Operations that index into the list will traverse the list from the beginning
 * or the end, whichever is closer to the specified index.
 * 
 * @author Maqhobela Kao
 *
 */

public class DefaultMyListParameterized<T> implements MyListParameterized<T>, ListIterableParameterized<T> {
	
	/**
	 * Pointer to first node.
	 */
	private Node<T> first;

	/**
	 * Pointer to last node.
	 */
	private Node<T> last;

	/**
	 * Total amount of elements in object of MyListImpl.
	 */
	private int size;

	/**
     * Appends the specified element to the end of this list (optional
     * operation).
     *
     * @param e element to be appended to this list
     * @throws NullPointerException if the specified element is null and this
     *         list does not permit null elements
     */
	@Override
	public Iterator<T> iterator() {
		return new IteratorImpl<>();
	}

	@Override
	public void add(T e) {
		final Node<T> lastNode = last;
		final Node<T> newNode = new Node<>(lastNode, e, null);
		last = newNode;
		if (lastNode == null)
			last = newNode;
		else
			last.next = newNode;
		size++;
	}

	@Override
	public void clear() {
		for (Node<T> x = first; x != null;) {
			Node<T> next = x.next;
			x.data = null;
			x.next = null;
			x.previous = null;
			x = next;
		}
		first = null;
		last = null;
		size = 0;
	}

	@Override
	public boolean remove(Object obj) {
		if (obj == null) {
			for (Node<T> x = first; x != null; x = x.next) {
				if (x.data == null) {
					unlink(x);
					return true;
				}
			}
		} else {
			for (Node<T> x = first; x != null; x = x.next) {
				if (x.data.equals(obj)) {
					unlink(x);
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Returns an array containing all of the elements in this list in proper
	 * sequence (from first to last element).
	 * 
	 * This method acts as bridge between array-based and collection-based
	 * APIs.
	 *
	 * @return an array containing all of the elements in this list in proper
	 *         sequence
	 */
	
	@Override
	public Object[] toArray() {
		Object[] result = new Object[size];
		int index = 0;
		for (Node<T> x = first; x != null; x = x.next) {
			result[index++] = x.data;
		}
		return result;
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean contains(Object o) {
		if (o == null) {
			for (Node<T> x = first; x != null; x = x.next) {
				if (x.data == null) {
					return true;
				}
			}
		} else {
			for (Node<T> x = first; x != null; x = x.next) {
				if (x.data.equals(o))
					return true;
			}
		}

		return false;
	}

	@Override
	public boolean containsAll(MyListParameterized<?> c) {
		Object[] array = c.toArray();
		for (int i = 0; i < array.length; i++) {
			if (!contains(array[i])) {
				return false;
			}
			;
		}
		return true;
	}

	private Object unlink(Node<T> e) {
		Node<T> next = e.next;
		Node<T> previous = e.previous;
		Object obj = e.data;

		if (previous == null) {
			last = next;
		} else {
			previous.next = next;
			e.previous = null;
		}
		if (next == null) {
			last = previous;
		} else {
			next.previous = previous;
			e.next = null;
		}

		e.data = null;
		size--;
		return obj;

	}

	/**
	 * Removes object from MyListImpl by its own index.
	 * 
	 * Uses unlink method to change references in nodes.
	 * 
	 * @param index of the element.
	 * @return Object that had been removed.
	 */

	public Object removeNodeByIndex(int index) {
		return unlink(getNodeByIndex(index));

	}

	Node<T> getNodeByIndex(int index) {
		if (index > (size - 1)) {
			return null;
		}

		/**
		 * getting to the specified index by dividing the list into two parts and if
		 * index in first half we traverse from first note and if it on upper half we
		 * traverse from last note
		 * 
		 */
		if (index < (size >> 1)) {
			Node<T> x = first;
			for (int i = 0; i < index; i++)
				x = x.next;
			return x;
		}
		else {
			Node<T> x = last;
			for (int i = size - 1; i > index; i--) {
				x = x.previous;
			}
			return x;

		}

	}

	/**
	 * 
	 * @author Maqhobela
	 *
	 * @param <T> type
	 */

	private class IteratorImpl<T> implements Iterator<T> {

		int cursor = 0;

		/**
		 * Flag to define index of last returned value. If it is -1 that means method
		 * remove() had been called recently.
		 */
		int lastRet = -1;

		/**
		 * Returns true if the iteration has more elements. (In other words, returns
		 * {@code true} if {@link #next} would return an element rather than throwing an
		 * exception.)
		 *
		 * @return true if the iteration has more elements
		 */
		@Override
		public boolean hasNext() {
			return cursor != size;
			// return cursor < MyListImpl.this.size - 1;
		}

		/**
		 * Returns the next element in the iteration.
		 *
		 * @return the next element in the iteration
		 * @throws NoSuchElementException if the iteration has no more elements.
		 */

		@Override
		public T next() {
			Node<T> next = (Node<T>) getNodeByIndex(cursor);
			if (next == null) {
				throw new NoSuchElementException();
			}
			lastRet = cursor;
			cursor += 1;
			return next.data;
		}

		/**
		 * Removes from the underlying collection the last element returned by this
		 * iterator (optional operation). This method can be called only once per call
		 * to {@link #next}.
		 *
		 *
		 * @throws IllegalStateException if the {@code next} method has not yet been
		 *                               called, or the {@code remove} method has
		 *                               already been called after the last call to the
		 *                               {@code next} method
		 */
		@Override
		public void remove() {
			if (lastRet < 0) {
				throw new IllegalStateException();
			}
			DefaultMyListParameterized.this.removeNodeByIndex(lastRet);
			if (lastRet < cursor) {
				cursor--;
			}
			lastRet = -1;
		}

	}

	private static class Node<T> {
		private T data;
		private Node<T> next;
		private Node<T> previous;

		public Node(Node<T> previous, T data, Node<T> next) {
			this.next = next;
			this.previous = previous;
			this.data = data;
		}

		@Override
		public String toString() {
			return data.toString();
		}
	}
	
	@Override
	public ListIteratorParameterized<T> listIterator() {
		return new ListIteratorImplParameterized<>();
	}
	

	
	/**
	 * An iterator for lists that allows the programmer
	 * to traverse the list in either direction, modify
	 * the list during iteration, and obtain the iterator's
	 * current position in the list. A ListIteratorImpl
	 * has no current element; its cursor position always
	 * lies between the element that would be returned by a call
	 * to {@code previous()} and the element that would be
	 * returned by a call to {@code next()}.
	 * 
	 */
	private class ListIteratorImplParameterized<T> extends IteratorImpl<T> 
									implements ListIteratorParameterized<T> {
		
		
		/**
	     * Returns true if this list iterator has more elements when
	     * traversing the list in the reverse direction.  (In other words,
	     * returns true if previous would return an element
	     * rather than throwing an exception.)
	     *
	     * @return true if the list iterator has more elements when
	     *         traversing the list in the reverse direction
	     */
		
		@Override
		public boolean hasPrevious() {
			return cursor != 0;
		}

		/**
	     * Returns the previous element in the list and moves the cursor
	     * position backwards.  This method may be called repeatedly to
	     * iterate through the list backwards, or intermixed with calls to
	     * next() to go back and forth.  (Note that alternating calls
	     * to next() and previous() will return the same
	     * element repeatedly.)
	     *
	     * @return the previous element in the list
	     * @throws NoSuchElementException if the iteration has no previous
	     *         element
	     */
		
		
		@Override
		public T previous() {
				cursor -= 1;
				Node<T> previous = (Node<T>)getNodeByIndex(cursor);
				if (previous == null) {
					cursor = 0;
					throw new NoSuchElementException();
				}
				lastRet = cursor;
				return previous.data;
				
		}
		
		 /**
	     * Replaces the last element returned by next() or
	     * previous() with the specified element.
	     *
	     * @param e the element with which to replace the last element returned by
	     *          next(} or previous()
	     * @throws IllegalStateException if neither {@code next} nor
	     *         {@code previous} have been called, or {@code remove} or
	     *         {@code add} have been called after the last call to
	     *         {@code next} or {@code previous}
	     */

		@Override
		public void set(T element) {
			if (lastRet < 0) {
				throw new IllegalStateException();
			}	
			Node<T> x = (Node<T>)getNodeByIndex(lastRet);
			x.data = element;
			lastRet = -1;			
		}
	}
}
