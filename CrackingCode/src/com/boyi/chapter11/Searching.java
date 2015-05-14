package com.boyi.chapter11;

public class Searching {

	public static void main(String[] args) {
       int[] a={1, 3, 5, 8, 11, 15, 18,19};
       int low = 0;
       int high = 7;
       int x =18;
       System.out.println(binarySearchRecursive(a,x,low,high));
	}
	
	public static int binarySearchRecursive(int[] a, int x, int low, int high){
		if (low>high){
			return -1;
		}
		
		int mid = (low+high)/2;
		if (x>a[mid]){
			return binarySearchRecursive(a,x,mid+1,high);
		}else if(x<a[mid]){
			return binarySearchRecursive(a,x,low,mid-1);
		}else{
			return mid;
		}
		
	}

}
