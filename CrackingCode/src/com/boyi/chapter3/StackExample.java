package com.boyi.chapter3;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
      Stack s= new Stack();  //Here we have not specify what class is stored in the stack. The default is Object.
      s.push(1);
      System.out.println(s.pop());
	}

}
