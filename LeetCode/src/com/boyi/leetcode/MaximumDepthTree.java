package com.boyi.leetcode;

public class MaximumDepthTree {

    public int maxDepth(TreeNode root) {
    	
    	if (root == null) {
    		return 0;
    	}
    	
    	return findDepth(0,root);
        
    }
    
    public int findDepth(int d, TreeNode n) {
    	if (n == null) {
    		return d;
    	}
    	
    	if (n != null) {
    		d++;
    	}
    	
    	return Math.max(findDepth(d,n.left),findDepth(d,n.right));
    }
    
    
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		TreeNode n8 = new TreeNode(8);

	
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;
		n7.left = n8;
		
		MaximumDepthTree mdt = new MaximumDepthTree();
		System.out.println(mdt.maxDepth(n1));
		
	}

}
