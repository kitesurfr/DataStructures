package org.test.datastructures.misc;

public class HeapSort {

	public static void main(String[] args) throws InterruptedException {
		
		int[] arr = new int[] {3,4,5,2,4,9,5,3};
		BubbleSort.prinArray(arr);

		makeHeap(arr);
		BubbleSort.prinArray(arr);
		
		heapSort(arr);
		BubbleSort.prinArray(arr);
		
	}

	private static void heapSort(int[] arr) throws InterruptedException {
		
		int max = arr.length - 1;
		swap(arr, 0, max);

		for (int i = 1; i < max; i++) {
			heapify(arr, 0, max - i);
			swap(arr, 0, max - i);
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void makeHeap(int[] arr) throws InterruptedException {
		
		int start = arr.length / 2 - 1;
		
		for (int i = start; i >= 0; i--) {
			heapify(arr, i, arr.length - 1);
		}
		
	}

	private static void heapify(int[] arr, int index, int end) throws InterruptedException {
		
		int top = index;

		int left = 2*index + 1;
		int right = 2*index + 2;
		
		while (left <= end) {
			
			int lastTop = top;
			
			if (arr[top] < arr[left]) {
				top = left;
			}
			
			if (right <= end && arr[top] < arr[right]) {
				top = right;
			}
			
			if (lastTop == top) {
				break;
			}
			
			swap(arr, top, lastTop);
			
			left = 2*top + 1;
			right = 2*top + 2;
		}
		
	}

}
