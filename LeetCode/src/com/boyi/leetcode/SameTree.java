//Given two binary trees, write a function to check if they are equal or not.
//
//Two binary trees are considered equal if they are structurally identical 
//and the nodes have the same value.

package com.boyi.leetcode;

import java.util.LinkedList;
import java.util.Queue;


public class SameTree {
	

	 public boolean isSameTree(TreeNode n, TreeNode m) {
	 
		 Queue<TreeNode> queueN = new LinkedList<TreeNode>();
		 queueN.add(n);
		 
		 Queue<TreeNode> queueM = new LinkedList<TreeNode>();
		 queueM.add(m);
		 
		 while ((!queueN.isEmpty()) && (!queueN.isEmpty())) {
			 TreeNode tempn = queueN.remove();
			 TreeNode tempm = queueM.remove();
			 
			 if (tempn.val != tempm.val) {
				 return false;
			 }
			 
			 if (tempn.left != null && tempm.left != null && tempn.right != null && tempm.right != null) {
				 queueN.add(tempn.left);
				 queueN.add(tempn.right);
				 queueM.add(tempm.left);
				 queueM.add(tempm.right);
			 }else if (tempn.left != null && tempm.left != null && tempn.right == null && tempm.right == null) {
				 queueN.add(tempn.left);
				 queueM.add(tempm.left);
			 }else if (tempn.left == null && tempm.left == null && tempn.right != null && tempm.right != null) {
				 queueN.add(tempn.right);
				 queueM.add(tempm.right);
			 }else if (tempn.left == null && tempm.left == null && tempn.right == null && tempm.right == null){
				//System.out.println("leaf");
			 }else {
				 return false;
			 }
			 
		 } // end of while
		 
		 return true;
		 
	 }
	
	public boolean isSameTree_DFS(TreeNode n, TreeNode m) {
	
		if (n == null && m == null) {
			return true;
		}
		
		if ( n == null && m !=null) {
			return false;
		}
		
		if ( n != null && m ==null) {
			return false;
		}
		
		if (n != null && m != null) {
			if (n.val != m.val) {
				return false;
			}
		}
		
		
		return isSameTree_DFS(n.left,m.left)&&isSameTree_DFS(n.right,m.right);
		
	}
	
	
	public static void main(String[] args) {
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
		
		TreeNode m1 = new TreeNode(1);
		TreeNode m2 = new TreeNode(2);
		TreeNode m3 = new TreeNode(3);
		TreeNode m4 = new TreeNode(4);
		TreeNode m5 = new TreeNode(5);
		TreeNode m6 = new TreeNode(6);
		TreeNode m7 = new TreeNode(7);
		TreeNode m8 = new TreeNode(8);

		m1.left = m2;
		m1.right = m3;
		m2.left = m4;
		m2.right = m5;
		m3.left = m6;
		m3.right = m7;
		
		m7.right = m8;
		
		SameTree st = new SameTree();
		//System.out.println(st.isSameTree(n1, m1));
		System.out.println(st.isSameTree_DFS(n1, m1));

	}

}
