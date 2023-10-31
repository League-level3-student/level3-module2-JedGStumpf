package _03_More_Algorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
//        String answer = "";
        
    	return Integer.toString(num1) + " x " + Integer.toString(num2) + " = " + Integer.toString(num1*num2);
    }
    
    public static int findBrokenEgg(List<String> eggs) {
        int index = 0;
        for (int i = 0; i < eggs.size(); i++) {
        	if (eggs.get(i) == "cracked") {
        		index = i;
        		break;
        	}
        }
    	return index;
    }
    
    public static boolean isPrime(int num) {
    	int range = (int) Math.sqrt(num);
//    	System.out.println("NUM: "+ num + " RANGE: "     + range);
    	int i = 2;
    	
    	while (i <= range) {
    		if (num % i == 0) {
    			return false;
    		}
    		i++;
//    		System.out.println("I " + i + " ");
    	}
    	
    	
    	return true;
    }
    
    public static boolean isSquare(int num) {
//    	System.out.println((int) Math.sqrt(10202));
    	if ((int) Math.sqrt(num) == Math.sqrt(num)) {
    		return true;
    	}
    	
    	return false;
    }
    
    public static boolean isCube(int num) {
    	if ((int) Math.cbrt(num) == Math.cbrt(num)) {
    		return true;
    	}
    	return false;
    }
    
    public static int countPearls(List<Boolean> oysters) {
    	int count = 0;
    	
    	for (boolean bool : oysters) {
    		if (bool == true) {
    			count++;
    		}
    	}
    	
    	return count;
    }
    
    public static double findTallest(List<Double>  persons) {
    	double  height = 0.0;
    	
    	for (double hght : persons) {
    		if (hght > height) {
    			height = hght;
    		}
    	}
    	
    	return height;
    }
    
    public static String findLongestWord(List<String> words) {
    	String word = "";
    	for (String wrd : words) {
    		if (wrd.length() > word.length()) {
    			word = wrd;
    		}
    	}
    	return word;
    }
    
    public static <array> List<Double> sortScores(List<Double> results) {
    	int resSize = results.size();
    	boolean isSorted = false;
    	int count = 0;
    	
//    	Double[] nums =  (Double[]) results.toArray();
    	
    	Double[] nums = new Double[resSize];
    	System.out.println(results.size() + "    " + nums.length);
    	
    	for (int i = 0; i < results.size(); i++) {
    		nums[i] = results.get(i);
    	}
    	
    	while (!isSorted) {
    		for (int i = 0; i < nums.length-1; i++) {
    			if (nums[i] > nums[i+1]) {
    				Double temp = nums[i+1];
    				nums[i+1] = nums[i];
    				nums[i] = temp;
    				count++;
    				}
    			}
    		if (count == 0) {
    			isSorted = true;
    		} else {
    			count = 0;
    		}
    			
    			
    		}
    	
    	results = (List<Double>) Arrays.asList(nums);
    	return results;
    }
    
    
    public static <array> List<String> sortDNA(List<String> results) {
    	int resSize = results.size();
    	boolean isSorted = false;
    	int count = 0;
    	
//    	Double[] nums =  (Double[]) results.toArray();
    	
    	String[] nums = new String[resSize];
    	System.out.println(results.size() + "    " + nums.length);
    	
    	for (int i = 0; i < results.size(); i++) {
    		nums[i] = results.get(i);
    	}
    	
    	while (!isSorted) {
    		for (int i = 0; i < nums.length-1; i++) {
    			if (nums[i].length() > nums[i+1].length()) {
    				String temp = nums[i+1];
    				nums[i+1] = nums[i];
    				nums[i] = temp;
    				count++;
    				}
    			}
    		if (count == 0) {
    			isSorted = true;
    		} else {
    			count = 0;
    		}
    			
    			
    		}
    	
    	results = (List<String>) Arrays.asList(nums);
    	return results;
    }
}
