package com.boyi.careercupproblems;

import java.util.HashSet;
import java.util.Set;

public class RepeatedNum {

	public static void main(String[] args) {
     int[] a={ 1,2 ,3, 4 ,5,5 ,6,7 ,8};
     
     Set<Integer> ss = new HashSet<Integer>();
     for (int i=0;i<a.length;i++){
         if(!ss.contains(a[i])){
        	 ss.add(a[i]);
         }else{
        	 System.out.print(a[i]);
        	 break;
         }
    	 
     }
	}

}
