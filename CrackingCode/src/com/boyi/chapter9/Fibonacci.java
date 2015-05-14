package com.boyi.chapter9;

public class Fibonacci {
	
	public static void main(String[] args){
		int i=100;
		System.out.println(fibonacci(i));
	}
	
	public static int fibonacci(int i){
		if(i==0){return 0;}
		if(i==1){return 1;}
        return fibonacci(i-1)+fibonacci(i-2);
	}

}
