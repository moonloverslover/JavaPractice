//Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
//
//An example is the root-to-leaf path 1->2->3 which represents the number 123.
//
//Find the total sum of all root-to-leaf numbers.
//
//For example,
//
//    1
//   / \
//  2   3
//The root-to-leaf path 1->2 represents the number 12.
//The root-to-leaf path 1->3 represents the number 13.
//
//Return the sum = 12 + 13 = 25.


package com.boyi.leetcode;



public class SumRootLeaf {

	
	public int sumNumbers(TreeNode root) {
		
	   return add(0, root);	
		
    }
	
	public int add(int sum, TreeNode n) {
		
		
		if (n == null) {
			return 0;
		}
		
		if(n.left == null && n.right == null) {
			return sum*10+n.val;
		}
		
		return add(sum*10+n.val,n.left)+add(sum*10+n.val,n.right);
		
		
	}
	
	
	

	
	
	public static void main(String[] args) {
		
		SumRootLeaf srl = new SumRootLeaf();

		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
//		TreeNode n5 = new TreeNode(5);
//		TreeNode n6 = new TreeNode(6);
//		TreeNode n7 = new TreeNode(7);
	
		n1.left = n2;
		n1.right = n3;
	
		n2.left = n4;
//		n2.right = n5;
//		n3.left = n6;
//		n3.right = n7;
		
		System.out.println(srl.sumNumbers(n1));

	}

}
