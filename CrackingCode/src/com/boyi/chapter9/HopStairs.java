package com.boyi.chapter9;

public class HopStairs {

	public static void main(String[] args) {
        int n=9;
        System.out.println(findways(10));
	}
	
	public static int findways(int n){
		if (n<0){
			return 0;
		}else if (n==1){
			return 1;
		}else{
			return findways(n-1)+findways(n-2)+findways(n-3);
		}
		
	}
	
	

}
