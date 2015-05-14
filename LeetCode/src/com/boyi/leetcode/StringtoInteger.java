//Implement atoi to convert a string to an integer.
//
//Hint: Carefully consider all possible input cases. If you want a challenge, 
//please do not see below and ask yourself what are the possible input cases.
//
//Notes: It is intended for this problem to be specified vaguely 
//(ie, no given input specs). You are responsible to gather all 
//the input requirements up front.

package com.boyi.leetcode;

public class StringtoInteger {

	
	public int atoi(String str) {
		
		String s = str.trim();
		
		if (s.length() ==0) {
			return 0;
		}
		
		int Int_max = Integer.MAX_VALUE;
		int Int_min = Integer.MIN_VALUE;
		
		int sign = 1;
		int res = 0;
		
		int i =0;
		
		if (s.charAt(0) == '-') {
		  sign = -1;	
		  i++;
		}else if (s.charAt(0) == '+') {
		  sign = 1;
		  i++;
		}
		
		double abs = 0;
		for (int j=i;j<s.length();j++) {
			int digit = s.charAt(j)-'0';  // convert character to ASCII   '0' -> 48
		    System.out.println(digit);
			abs = abs + digit*Math.pow(10,(s.length()-j-1));
		}
		
		double output = abs*sign;
		
		if (output >= Int_min && output <= Int_max) {
			return (int)output;
		}else {
			return 0;
		}
				
	}
	
	
	public static void main(String[] args) {
	   StringtoInteger si = new StringtoInteger();	
       System.out.println(si.atoi("-1234000"));
	}

}
