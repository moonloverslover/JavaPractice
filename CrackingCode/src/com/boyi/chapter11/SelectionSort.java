
package com.boyi.chapter11;

public class SelectionSort {

	public static void main(String[] args) {
      double[] unsorted ={1,5,8,6,2,1,3,2};
      double[] sorted = selectionsort(unsorted);
      
      for(double d:sorted){
    	  System.out.println(d);
      }
	}
	
public static double[] selectionsort(double[] unsorted){
		
    for(int i=0;i<unsorted.length-1;i++){
    	
    	int index=0;
    	double value=unsorted[0];
    	for(int j=0;j<unsorted.length-i-1;j++){
    		if (unsorted[j+1]>=value){
    			index=j+1;
    			value=unsorted[j+1];
    		}
    	}
    	
    	if (index!=unsorted.length-i-1){
    		double temp=unsorted[unsorted.length-i-1];
    		unsorted[unsorted.length-i-1]=value;
    		unsorted[index]=temp;
    	}
    }
		
	return unsorted;	
	}

}

