package com.boyi.leetcode;

import java.util.ArrayList;

public class TwoSum {
	
	public ArrayList<Integer> twosum(int[] numbers, int target){
		ArrayList<Integer> index = new ArrayList<Integer>(); 
		a:for (int i=0;i<numbers.length-1;i++) {
			b:for (int j=i+1;j<numbers.length;j++) {
				if (numbers[i]+numbers[j]==target) {
					index.add(i+1);
					index.add(j+1);
					break a;
				}
			}	
		}
		return index;
	}
	
	public static void main(String[] args) {
		int[] numbers = {2,7,11,15};
		int target = 26;
		TwoSum ts= new TwoSum();
		ArrayList<Integer> index = ts.twosum(numbers, target);
		System.out.println("index1= "+index.get(0)+"index2="+index.get(1));	
	}

}
