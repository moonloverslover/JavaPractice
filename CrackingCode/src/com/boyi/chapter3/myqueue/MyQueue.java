package com.boyi.chapter3.myqueue;

import java.util.Stack;

public class MyQueue {
	Stack<Integer> stackNewest;
	Stack<Integer> stackOldest;
	
	public MyQueue(){
		stackNewest = new Stack<Integer>();
		stackOldest = new Stack<Integer>();
	}
	
	public void enqueue(int value){
		stackNewest.push(value);
	}
	
	private void shiftStacks(){
		if (!stackNewest.isEmpty()){
			while(!stackNewest.isEmpty()){
				stackOldest.push(stackNewest.pop());
			}
		}
	}
	
	public int dequeue(){
		shiftStacks();
		return stackOldest.pop();
	}
	
	public int peek(){
		shiftStacks();
		return stackOldest.peek();
	}

}
