/*Given a string, find the length of the longest substring without repeating characters. 
For example, the longest substring without repeating letters for "abcabcbb" is "abc", 
which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.*/

package com.boyi.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    public String findlongestsubstring(String st){
    	
    	char[] chars = st.toCharArray();
    	StringBuilder sb = new StringBuilder();
    	
    	int N=1;
    	int index=0;
    	for (int i=0;i<chars.length;i++){
        	
    		Set<Character> subchars = new HashSet<Character>();
        	
        	int j=i;
    		while (subchars.contains(chars[j])!=true) {
    			subchars.add(chars[j]);
    			j++;	
    			if (j>chars.length-1) {
    				break;
    			}
    		}
    		
    		if (subchars.size() >=N) {
    			N=subchars.size();
    			index = i;	
    		}
    		
    		if (chars.length-1-index<N) {
    			break;
    		}		
    	}
    	
    	for(int i=index;i<index+N;i++){
    		sb.append(String.valueOf(chars[i]));	
    	}
    	
    	return sb.toString();
    	
    }
	public static void main(String[] args) {
		String st = "abcdefggggop";
		LongestSubString ls = new LongestSubString();
		String result = ls.findlongestsubstring(st);
		System.out.println(result);
	}

}
