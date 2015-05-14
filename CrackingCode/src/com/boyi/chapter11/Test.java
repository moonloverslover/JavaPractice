package com.boyi.chapter11;

public class Test {

	public static void main(String[] args) {
      int[] a = {1,2};
      myMethod(a);
      
      for(int i:a){
    	  System.out.println(i);
      }
	}
	
	public static void myMethod(int[] a){
		a[0]=8;
		a[1]=9;
	}

}
