package com.boyi.basics;

public class RecursionExample {

	public int recursive (int a) {
		if (a<0) {
			return 999;
		}
		
		recursive(a-1);
		System.out.println(a);
		return a;
	}
	public static void main(String[] args) {
		int a=3;
		
		RecursionExample re = new RecursionExample();
	}

}
