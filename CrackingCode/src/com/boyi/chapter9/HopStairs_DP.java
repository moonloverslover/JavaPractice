package com.boyi.chapter9;

public class HopStairs_DP {

	public static void main(String[] args) {
        int n=10;
        int[] map = new int[n+1];
        System.out.println(findwaysDP(n,map));
	}
	
	public static int findwaysDP(int n, int[] map){
		if (n<0){
			return 0;
		}else if (n==1){
			return 1;
		}else if (map[n]>-1) {
			return map[n];
		}else{
			map[n]=findwaysDP(n-1,map)+findwaysDP(n-2,map)+findwaysDP(n-3,map);
			return map[n];
		}
		
	}
	
	

}
