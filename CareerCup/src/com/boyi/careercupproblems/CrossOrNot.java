//You have two sorted list A and B. 
//
//
//A = [1, 3, 4, 6,8,10, 17, 34] 
//B = [2, 8, 17, 33, 44, 66, 89, 100, 123] 
//
//Write a program to print those numbers which are 
//1) in A and not in B 
//2) in B and not in A 
//
//Eg: After print: 1 , 3 , 4 , 6 , 10, 33, 34, 44,, 66, 89, 100, 123 
//
//I was asked to write this in JAVA.

package com.boyi.careercupproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class CrossOrNot {
	
	public static ArrayList<String> findinformer(ArrayList<Integer> a, ArrayList<Integer> b) {
		
		ArrayList<String> outa = new ArrayList<String>();

		for(int i=0;i<a.size();i++){
			if (!b.contains(a.get(i))){
			  outa.add(String.valueOf(a.get(i)));	
			}	
		}
		
		return outa;
	}
	
	

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,3,4, 6,8,10, 17, 34));
		ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(2, 8, 17, 33, 44, 66, 89, 100, 123));
		ArrayList<String> outa = new ArrayList<String>();
		ArrayList<String> outb = new ArrayList<String>();

		outa=findinformer(a,b);
		outb=findinformer(b,a);

        System.out.print("in A not B:"+outa);
        System.out.print("in B not A:"+outb);

	}

}
