package com.boyi.basics;



public class FlipTree {

	public void flip(TreeNode m) {
		
		TreeNode temp = m.left;
		m.left = m.right;
		m.right = temp;
		
		if(m.left != null) {
			flip(m.left);
		}
		
		if (m.right != null) {
			flip(m.right);
		}
		
	}
	
	public void inorder(TreeNode n) {
		
		if (n != null) {
			inorder(n.left);
			System.out.println(n.val);
			inorder(n.right);
		}

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
		
		FlipTree ft = new FlipTree();
		ft.flip(n1);
		ft.inorder(n1);

	}

}
