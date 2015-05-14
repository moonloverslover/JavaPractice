package com.boyi.leetcode;

public class AddBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input0 = "1010";
		String input1 = "10";

		// Use as radix 2 because it's binary    
		int number0 = Integer.parseInt(input0, 2);
		int number1 = Integer.parseInt(input1, 2);

		int sum = number0 + number1;
		Integer.toBinaryString(sum);

		System.out.println(sum);
		System.out.println(Integer.toBinaryString(sum));

		

	}

}
