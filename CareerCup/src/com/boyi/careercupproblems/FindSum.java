//Given an integer array, find pairs in an array which sum up to a given number. 
//For example: Array{4,5,1,3,2} and required sum=6 then output should be [1,5] and [2,4].



package com.boyi.careercupproblems;

import java.util.ArrayList;

public class FindSum {
	
	
	public static ArrayList<String> findpair(int[] all, int sum){
		
		ArrayList<String> pairs = new ArrayList<String>();
		for(int i=0;i<all.length-1;i++) {
			
			for (int j=i+1;j<all.length;j++){
				
				if (all[i]+all[j]==sum){		
					String pair = String.valueOf(all[i])+"-"+String.valueOf(all[j]);
					pairs.add(pair);
				}
			}
			
		}
		
		return pairs;
	}
	

	public static void main(String[] args) {
       int[] all = {4,5,1,3,2};
       int sum=6;
       ArrayList<String> pairs=findpair(all,sum);
       System.out.println(pairs);
	}

}
