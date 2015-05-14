package com.boyi.chapter3.myqueue;

public class MyQueue_Question {

	public static void main(String[] args) {
         MyQueue myq= new MyQueue();
         myq.enqueue(1);
         myq.enqueue(2);
         myq.enqueue(3);
         
         System.out.println(myq.peek());
         
         int a=myq.dequeue();
         System.out.println(a);
         
         System.out.println(myq.peek());

         
	}

}
