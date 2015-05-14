//Write code in java to move char to next position with minimum space requirement? 
//
//String input = "abcde"; 
//
//String output = "eabcd";



package com.boyi.careercupproblems;

public class MoveChar {

	public static void main(String[] args) {

	//method 1	
	String input = "abcde";
	char[] arr = input.toCharArray();
	char temp;
	temp=arr[0];
	arr[0]=arr[arr.length-1];
	int i=1;
	while ( i<=4) {
		char temp2=arr[i];
		arr[i]=temp;
		temp=temp2;
		i++;
	}
	
	System.out.print(new String(arr));	
	}
	
	
	
	//learn
    //1. string to char[]   st.toCharArray() 
    //2. char[] back to string     new String(char[])  use this constructor!

}
