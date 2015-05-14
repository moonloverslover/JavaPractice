package com.boyi.chapter11;

public class BubbleSort {

	public static void main(String[] args) {
      double[] unsorted ={1,2, 5,2,3,7,4,6,2};
      double[] sorted = bubblesort(unsorted);
      
      for(double d:sorted){
    	  System.out.println(d);
      }
	}
	
public static double[] bubblesort(double[] unsorted){
		

		for(int i=0;i<unsorted.length-1;i++){
			
			for (int j=0;j<unsorted.length-i-1;j++){
				double left = unsorted[j]; // convert char to int directly
				double right = unsorted[j+1];
				if (left>right) {
					double temp = unsorted[j];
					unsorted[j]=unsorted[j+1];
					unsorted[j+1]=temp;
				}
			}
			
		}
	return unsorted;	
	}

}
