//Given an array and a value, 
//remove all instances of that value in place and return the new length.
//
//The order of elements can be changed. 
//It doesn't matter what you leave beyond the new length.

package com.boyi.leetcode;

public class RemoveElement {
    
    public int removeElement(int[] A, int elem) {
        
        if (A == null){
            return 0;
        }
        
        int n = 0;
        for (int a:A) {
            if (a != elem) {
                A[n] = a;
                n++;
            }
        }
        
        return n;
        
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
