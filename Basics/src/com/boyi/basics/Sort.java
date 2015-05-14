package com.boyi.basics;

import java.util.Arrays;

public class Sort {

	public String sortString(String str) {
		char[] chars = str.toCharArray();  // String to chars
		Arrays.sort(chars);
		return new String(chars); // chars back to String
	}
	public static void main(String[] args) {
		Sort s = new Sort();
		String str = "abhe";
		String sorted = s.sortString(str);
		System.out.println(str);

		System.out.println(sorted);
	}

}
