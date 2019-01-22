package org.test.datastructures.array;

import java.util.Arrays;

public class ArrayFindDuplicates {

	public static void main(String[] args) {
		
		
		findDuplicates(new int[] {1,2,2,3,4,5,6,6});

	}

	private static void findDuplicates(int[] array) {

		
		Arrays.sort(array);
		
		int prev = array[0];
		
		for (int i = 1; i < array.length; i++) {
			int num = array[i];
			
			if (prev == num) {
				System.out.println("Found duplicates: " + num);
			}
			
			prev = num;
		}
		
		
		
	}

}
