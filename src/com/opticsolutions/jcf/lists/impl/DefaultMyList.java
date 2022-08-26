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
     * Appends the specified element to the end of this list (optional
     * operation).
     *
     * @param e element to be appended to this list
     * @throws NullPointerException if the specified element is null and this
     *         list does not permit null elements
     */
	
	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Object e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
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