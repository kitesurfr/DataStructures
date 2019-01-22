package org.test.datastructures.bintree;

public class Array {
	
	
	public static void main(String[] args) {
		
	   int[] arr = new int[] {1,4,8,16,32,64};
	   int search = 16;
	   boolean found = traverse(arr, search);
	   
	   System.out.printf("Found %2d ? %b", search, found);
	}

	private static boolean traverse(int[] arr, int search) {
		
		int low = 0;
		int high = arr.length - 1;
		 
		 
		while ( low <= high) {
			
			int middle = (low + high) / 2 ;
			
			int element = arr[middle];
			
			if (search < element) {
				high = middle - 1;
				continue;
			}
			
			if (search > element) {
				low = middle + 1;
				continue;
			}
			
			//element == search
			return true;
		}
		
		return false;
	}

	

}
