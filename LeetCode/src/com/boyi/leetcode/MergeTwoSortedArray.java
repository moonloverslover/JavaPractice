//
//Given two sorted integer arrays A and B, merge B into A as one sorted array.
//
//Note:
//You may assume that A has enough space (size that is greater or equal to m + n) to 
//hold additional elements from B.
//The number of elements initialized in A and B are m and n respectively.

package com.boyi.leetcode;

public class MergeTwoSortedArray {

	public int[] merge(int[] A, int[] B, int m, int n) {
		
		int last = m+n-1;
		int i = m-1;
		int j = n-1;
		
		while (i > -1 && j > -1) {
			if (A[i] >= B[j]) {
				A[last] = A[i];
				i--;
			}else {
				A[last] = B[j];
				j--;
			}
			last--;
		}
		
		if (i == -1) {
			for (int k=0;k<j;k++) {
				A[k] = B[k];
			}
		}
		
		
		return A;
		
		
		
		
	}
	public static void main(String[] args) {
        int[] A = {1,3,5,9,10,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] B = {2,4,7,8};
        int m = 5;
        int n = 4;
        MergeTwoSortedArray mtsa = new MergeTwoSortedArray();
        int[] result = mtsa.merge(A,B,m,n);
        for (int a:result) {
            System.out.println(a);
        }
        
	}

}
