package com.boyi.chapter8;

public class Restaurant {
	private static Restaurant instance=null;
	
	
	public Restaurant(){
		
	}
	
	public static Restaurant getInstance(){
		if(instance==null){
		  instance = new Restaurant();	
		}
		return instance;
	}

}
