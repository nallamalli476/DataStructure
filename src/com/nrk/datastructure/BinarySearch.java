package com.nrk.datastructure;

public class BinarySearch {
	
	public static void main(String arg[]) {
		
		int[] array = new int[] {30,55,67,89,100,135, 150};
		int low = 0;
		int high = 6;
		int mid =0;
		int target = 100;
		int value = binarySearch(array, low, high, mid, target);
		System.out.println(value);
		
	}
	
	private static int binarySearch(int[] array, int low, int high, int mid, int target) {

		while (low <= high) {

			mid = (low + high) / 2;

			if (array[mid] == target) {
				return mid;
			} else if (target > array[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
         return -1;
	}
}

