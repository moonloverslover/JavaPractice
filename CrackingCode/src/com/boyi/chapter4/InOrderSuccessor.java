package com.boyi.chapter4;

public class InOrderSuccessor {

	public Node findnext(Node n) {
		if (n.right != null) {
			return minimum(n.right);
		}
		
		Node y = n.p;
		while (y!=null && n==y.right) {
			n = y;
			y = y.p;
		}
		return y;  // If we haven't found the successor even we arrive at root,return null.
	}
	
	public Node minimum (Node n) {
		while (n.left != null) {
			n = n.left;
		}
		return n;
	}
	
	public Node maximum (Node n) {
		while (n.right != null) {
			n = n.right;
		}
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
