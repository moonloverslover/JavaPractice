package com.boyi.chapter16;

public class RunnableTheadExample implements Runnable{
	public int count = 0;

	public void dothis(){
		
	}

	@Override
	public void run() {
		System.out.println("RunnalbeThread staring.");
		try{
			while (count<5){
				Thread.sleep(500);
				System.out.println(count);
				count++;
			}
		}catch(InterruptedException exc){
			System.out.println("RunnalbeThread interrupted.");
		}
		System.out.println("RunnableThread terminating.");
	}
	
	
	
	public static void main(String[] args){
		RunnableTheadExample instance = new RunnableTheadExample();
		Thread thread = new Thread(instance);
		thread.start();
	
	    while (instance.count!=5){
	       try{
	    	  Thread.sleep(250); 
	       }catch(InterruptedException exc){
	    	   exc.printStackTrace();
	       }
	    }
	}
	
}
