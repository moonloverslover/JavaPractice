package com.boyi.leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {

	public ArrayList<ArrayList<String>> anagram(String[] str) {
		ArrayList<ArrayList<String>> solution = new ArrayList<ArrayList<String>>();
		
		
		ArrayList<String> first = new ArrayList<String>();
		first.add(str[0]);
		solution.add(first);
	
		for (int i=1;i<str.length;i++) {
			
		
			int flag = 0; // no group found
			for (int j=0;j<solution.size();j++) {

				if (sortString(str[i]).equals(sortString(solution.get(j).get(0)))){
					solution.get(j).add(str[i]);

					flag = 1; // group found
			        break;		
				}	
			}
			if (flag == 0 ) {
				ArrayList<String> newgroup = new ArrayList<String>();
				newgroup.add(str[i]);
				solution.add(newgroup);
			}
			
		}
		return solution;
	}
	
	public String sortString(String str) {
		char[] chars = str.toCharArray();  // String to chars
		Arrays.sort(chars);
		return new String(chars); // chars back to String
	}
	public static void main(String[] args) {
		Anagrams ana = new Anagrams();
		String[] strs = {"korw","book","ace","ookb","you","eca","uoy","work","cea"};
		ArrayList<ArrayList<String>>  groups = ana.anagram(strs);
		System.out.println(groups);
	}

}
