package com.boyi.chapter4;

import java.util.ArrayList;


public class TreeTraversal {
	
	public void inorder(Node n) {
		
		if (n != null) {
			inorder(n.left);
			System.out.println(n.data);
			inorder(n.right);
		}

	}
	
	public void preorder(Node n) {
		
		if (n != null) {
			System.out.println(n.data);
			preorder(n.left);
			preorder(n.right);
		}
		
	}
	
	public void postorder(Node n) {
		
		if (n != null) {
			postorder(n.left);
			postorder(n.right);
			System.out.println(n.data);
		}
		
	}
	
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
	
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;
		
		
		TreeTraversal tt = new TreeTraversal();
		tt.inorder(n1);
		//tt.preorder(n1);
		//tt.postorder(n1);
	}

}
