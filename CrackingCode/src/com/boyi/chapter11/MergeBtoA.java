package com.boyi.chapter11;

public class MergeBtoA {

	public static void main(String[] args) {
      int[] A = { 1, 3, 5 ,7, 9 ,10 ,22,25 ,0, 0 ,0, 0, 0, 0, 0, 0 ,0, 0, 0 ,0 ,0};
      int[] B= { 3, 6, 9, 15};
      merge(A,B,8,4);
	}

	public static void merge(int[] a, int[] b, int lastA, int lastB){
		
		int indexA=lastA-1;
		int indexB=lastB-1;
		int indexMerged=lastA+lastB-1;
		
		while(indexB>=0){
			
			if(indexA>=0 && a[indexA]>b[indexB]){
				a[indexMerged]=a[indexA];
				indexA--;
			}else{
				a[indexMerged]=b[indexB];
				indexB--;
			}
			indexMerged--;
			
		}
		
		for(int i:a){
			System.out.println(i);
		}
	}
}
