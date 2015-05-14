package com.boyi.careercupproblems;

public class ATM {
	
	private static ATM instance=null;
	private String creditcard;
	
	private ATM(){  //private constructor
		
	}
	
	public static ATM getInstance(){
		if(instance==null) {
		   instance=new ATM();
		}
		return instance;
	}
	

	public void setCard(String card){
		creditcard=card;
	}
	
	public String getMoney(){
		 return creditcard;
	}
	
	public void getCard(){
		creditcard=null;
	}

}
