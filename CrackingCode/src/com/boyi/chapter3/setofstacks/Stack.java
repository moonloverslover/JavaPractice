package com.boyi.chapter3.setofstacks;


public class Stack {
	public int size=0;
	public Node top;
	private int capacity;
	
	public Stack(int capacity){
		this.capacity=capacity;
	}
	
	public void push(int i){
		Node t = new Node(i);
		t.next=top;
		top=t;
		size++;
	}
	
	public boolean isFull(){
		return size==capacity;
	}
	
	public int pop(){
		if (top!=null){
			int a=top.value;
			top=top.next;
			size--;
			return a;
		}
		return Integer.MAX_VALUE;
	}
	
	public int peek(){
		return top.value;
	}
	
	
}
