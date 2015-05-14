//Given a string S, find the longest palindromic substring in S. 
//You may assume that the maximum length of S is 1000, and 
//there exists one unique longest palindromic substring.

package com.boyi.leetcode;

public class LongestPalinSubstring {

	public String longestPalindrome(String s) {
		
		int n = 0;
		for (int i=0;i<s.length();i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(s.charAt(i));
			while
			
		}
		
		
	}
	
	public boolean isPalindrome(String s) {
		if (s.length()==1) {
			return true;
		}
		for (int i=0;i<(int)s.length()/2;i++){
			if (s.charAt(i) !=s.charAt(s.length()-i-1)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
