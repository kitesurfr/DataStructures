package org.test.datastructures.misc;

public class MergeSort {

	
	public static void main(String ars[]) {
		
		int[] arr = new int[] {8,2,3,7,5,1};
		int[] helper = new int[arr.length];
		BubbleSort.prinArray(arr);
		
		sort(arr, helper, 0, arr.length -1);
		BubbleSort.prinArray(arr);
	}

	private static void sort(int[] arr, int[] helper, int low, int high) {
		
		int middle = (low + high) / 2;

		if (low >= high) {
			return;
		}
		
		sort(arr, helper, low, middle);		
		sort(arr, helper, middle + 1, high);		
		
		weave(arr, helper, low, middle, high);
	}
 
	
	
	private static void weave(int[] arr, int[] helper, int low, int middle, int high) {
		
		int i = low;
		int j = middle + 1;
		int k = low;
		
		while ( i <= middle && j <= high) {
			
			while (i <= middle && arr[i] < arr[j] ) {
				helper[k] = arr[i];
				i++;
				k++;
			}
			
			while (j <= high && arr[j] <= arr[i]){
				helper[k] = arr[j];
				j++;
				k++;
			}
		}
	
		while (i <= middle) {
			helper[k] = arr[i];
			k++;
			i++;
		}

		while (j <= high) {
			helper[k] = arr[j];
			k++;
			i++;
		}
		
		for (int l = low; l <= high; l++) {
			arr[l] = helper[l];
		}

	}
	
	
	
}
