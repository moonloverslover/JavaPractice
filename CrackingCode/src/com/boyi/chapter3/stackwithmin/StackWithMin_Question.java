package com.boyi.chapter3.stackwithmin;

import java.util.Random;

public class StackWithMin_Question {

	public static void main(String[] args) {
      StackWithMin stack = new StackWithMin();
//      
//      Random rdm = new Random();
//      
//      for (int i=0;i<10;i++){
//    	  int a = rdm.nextInt(100);
//    	  System.out.println(a);
//          stack.push(a);
//
//      }
//      
//      System.out.println("*******************************");
      
      
      stack.push(5);
      stack.push(6);
      stack.push(3);
      stack.push(2);
      stack.push(7);

      System.out.println(stack.min());

      stack.pop();      
      System.out.println(stack.min());
      
      stack.pop();      
      System.out.println(stack.min());

      stack.pop();      
      System.out.println(stack.min());
      
      stack.pop();      
      System.out.println(stack.min());
      
      stack.pop();      
      System.out.println(stack.min());
	}

}
