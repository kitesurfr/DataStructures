package org.test.datastructures.bintree;

import java.util.concurrent.atomic.AtomicInteger;

public class Traversal {

	
	public static void main(String[] args) {
		
		AtomicInteger value = new AtomicInteger(0);
		Node root = new Node(value.getAndIncrement());
		
		int level = 4;
		Utility.createTree(root, level, value);
		Utility.printTree(root, level);
		
		int count = traverse(root);
		
		System.out.println("Number of leaf nodes: " + count);
	}
	
	
	
	private static int traverse(Node node) {
		
		if (node == null) {
			return 0;
		}
		
		if (node.isLeaf()) {
			return 1;
		}
		 
		
		return traverse(node.getLeft()) + traverse(node.getRight());
	}

	
}
