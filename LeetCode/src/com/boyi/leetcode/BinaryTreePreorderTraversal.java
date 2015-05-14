//Given a binary tree, return the preorder traversal of its nodes' values.
//
//For example:
//Given binary tree {1,#,2,3},
//
//
//   1
//    \
//     2
//    /
//   3
//
//
//return [1,2,3].
//
//Note: Recursive solution is trivial, could you do it iteratively?

package com.boyi.leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
	
	public ArrayList<Integer> preordertraval_recursive(TreeNode n) {
        ArrayList<Integer> result = new ArrayList<Integer>();  
        
        if (n != null) {
        	result.add(n.val);
            result.addAll(preordertraval_recursive(n.left));
            result.addAll(preordertraval_recursive(n.right));
        }
        
		return result;	
	}
	
    public ArrayList<Integer> preordertraval_iterative(TreeNode n) {
        ArrayList<Integer> result = new ArrayList<Integer>();  

		Stack<TreeNode> st = new Stack<TreeNode>();
		
		st.push(n);
		
		while (!st.isEmpty()) {
			TreeNode tn = st.pop();
			result.add(tn.val);
			
			if (tn.right != null) {
				st.push(tn.right);
			}
			
			if (tn.left !=null) {
				st.push(tn.left);
			}
		}
		
		return result;
 		
	}
	
	
	public class TreeNode { 
	     int val; 
	     TreeNode left = null; 
         TreeNode right = null; 
         
	     TreeNode(int x) { 
	    	 val = x; 
    	 } 
	} 
	
	
	public void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
	
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;
		
		ArrayList<Integer> result = preordertraval_recursive(n1);
	}
	 

}
