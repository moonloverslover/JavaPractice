
package com.boyi.chapter11;

public class QuickSort {

	public static void main(String[] args) {
      int[] unsorted ={1,5,8,6,2,1,3,2}; 
      quickSort(unsorted,0,7);
      for(int i:unsorted){
      System.out.print(i);
	  }
	} 
	
	
	public static void quickSort(int[] arr, int left, int right){
		int index = partition(arr,left,right);
		if(left<index-1){
			quickSort(arr,left,index-1);
		}
	    if(index<right){
	    	quickSort(arr,index,right);
	    }
	}
	
    public static int partition(int[] arr, int left, int right){
    	int pivot = arr[(left+right)/2];
    	while(left<=right){
    		
    		while (arr[left]<pivot) left++;
    		
    		while (arr[right]>pivot) right--;
    		
    		if(left<=right){
    			 swap(arr,left,right);
    			 left++;
    			 right--;
    		}
    	}
    	
    	return left;
    }
    
    public static int[] swap(int[] arr,int left,int right){
    	int temp = arr[left];
    	arr[left]=arr[right];
    	arr[right]=temp;
    	return arr;
    }

}

