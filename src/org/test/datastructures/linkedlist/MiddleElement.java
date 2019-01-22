package org.test.datastructures.linkedlist;

public class MiddleElement {

	public static void main(String[] args) {
		Node first = Util.createList();
		Util.printList(first);
		findMiddleNode(first);
	}


	private static void findMiddleNode(Node first) {
		
		Node next = first;
		Node skipper = first;
		
		while ( skipper != null) {
			
			if (skipper.getNext() == null) {
				break;
			}
			
			System.out.println("Next " + next.getValue() + " Skipper " + skipper.getValue());
			
			next = next.getNext();
			skipper = skipper.getNext().getNext();
		}
		
		System.out.println("Found value " + next.getValue());
		
	}

}
