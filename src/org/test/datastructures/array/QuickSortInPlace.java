package org.test.datastructures.array;

import java.util.Arrays;

public class QuickSortInPlace {

	public static void main(String[] args) {
		
		int[] array = new int[] {7,3,4,5,6,9,1,2};
		quickSort(array, 0, array.length -1);
		
		System.out.println(Arrays.toString(array));
	}

	
	private static void quickSort(int[] array, int start, int end) {
		
		System.out.printf("Start: %d, End: %d \n", start, end);
		
		if (end == start) {
			return;
		}
		
		int pivot = sortNumbers(array, start, end);
		
		quickSort(array, start, pivot - 1);
		quickSort(array, pivot, end); 
		
	}


	private static int sortNumbers(int[] array, int start, int end) {
		
		int index = (start + end) / 2;
		int pivot = array[index];
		
		int low = start;
		int high = end;
		
		while(true) {
			
			if (low > high ) {
				break;
			}
			
			while ( array[low] < pivot ) {
				low++;
			}
			
			while ( array[high] > pivot ) {
				high--;
			}
			
			
			if ( low <= high) {
				swap(array, low, high);
				low++;
				high--;
			}
		} 
		
		return low;
		
	}


	private static void swap(int[] array, int low, int high) {		int temp = array[high];
		array[high] = array[low];
		array[low] = temp;
	}

}
