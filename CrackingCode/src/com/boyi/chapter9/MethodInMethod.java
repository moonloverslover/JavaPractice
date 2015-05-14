package com.boyi.chapter9;

public class MethodInMethod {
    
	
    public static void main(String[] args) {
    	
    	double a=3;
		double b=myMethod(a);
		System.out.println(b);
	   
	}
	
	public static double myMethod(double a){	
		
		if (a<0) {
			return 10.0;
		}else if (a>0){
			a--;
			return myMethod(a);
		}else{
			return 10;
		}
			
	}

}




//////////////////////////////////////////////why???
