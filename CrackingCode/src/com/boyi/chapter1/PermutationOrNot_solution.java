package com.boyi.chapter1;

import java.util.Arrays;

public class PermutationOrNot_solution {

	public static void main(String[] args) {
		String a1="console";
	    String a2="celsono";
	    System.out.print(permutation(a1,a2));
	}

	public static boolean permutation(String st1, String st2){
		if (st1.length() != st2.length()){
			return false;
		}
		return sort(st1).equals(sort(st2));
	}
			
	public static String sort(String st){
		char[] chars = st.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
	
}




//Arrays.sort();