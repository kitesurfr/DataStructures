package org.test.datastructures.array;

import java.util.BitSet;

public class ArrayOneToHundred {

	public static void main(String[] args) {
		findMissingNUmber (new int[] {1, 2, 3, 4, 6}, 6);
		findMissingNumberWithDuplicates (new int[] {1, 2, 3, 4, 5, 5, 6, 9}, 9);
	}

	
	private static void findMissingNumberWithDuplicates(int[] array, int count) {
		
		BitSet bitSet = new BitSet(count);
		
		for (int num : array) {
			bitSet.set(num-1);
		}
		
		int lastIndex = 0;
		
		while (true) {
			
			int nextClearBit = bitSet.nextClearBit(lastIndex + 1);
			
			if (nextClearBit == lastIndex) {
				break;
			}
			
			lastIndex = nextClearBit;
			System.out.println("Missing: " + (nextClearBit + 1));
		}
	}

	
	private static void findMissingNUmber(int[] array, int count) {
		
		int controlSum = count * (count + 1) / 2;
		int sum = 0;
		
		for (int num : array) {
			sum += num;
		}
		
		System.out.println("Result " + (controlSum - sum));
	}

}
