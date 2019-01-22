package org.test.datastructures.linkedlist;

public class Util {

	
	public static Node createList() {

		int count = 12;
		Node first = new Node(null, count);
		for (int i = count - 1; i > 0; i--) {
			first = new Node(first, i);
		}
		
		return first;
	}
	
	
	public static void printList(Node first) {
		
		 int cycleCnt = 0;
		
		 while(first != null && cycleCnt != 2) {
			 
			 if (first.isCycleStart()) {
				 cycleCnt++;
			 }
			 
			 System.out.printf("%d,", first.getValue());
			 first = first.getNext();
		 }
		
		System.out.println("");
	}
	
	
	
}
