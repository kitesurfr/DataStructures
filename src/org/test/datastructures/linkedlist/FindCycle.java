package org.test.datastructures.linkedlist;

public class FindCycle {
	
	
	public static void main(String[] args) {
		
		Node first = Util.createList();
		Util.printList(first);
		madeCycle(first);
		
		findCycle(first);
	}
	
	
	private static void findCycle(Node first) {
		
		Node next = first;
		Node skipper = null;
		
		while (next != null) {
			
			if (next.equals(skipper)) {
				System.out.printf("Found duplicate for %d marked as cycle %b \n", skipper.getValue(), skipper.isCycleStart());
				return;
			}
			
			if (skipper == null) {
				skipper = first;
			}
			
			next = next.getNext();
			skipper = skipper.getNext().getNext();
		}  
		
		System.out.println("No duplicate found");
	}


	private static void madeCycle(Node first) {

		Node last = first;
		int counter = 0;
		Node looper = null;
		while (last.getNext() != null) {
			
			if (counter++ == 5) {
				looper = last;
				System.out.println("Looper " + looper);
			}
			
			last = last.getNext();
		}
		
		last.setNext(looper);
		last.setCycleStart(true);
	}


}
