//Given a binary tree, determine if it is a valid binary search tree (BST).
//
//Assume a BST is defined as follows:
//
//The left subtree of a node contains only nodes with keys less than the node's key.
//The right subtree of a node contains only nodes with keys greater than the node's key.
//Both the left and right subtrees must also be binary search trees.
//confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.

package com.boyi.leetcode;

import com.boyi.leetcode.BinaryTreePreorderTraversal.TreeNode;

public class ValidateBST {

	public boolean validate(TreeNode n, Integer min , Integer max ) {
		
		if (n == null) {
			return true;
		}
		
		
		if ((n.val>max && max != null) || (n.val<=min && min != null)) {
			return false;
			
		}
		
		if (!validate(n.left, null, max) || !validate(n.right, min, null)) {
			return false;
		}
		
		return true;
		
		
		
	}
	
	
	public class TreeNode { 
	    int val; 
	    TreeNode left = null; 
        TreeNode right = null; 
        
	    TreeNode(int x) { 
	    	 val = x; 
   	    } 
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
