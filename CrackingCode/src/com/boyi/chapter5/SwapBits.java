package com.boyi.chapter5;

public class SwapBits {

	public static void main(String[] args) {
		int a=29;
	    int ans1=swapOddtoEven(a);
	       
	    System.out.print(ans1+"\n");

	       
		}

	public static int swapOddtoEven(int a){
		  
	  return (  ((a&0xaaaaaaaa)>>1) | ((a&0x55555555)<<1));
		
	}

}
