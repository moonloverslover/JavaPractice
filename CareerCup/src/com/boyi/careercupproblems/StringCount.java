//find the substring count from a string without string functions in java? 
//Given String str = "abcdefghcde"; 
//String find = "cde"; 
//Count occurrences of cde in String str

package com.boyi.careercupproblems;

import java.util.HashSet;
import java.util.Set;

public class StringCount {
	
	int count;
	
	public static Set<String> findstring(String input, String target){
		
		char[] chars= input.toCharArray();
		char[] targetarr = target.toCharArray();
		Set<String> pairs = new HashSet<String>();
		
		for (int i=0;i<chars.length-(targetarr.length-1);i++){
			if (chars[i]== targetarr[0] & chars[i+1]== targetarr[1] & chars[i+2]== targetarr[2]) {
				pairs.add(String.valueOf(i)+"-"+String.valueOf(i+2));
			}
		}
		
		return pairs;
	}
	
	

	public static void main(String[] args) {
		
		String input = "abcdefghcde";
		String target = "cde";
		
		Set<String> pairs = findstring(input,target);
		System.out.print(pairs);

	}

}
