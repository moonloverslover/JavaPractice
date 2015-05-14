//You are climbing a stair case. It takes n steps to reach to the top.
//
//Each time you can either climb 1 or 2 steps.
//In how many distinct ways can you climb to the top?

package com.boyi.leetcode;

public class ClimbingStairs {

	public int howmanyways(int n) {
		
		if (n < 0) {
			return 0;
		}else if (n ==0) {
			return 1;
		}else {
			return howmanyways(n-1)+howmanyways(n-2);
		}
		
	}
	public static void main(String[] args) {
		ClimbingStairs cs = new ClimbingStairs();
		System.out.println(cs.howmanyways(3));
	}

}
