package com.boyi.chapter3.ascendingstack;

import java.util.Stack;

public class AscendingStack {

	public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(7);
        s1.push(3);
        s1.push(2);
        s1.push(9);
        s1.push(5);
        s1.push(10);
        Stack<Integer> s2= sortStack(s1);
	}
	
	public static Stack<Integer> sortStack(Stack<Integer> s1){
		Stack<Integer> s2 = new Stack<Integer>();
		return s2;
	}

}
