//Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
//
//Note:
//Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
//The solution set must not contain duplicate triplets.
//    For example, given array S = {-1 0 1 2 -1 -4},
//
//    A solution set is:
//    (-1, 0, 1)
//    (-1, -1, 2)

//  ????????????????

package com.boyi.leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {

	public ArrayList<ArrayList<Integer>> addthree(int[] input) {
		
		ArrayList<ArrayList<Integer>>  answer = new ArrayList<ArrayList<Integer>>();
		
		for (int i=0;i<input.length-2;i++) {
			for (int j=i+1;j<input.length-1;j++) {
				for (int k=j+1;k<input.length;k++) {
					if (input[i]+input[j]+input[k] == 0) {
						int[] temp = {input[i],input[j],input[k]};
						Arrays.sort(temp);
						System.out.println(temp[0]+" "+temp[1]+"  "+temp[2]);
						if (answer.isEmpty()) {
							ArrayList<Integer> set = new ArrayList<Integer>();
							set.add(temp[0]);
							set.add(temp[1]);
							set.add(temp[2]);
							answer.add(set);
						} else if ((temp[0] != (int)answer.get(answer.size()-1).get(0)) && (temp[1] != (int)answer.get(answer.size()-1).get(1)) && (temp[2] != (int)answer.get(answer.size()-1).get(2))  ) {
							ArrayList<Integer> set = new ArrayList<Integer>();
							set.add(temp[0]);
							set.add(temp[1]);
							set.add(temp[2]);
							answer.add(set);
						}
						
					}
				}
			}
		}
		
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		ThreeSum ts = new ThreeSum();
		int[] input = {-1, 0, 1, 2, -1, -4};
		System.out.println(ts.addthree(input));
	}

}
