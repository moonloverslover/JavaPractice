//Given a binary tree, check whether it is a mirror of itself 
//(ie, symmetric around its center).
//
//For example, this binary tree is symmetric:
//
//    1
//   / \
//  2   2
// / \ / \
//3  4 4  3
//But the following is not:
//    1
//   / \
//  2   2
//   \   \
//   3    3
//Note:
//Bonus points if you could solve it both recursively and iteratively.

package com.boyi.leetcode;


public class SymmetricTree {

	public boolean isSym(TreeNode n) {
		
		if(n == null) {
			return true;
		}
		
	    return isSym(n.left,n.right);
	
		
	}
	
	public boolean isSym(TreeNode a, TreeNode b) {
		if (a == null) {
			return b==null;
		}
		
		if (b == null) {
			return false;
		}
		
		if (a.val != b.val) {
			return false;
		}
		
		if (!isSym(a.left,b.right)) {
			return false;
		}
		
		if (!isSym(a.right,b.left)) {
			return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(2);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(5);
		TreeNode n7 = new TreeNode(4);
	
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;
		
		SymmetricTree st = new SymmetricTree();
		System.out.println(st.isSym(n1));
	}

}
