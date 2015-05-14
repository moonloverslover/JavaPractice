//From a given string of numeric values, print the individual numbers in words separated by space. 
//Input: ¡°2490¡± 
//Output: two four nine zero


package com.boyi.careercupproblems;

import java.util.ArrayList;

public class NumberToName {

	public static void main(String[] args) {
		
		String input = "2490573487875";
		char[] numbers = input.toCharArray();
		
		ArrayList<String>  names = new ArrayList<String>();
		
		for (int i=0;i<numbers.length;i++){
			char tempchar = numbers[i];
	        String tempname="empty";
	        switch (tempchar) {
	            case '0':  tempname = "zero";
                         break;
	            case '1':  tempname = "one";
	                     break;
	            case '2':  tempname = "two";
	                     break;
	            case '3':  tempname = "three";
	                     break;
	            case '4':  tempname = "four";
	                     break;
	            case '5':  tempname = "five";
	                     break;
	            case '6':  tempname = "six";
	                     break;
	            case '7':  tempname = "seven";
	                     break;
	            case '8':  tempname = "eight";
	                     break;
	            case '9':  tempname = "nine";
	                     break;
	            }
		    names.add(tempname);
		}
		
		System.out.print(names);
		
	}

}
