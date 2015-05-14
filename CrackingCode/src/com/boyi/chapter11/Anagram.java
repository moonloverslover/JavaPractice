package com.boyi.chapter11;

import java.util.Arrays;
import java.util.Comparator;

public class Anagram  implements Comparator<String>{

	@Override
	public int compare(String st1, String st2) {
		return sortChars(st1).compareTo(st2);
	}

	public String sortChars(String st){
		char[] chars = st.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
	
	public static void main(String[] args){
		
		String[] strs = {"korw","book","ace","ookb","you","eca","uoy","work","cea"};
		Anagram anagm = new Anagram();
		Arrays.sort(strs,anagm);
		for(String s:strs){
			System.out.println(s);
		}
	}
	
}
