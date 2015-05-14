package com.boyi.chapter3.setofstacks;

import java.util.ArrayList;

public class SetofStacks {
	
	public int capacity;
	ArrayList<Stack> stacks = new ArrayList<Stack>();
	
	public SetofStacks(int capacity){
		this.capacity=capacity;
	}
	
	
	public void push(int value){
	   Stack last = getLastStack();
	   if (last!=null && !last.isFull()){
		   last.push(value);
	   }else{
		   Stack stack = new Stack(capacity);
		   stack.push(value);
		   stacks.add(stack);
	   }
		
	}
	
	public int pop(){
	  Stack last = getLastStack();
      int v =last.pop();
      if (last.size ==0){
    	  stacks.remove(stacks.size()-1);
      }
	  return v;
	}
	
	public Stack getLastStack() {
		if (stacks.size() == 0) {
			return null;
		}
		return stacks.get(stacks.size() - 1);
	}
}
