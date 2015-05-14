package com.boyi.careercupproblems;

public class SpiralPrint {
	
	public static void printspiral(char[][] charm){
		
		
		    int length = charm.length;
	        int i=0, j;
	        int count = 0;
	        //System.out.print(charm.length/2+1);
	        while(i < charm.length/2+1){
	            
	        	i=count;
	            j=count;
	            while(j<length){
	                System.out.print(charm[i][j++]);
	            }
	            j--;
	            while(i<length-1){
	                System.out.print(charm[++i][j]);
	            }
	            while(j>count){
	                System.out.print(charm[i][--j]);
	            }
	            while(i>count+1){
	                System.out.print(charm[--i][j]);
	            }
	            count++;
	            length--;

	        }
		
	}
	

	public static void main(String[] args) {
		
		char[][] charm = {{'i','l','o','v','e'},{'d','i','n','t','e'},{'n','e','w','e','p'},{'a','i','v','r','i'},{'m','a','x','e','c'}};
		
		printspiral(charm);
		

	}

}
