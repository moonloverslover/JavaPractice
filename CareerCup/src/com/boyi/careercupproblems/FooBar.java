package com.boyi.careercupproblems;

public class FooBar {

	public static void printout(int n){
		
		for (int i=1;i<=n;i++){
			
			int temp;
			if (i%3==0 && i%5!=0) {System.out.print("Foo"+"\n");};
			if (i%3!=0 && i%5==0) {System.out.print("Bar"+"\n");};
			if (i%3==0 && i%5==0) {System.out.print("FooBar"+"\n");};
			if (i%3!=0 && i%5!=0) {System.out.print(i+"\n");};
			
		}
	}
	
	public static void main(String[] args) {
		int n=15;
		printout(n);

	}

}
