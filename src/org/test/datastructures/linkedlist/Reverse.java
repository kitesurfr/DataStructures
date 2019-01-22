package org.test.datastructures.linkedlist;

public class Reverse {
	
	
	
	public static void main(String[] args) {
		
		Node first = Util.createList();
		Util.printList(first);
		
		//Node newFirst = reverse(first, null);
		Node newFirst = reverseIter(first);
		Util.printList(newFirst);
	}

	private static Node reverseIter(Node first) {
		
		Node next = first;
		Node prev = null;
		
		while (next != null) {
			
			Node temp = next.getNext();
			next.setNext(prev);
			
			prev = next;
			next = temp;	
			
		}
		
		return prev;
	}

	private static Node reverse(Node node, Node prev) {
		
		if (node.getNext() == null) {
			System.out.println(node);
			node.setNext(prev);
			return node;
		}
			
		Node newFirst = reverse(node.getNext(), node);
		node.setNext(prev);
		
		return newFirst;
	}
	
	

}
