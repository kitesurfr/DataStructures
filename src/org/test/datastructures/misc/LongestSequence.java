package org.test.datastructures.misc;


/*
 * Given an unsorted array of integers, find the length of longest increasing subsequence.
 
Example:
Input: [10,9,2,5,3,7,101,18]
Output: 4 
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.

 * 
 * 
 */

public class LongestSequence {

	public static void main(String[] args) {

		int[] input = new int[] {10, 22, 9, 33, 21, 50, 41, 60, 80};
		
		int lenght = findSeqLenght(input);
		System.out.println(lenght);
		
		lenght = findSeqLenghtDyn(input);
		System.out.println(lenght);
	}

	private static int findSeqLenghtDyn(int[] input) {
		
		int[] memory = new int[input.length];
		
		for (int i = 0; i < memory.length; i++) {
			memory[i] = 1;
		}
		
		for (int i = 1; i < memory.length; i++) {
			updateMemoryDyn(input, memory, i);
		}
		
		return findMax(memory);
	}


	private static int findMax(int[] memory) {
		int max = 1;
		for (int i : memory) {
			max = max < i ? i : max;
		}
		return max;
	}

	private static void updateMemoryDyn(int[] input, int[] memory, int index) {
		int count = findLongestSeqICanAddTo(input, memory, index);
		memory[index] = count;
	}

	private static int findLongestSeqICanAddTo(int[] input, int[] memory, int index) {
		int maxCount = 0;
		for (int i = 0; i < index; i++) {
			if (input[i] < input[index]) {
				maxCount = memory[i] > maxCount ? memory[i] : maxCount;
			}
		}
		return maxCount + 1;
	}
	
	
	private static int findSeqLenght(int[] input) {
		
		int[] memory = new int[input.length];
		
		for (int i = 0; i < memory.length; i++) {
			memory[i] = -1;
		}
		
		memory[0] = input[0];
		
		for (int i = 1; i < input.length; i++) {
			updateMemory(memory, input, i);
		}
		
		return getSize(memory);
	}

	private static void updateMemory(int[] memory, int[] input, int index) {
		int size = getSize(memory);
		int indexToUpdate = findNearestValue(memory, input[index], 0, size - 1);
		memory[indexToUpdate] = input[index];
	}

	private static int getSize(int[] memory) {
		
		int lenght = 0;
		
		for (int i = 0; i < memory.length; i++) {
			if(memory[i] == -1) {
				break;
			}
			lenght++;
		}
		
		
		return lenght;
	}

	private static int findNearestValue(int[] memory, int search, int low, int high) {

		if (low >= high) {
			if (memory[high] > search) {
				return high;
			}
			return high+1;
		}
		
		int middle = (low + high) / 2;
		int val = memory[middle];
		
		if (val == search) {
			return middle;
		}
		
		if (search < val) {
			return findNearestValue(memory, search, low, middle);
		}
		
		return findNearestValue(memory, search, middle+1, high);
	}

}
