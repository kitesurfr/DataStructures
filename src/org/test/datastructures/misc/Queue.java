package org.test.datastructures.misc;

import org.test.datastructures.linkedlist.Node;

public class Queue {
	
	private Node head;

	private Node tail;

	public Node poll() {
		
		if (isEmpty()) {
			return null;
		}
		
		Node top = head;
		head = head.getNext();
		
		if (head == null) {
			head = null;
			tail = null;
		};
		
		return top;
	}
	
	
	public void enqueue(Node node) {
		
		if (isEmpty()) {
			head = node;
			tail = node;
			return;
		}
		
		tail.setNext(node);
		tail = node;
	}


	private boolean isEmpty() {
		return head == null;
	}
	

	
	
	
	
}
