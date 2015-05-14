package com.boyi.chapter1;

public class CompressString {

	public static void main(String[] args) {
       String a = "ayykkkkkkkkkkkkkkk";
       
       StringBuilder sb = new StringBuilder();
       
       int i=0;
       int count=1;
       while (i<a.length()-1){
     
         if (a.charAt(i+1)==a.charAt(i)){
    	     count++;
    	     i++;
    	     
    	     if(i==a.length()-1){
    	    	 sb.append(a.charAt(i));
                 sb.append(count); 
    	     }
         
                 }
    	 else{
    		 sb.append(a.charAt(i));
             sb.append(count);
             count = 1;
             i++;
             
             if(i==a.length()-1){
            	 sb.append(a.charAt(i));
                 sb.append(1); 
             }
    	 }
         
       }
       
       if (sb.toString().length()<a.length()){
       System.out.print(sb.toString());}
       else{
       System.out.print(a);
       }
    	 System.out.print(String.valueOf(66).length());  
	}

}
