package com.boyi.chapter16;

public class Philosopher extends Thread{

	private int bites=10;
	private Chopstick left;
	private Chopstick right;
	
	
	public Philosopher(Chopstick left, Chopstick right){
		this.left=left;
		this.right=right;
	}
	
	public void eat(){
		if(pickUp()){
		chew();
		putDown();
		}
	}
	
	public boolean pickUp(){
		
		if (!left.pickUp()){
		  return false;	
		}
		
		if(!right.pickUp()){
			left.putDown();
			return false;	
		}
		return true;
	}
	
	public void chew(){
		
	}
	
	public void putDown(){
		left.putDown();
		right.putDown();
	}
	
	public void run(){
	  for (int i=0;i<bites;i++){
		  eat();
	  }
	}
	
	public static void main(String[] args) {
	   Chopstick cs1 = new Chopstick();
	   Chopstick cs2 = new Chopstick();
	   Chopstick cs3 = new Chopstick();
	   
       Philosopher ph1 = new Philosopher(cs1,cs3);
       Philosopher ph2 = new Philosopher(cs2,cs1);
       Philosopher ph3 = new Philosopher(cs3,cs2);
       
       ph1.start();
       ph2.start();
       ph3.start();

	}

}
