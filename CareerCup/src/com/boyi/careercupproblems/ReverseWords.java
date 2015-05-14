//Write a function to e reverse the order of words in a sentence using constant extra space 
//eg: "Here I am" would be "am I Here". 

package com.boyi.careercupproblems;

import java.util.Arrays;

public class ReverseWords {

	public static void main(String[] args) {
       String sentence= "Here I am";
       String[] splitst= sentence.split(" ");
       String[] splitnew = new String[splitst.length];
       
       for (int i=0;i<splitst.length;i++) {
    	   splitnew[i]=splitst[splitst.length-1-i];
    	   System.out.print(splitnew[i]+" ");
       }
       
       System.out.print(Arrays.toString(splitnew));
       
       StringBuilder sb = new StringBuilder();
       for (String s:splitnew){
    	   sb.append(s);
       }
       System.out.print(sb.toString());

	}

}
