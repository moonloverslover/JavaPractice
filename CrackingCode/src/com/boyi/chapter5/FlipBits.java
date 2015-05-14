package com.boyi.chapter5;

public class FlipBits {

	public static void main(String[] args) {
       int a=29;
       int b=15;
       int ans1=howmanytoflip_1(a,b);
       int ans2=howmanytoflip_2(a,b);
       
       System.out.print(ans1+"\n");
       System.out.print(ans2+"\n");

       
	}

	public static int howmanytoflip_1(int a, int b){
	  
      int count=0;
	  
      for(int c=a^b;c!=0;c=c&(c-1)){
    	  count++;
      }
		
	  return count;	
	}
	
	
	public static int howmanytoflip_2(int a, int b){
		  
	      int count=0;
		  
	      for(int c=a^b;c!=0;c=c>>1){
	    	  count += c&1;
	      }
			
		  return count;	
		}
}


// c=c&(c-1) is to reduce one "1" in c