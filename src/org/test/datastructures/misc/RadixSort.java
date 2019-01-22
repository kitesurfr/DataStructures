package org.test.datastructures.misc;

import java.util.ArrayList;
import java.util.List;

public class RadixSort {
	
	
	public static void main(String[] args) {

		int[] arr = new int[] {80,2,3000,756,501,18};
		BubbleSort.prinArray(arr);
		
		sort(arr, 3);
		BubbleSort.prinArray(arr);
	}

	private static void sort(int[] arr, int digits) {

		int radix = 10;
		int decPlace = radix;
		
		List<Integer>[] buckets = new ArrayList[radix];
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new ArrayList<>();
		}
		
		while (digits > 0) {
			
			digits--;
			
			for (int i = 0; i < arr.length; i++) {
				int digit = (arr[i] / decPlace) % radix;
				System.out.printf("Number %3d digit: %d decPlace: %3d\n", arr[i], digit, decPlace);
				buckets[digit].add(arr[i]);
			}

			decPlace *= radix;
			
			int index = 0;
			for (int j = 0; j < buckets.length; j++) {
				
				List<Integer> list = buckets[j];
				
				for (Integer integer : list) {
					arr[index] = integer;
					index++;
				}
				
				list.clear();
			}
		}
		
	}
	

}
