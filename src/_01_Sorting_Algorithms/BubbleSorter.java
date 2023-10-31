package _01_Sorting_Algorithms;

import java.util.Arrays;

public class BubbleSorter extends Sorter{
    public BubbleSorter() {
        type = "Bubble";
    }

    /* 
     * Use the bubble sorting algorithm to sort the array.
     * You can use display.updateDisplay() to show the current
     * progress on the graph.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
    	System.out.println(Arrays.toString(array));
    	boolean isSorted = false;
    	int count = 0;
    	while (!isSorted) {
    		for (int i = 0; i < array.length-1; i++) {
    			if (array[i] > array[i+1]) {
    				int first = array[i];
    				int second = array[i+1];
    				array[i] = second;
    				array[i+1] = first;
    				count ++;
    			}
    		}
    		if (count == 0 ) {
    			isSorted = true;
    		} else {
    			count = 0;
    		}
    	}
    	System.out.println(Arrays.toString(array));
    	display.updateDisplay();
    }
}
