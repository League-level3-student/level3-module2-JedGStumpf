package _00_Intro_to_Sorting_Algorithms;

import java.util.Arrays;

class _02_SwappingDigits {

    // 1. Complete the method so that the first two elements of the array are
    //    swapped.
    public static void swapArrayOfTwo(int[] arr) {
    	
    	int zero = arr[0];
    	int one = arr[1];
    	arr[0] = one;
    	arr[1] = zero;
//    	System.out.println(Arrays.toString(arr));
    	
    }

    // 2. Complete the method so that it sorts the array using a bubble sort.
    //    Iterate through the array and when you find two elements that are out
    //    of order, swap them. Repeat this until the array is in order.
    public static void sortIntArray(int[] arr) {
    	System.out.println(Arrays.toString(arr));
    	boolean isSorted = false;
    	int count = 0;
    	while (!isSorted) {
    		for (int i = 0; i < arr.length-1; i++) {
    			if (arr[i] > arr[i+1]) {
    				int first = arr[i];
    				int second = arr[i+1];
    				arr[i] = second;
    				arr[i+1] = first;
    				count ++;
    			}
    		}
    		if (count == 0 ) {
    			isSorted = true;
    		} else {
    			count = 0;
    		}
    	}
    	System.out.println(Arrays.toString(arr));
    }

    // 3. Complete the method so that it finds the middle number in the array.
    //    *Hint* it helps to sort it first.
    //    *Double Hint* Use the method you already wrote in step 2 to sort it
    public static int findMiddle(int[] arr) {
    	boolean isSorted = false;
    	int count = 0;
    	while (!isSorted) {
    		for (int i = 0; i < arr.length-1; i++) {
    			if (arr[i] > arr[i+1]) {
    				int first = arr[i];
    				int second = arr[i+1];
    				arr[i] = second;
    				arr[i+1] = first;
    				count ++;
    			}
    		}
    		if (count == 0 ) {
    			isSorted = true;
    		} else {
    			count = 0;
    		}
    	}
    	int middle = arr.length / 2;
    	
    	return arr[middle];
    }
}
