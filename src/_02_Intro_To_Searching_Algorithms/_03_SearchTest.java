package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String[] words = {"Alpha", "Beta", "Lambda", "Omega"};
    	String Target = "Lambda";
        assertEquals(2, _01_LinearSearch.linearSearch(words, Target));
        assertEquals(3, _01_LinearSearch.linearSearch(words, "Omega"));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int[] array = {1,2,3,4,5,6,7,8};
    	int start = 1;
    	int end = 6;
    	int val = 15;
//    	_02_Intro_To _Searching_Algorithms.
//    	assertEquals();
        assertEquals(-1, _02_BinarySearch.binarySearch(array, start, end, val));
    }
}
