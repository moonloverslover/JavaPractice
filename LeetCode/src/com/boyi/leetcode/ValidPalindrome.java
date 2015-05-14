//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//
//For example,
//"A man, a plan, a canal: Panama" is a palindrome.
//"race a car" is not a palindrome.
//
//Note:
//Have you consider that the string might be empty? This is a good question to ask during an interview.
//
//For the purpose of this problem, we define empty string as valid palindrome.


package com.boyi.leetcode;

import java.util.ArrayList;

public class ValidPalindrome {

	public boolean validpdm(String str) {
		if (str == null) {
			return true;
		}
		
		int a1 = 'a';
		int b1 = 'z';
		int a2 = 'A';
		int b2 = 'Z';
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i=0;i<str.length();i++) {
			int temp = str.charAt(i);
			if (temp >= a1 && temp <= b1) {
				al.add(temp);
			}else if (temp >= a2 && temp <= b2) {
				temp = temp - a2 + a1;
				al.add(temp);
			}	
		}
		
		for (int i=0;i<(int)al.size()/2;i++) {
			if (al.get(i) != al.get(al.size()-1-i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		ValidPalindrome vp = new ValidPalindrome();
		System.out.println(vp.validpdm("A man, a plan, a canal: Panama"));
		System.out.println(vp.validpdm("race a car"));
	}

}
