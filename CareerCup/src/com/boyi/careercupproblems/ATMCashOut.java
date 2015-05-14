package com.boyi.careercupproblems;

public class ATMCashOut {

	public static void main(String[] args) {
		
		ATM mycash = ATM.getInstance();
		mycash.setCard("345 176 99 001");
		//System.out.print("money from account: "+mycash.getMoney());
		
		ATM yourcash = ATM.getInstance();
		yourcash.setCard("345 176 99 005");
		//System.out.print("money from account: "+yourcash.getMoney());
		
		System.out.print("1: "+mycash.getMoney());
		System.out.print("2: "+yourcash.getMoney());


	}

}
