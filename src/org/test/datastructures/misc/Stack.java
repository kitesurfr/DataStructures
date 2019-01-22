package org.test.datastructures.misc;

import org.test.datastructures.linkedlist.Node;

public class Stack<T> {
	
	private Node<T> top;

	public T pop() {

		if (isEmpty()) {
			return null;
		}
		
		T value = top.getValue();
		top = top.getNext();
		
		return value;
	}
	
	
	public void push(T value) {
		top = new Node<T>(top, value);
	}
	
	public T peak() {
		
		if (isEmpty()) {
			return null;
		}
		
		return top.getValue();
	}
	
	public boolean isEmpty() {
		return top == null;
	}
}
