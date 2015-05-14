package com.boyi.chapter11;

public class FindInteger {

	public static void main(String[] args) {
       int[] all={15,16,19,20,25,1,3,4,5,7,10,14};
       int index=findInteger(all,14);
       System.out.println(index);
	}
	
	public static int findInteger(int[] all, int target){
		
		int pivot=0;
		int index=0;
		
		for(int i=0;i<all.length-1;i++){
			if (all[i+1]<all[i]){
				pivot=i+1;
				break;
			}
		}
		
		int[] arrayleft = new int[pivot];
		int[] arrayright = new int[all.length-pivot];

		for(int i=0;i<pivot;i++){
			arrayleft[i]=all[i];
		}
		
		for(int i=0;i<all.length-pivot;i++){
			arrayright[i]=all[i+pivot];
		}
		
		int left =binarySearch(arrayleft, target, 0, pivot-1);
		int right =binarySearch(arrayright, target, 0, all.length-pivot-1);
		
		if (left==-1){
			index = pivot+right;
		}else{
			index = left;
		}
		return index;
	}
	
	public static int binarySearch(int[] all, int x, int first, int last){
		if (first>last){
			return -1;
		}
		
		int mid=(first+last)/2;
		
		if(x==all[mid]){
			return mid;
		}else if(x>all[mid]){
			return binarySearch(all,x,mid+1,last);
		}else{
			return binarySearch(all,x,first,mid-1);
		}
	}
	

	
	
}
