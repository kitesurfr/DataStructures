package org.test.datastructures.misc;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = new int[] {8,2,3,7,5,1};
		prinArray(arr);
		
		sort(arr);
		prinArray(arr);
	}

	public static void prinArray(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println();
		
	}

	private static void sort(int[] arr) {

		boolean isSwap = true;
		
		while (isSwap) {
			
			isSwap = false;
			
			for (int i = 0; i < arr.length - 1; i++) {
				
				if (arr[i] > arr[i + 1]) {
					swap(arr, i);
					isSwap = true;
				}
			}
			
		}
		
	}

	private static void swap(int[] arr, int i) {
		int temp = arr[i];
		arr[i] = arr[i+1];
		arr[i+1] = temp;
	}
	
	
}
