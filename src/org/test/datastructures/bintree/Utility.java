package org.test.datastructures.bintree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class Utility {


	public static void printTree(Node root, int depth) {
		
		List<List<Node>> levels = new ArrayList<>();

		Queue<Node> queue = new LinkedList<>();	
		queue.add(root);
		
		while (!queue.isEmpty()) {
			
			ArrayList<Node> level = new ArrayList<Node>();
			levels.add(level);
			
			
			for (Node node : new ArrayList<>(queue)) {
				
				level.add(node);
				
				if (node.getLeft() != null) {
					queue.add(node.getLeft());
				}
				
				if (node.getRight() != null) {
					queue.add(node.getRight());
				}
				
				queue.poll();
			}
			
		}
		
		
		depth += 3;
		for (List<Node> level : levels) {
			
			int padding = Double.valueOf(Math.pow(2, depth) / 2).intValue();
			depth--;
			
			System.out.printf("%" + (padding/2) +"d", level.get(0).getValue());
			List<Node> nodes = new ArrayList<>(level);
			nodes.remove(0);
			
			String numFormat = "%" + padding +"d";

			for (Node node : nodes) {
				System.out.printf(numFormat,  node.getValue());
			}
			
			System.out.println();
		}
		
		System.out.println();
	}

	public static void createTree(Node node, int level, AtomicInteger value) {
		
		if (level == 0) {
			return;
		}
		
		level--;
		
		node.setLeft(new Node(value.getAndIncrement()));
		createTree(node.getLeft(), level, value);
		
		
		node.setRight(new Node(value.getAndIncrement()));
		createTree(node.getRight(), level, value);
	}
}
