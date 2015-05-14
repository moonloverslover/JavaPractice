//Given an array of integers, every element appears twice except for one. 
//Find that single one.


package com.boyi.leetcode;

public class SingleNumber {

	public int findsinglenumber (int[] A) {
		int result = 0;
		for (int num:A) {
			result ^= num;  //异化？？
		}
		return result;
	}
	public static void main(String[] args) {
		int[] A = {1,2,4,5,5,4,2,1,7};
		SingleNumber sn = new SingleNumber();
		System.out.println(sn.findsinglenumber(A));
		//System.out.println(3^4);

	}

}
