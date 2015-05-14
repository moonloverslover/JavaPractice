package com.boyi.chapter3.setofstacks;

public class StackExample {

	public static void main(String[] args) {
	  int a=3;
      Stack stack = new Stack(a);
      stack.push(1);
      stack.push(2);
      stack.push(3);
      
      System.out.println(stack.size);
      
      stack.pop();
      System.out.println(stack.size);

      stack.pop();
      System.out.println(stack.size);

      stack.pop();
      System.out.println(stack.size);


	}

}
