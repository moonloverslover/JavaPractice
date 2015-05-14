//You have an Array of a million numbers. Duplicates exist in the array. 
//Print out all duplicate numbers. 
//Give best way to do this.


package com.boyi.careercupproblems;

import java.util.HashSet;
import java.util.Set;

public class PrintDublicates {

	public static void main(String[] args) {
       double[] numbers = { 1, 3, 5, 3, 6 ,4 ,9, 6 ,5, 4, 7, 4 ,3, 7 ,8, 9};
       
       Set<Double> unique = new HashSet<Double>();
       Set<Double> duplicate = new HashSet<Double>();
       for (int i=0;i<numbers.length;i++) {
    	   if (!unique.add(numbers[i])) {
    		   duplicate.add(numbers[i]);
    	   }
       }
       System.out.print(duplicate);
	}

}
