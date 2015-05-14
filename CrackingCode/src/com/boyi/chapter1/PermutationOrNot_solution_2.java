package com.boyi.chapter1;

import java.util.Arrays;

public class PermutationOrNot_solution_2 {

	public static void main(String[] args) {
		String a1="console";
	    String a2="celsono";
	    System.out.print(permutation(a1,a2));
	}

	public static boolean permutation(String st1, String st2){
		if (st1.length() != st2.length()){
			return false;
		}
		
		int[] letters = new int[256];//ASCII
		char[] st1_chars = st1.toCharArray();
		
		for (char c:st1_chars){
			letters[c]++;
		}
		
		for(int u:letters){
		System.out.print(u+"\n");
		}
		
		for(int i=0;i<st2.length();i++){
			int c=st2.charAt(i);
			
			if(--letters[c]<0){
				return false;
			}
		}
		return true;
				
	}
			
	
}




// increment