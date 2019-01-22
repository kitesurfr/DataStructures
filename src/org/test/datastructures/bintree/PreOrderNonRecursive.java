package org.test.datastructures.bintree;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class PreOrderNonRecursive {
		
		public static void main(String[] args) {
			
			AtomicInteger value = new AtomicInteger(0);
			Node root = new Node(value.getAndIncrement());
			
			int level = 4;
			Utility.createTree(root, level, value);
			Utility.printTree(root, level);
			
			traverse(root);
		}

		
		private static void traverse(Node root) {
			
			LinkedList<Node> stack = new LinkedList<>();
			stack.push(root);
			
			while (!stack.isEmpty()) {
				
				Node node = stack.poll();
				System.out.print(node.getValue() + ", ");
				
				if (node.getRight() != null) {
					stack.push(node.getRight());
				}
				
				if (node.getLeft() != null) {
					stack.push(node.getLeft());
				}
			}
			
		}
		
		
}
