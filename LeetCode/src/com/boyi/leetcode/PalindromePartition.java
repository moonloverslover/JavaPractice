//Given a string s, partition s such that every substring of the partition is a palindrome.
//
//Return all possible palindrome partitioning of s.
//
//For example, given s = "aab",
//Return
//
//  [
//    ["aa","b"],
//    ["a","a","b"]
//  ]
//.....


package com.boyi.leetcode;

import java.util.ArrayList;

public class PalindromePartition {

	public ArrayList<ArrayList<String>> partition(String str) {
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		
//		if (ispalindrome(str)) {
//			ArrayList<String> all = new ArrayList<String>();
//			all.add(str);
//			solution.add(all);
//		}
//		
//		ArrayList<String> single = new ArrayList<String>();
//		for (Character c:str.toCharArray()) {
//			single.add(c.toString());
//		}
//		solution.add(single)；
		
		if (str ==null || str.length() ==0) {
			return result;
		}
		
		ArrayList<String> partition = new ArrayList<String>();
		addPalindrome(str, 0, partition,result);
			
		return result;
			
	}
	
	public void addPalindrome(String s, int start, ArrayList<String> partition,ArrayList<ArrayList<String>> result) {
		if (start == s.length()) {
			ArrayList<String> temp = new ArrayList<String>(partition);
			result.add(temp);
			return;
		}
		
		for (int i = start + 1; i <= s.length(); i++) {
			String str = s.substring(start, i);  // note
			if (isPalindrome(str)) {
				partition.add(str);
				addPalindrome(s, i, partition, result);
				partition.remove(partition.size() - 1);
			}
		}
	}
	
	
	public boolean isPalindrome(String str) {
		if (str.length() == 1) {
			return true;
		}
		for (int i=0;i<(int)str.length()/2;i++) {
			if (str.charAt(i) != str.charAt(str.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		PalindromePartition pp = new PalindromePartition();
		String str = "aba";
		ArrayList<ArrayList<String>> solution = pp.partition(str);
		System.out.println(solution);
	}

}
