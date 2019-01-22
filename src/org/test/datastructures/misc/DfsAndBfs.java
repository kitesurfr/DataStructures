package org.test.datastructures.misc;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

import org.test.datastructures.bintree.Node;
import org.test.datastructures.bintree.Utility;

public class DfsAndBfs {

	public static void main(String[] args) {

		AtomicInteger value = new AtomicInteger(0);
		Node root = new Node(null, null, value.get());			
		
		int depth = 3;
		Utility.createTree(root, depth, value);
		Utility.printTree(root, depth);
		
		int search = 14;
		boolean found = findDfs(search, root);
		System.out.printf("DFS Found %2d %b", search, found);
		
		
		found = findBfs(search, root);
		System.out.printf("\nBFS Found %2d %b", search, found);
	}

	private static boolean findBfs(int search, Node root) {
		
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			
			Node node = queue.poll();
			
			if (node.getValue() == search) {
				return true;
			}
			
			if (node.getLeft() != null) {
				queue.add(node.getLeft());
			}

			if (node.getRight() != null) {
				queue.add(node.getRight());
			}
		}
		
		return false;
	}

	private static boolean findDfs(int search, Node node) {

		if (node == null) {
			return false;
		} 
		
		if (node.getValue() == search) {
			return true;
		}
		
		return findDfs(search, node.getLeft()) || findDfs(search, node.getRight());
	}

}
