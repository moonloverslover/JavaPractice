package com.boyi.basics;

import java.util.ArrayList;

public class ArrayListExample {

	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int a=1;
		int b=2;
		al.add(a);
		al.add(b);
		//System.out.println(al);
		
		ArrayList<Integer> sub = new ArrayList<Integer>();
		sub.add(4);
		sub.add(2);
		sub.add(6);
		al.addAll(sub);
		//System.out.println(al);	
		System.out.println(al.indexOf(2));	

		
	}

}
