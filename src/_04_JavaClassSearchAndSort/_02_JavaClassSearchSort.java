package _04_JavaClassSearchAndSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Use the Arrays and Collections classes to implement the search and sort
 * methods below.
 */
public class _02_JavaClassSearchSort {
    
    public static int[] arraySort(int[] arr) {
        Arrays.sort(arr);
        
        return arr;
    }
    
    public static List<Double> listSort(List<Double> list){
        Collections.sort(list);
        return list;
    }

    public static Boolean arraySearch(char[] arr, char key) {
        Arrays.sort(arr);
        int ind = Arrays.binarySearch(arr, key);
        
        if (ind >=0) {
        	return true;
        }
        
        
        return false;
    }
    
    public static Boolean listSearch(List<Character> list, Character key) {
        Collections.sort(list);
        
        int ind = Collections.binarySearch(list, key);
        
        if (ind >= 0) {
        	return true;
        }
        
        return false;
    }
}
