package com.boyi.chapter4;

public class MinHeightTree {
	
	public void createminheightTree(Node a,int[] A) {
		
	
		if (A.length == 1) {
			if (a.p.data>A[0]) {
				a.left = new Node(A[0]);
			}
			
			if (a.p.data<A[0]) {
				a.right = new Node(A[0]);
			}
			return;
		}
		
		if (A.length == 2) {
			
			
			if (a.p.data>A[0]) {
				a.data = A[1];
				a.left = new Node(A[0]);
			}
			
			if (a.p.data<A[0]) {
				a.data = A[0];
				a.right = new Node(A[1]);
			}
			
			System.out.println("run= ");

			return;
		}
		
		if (A.length == 3) {
			a.data = A[1];
			a.left = new Node(A[0]);
			a.right = new Node(A[2]);
			return;
		}
		
		
		while (A.length >3) {
			int mid = (int)(A.length/2);
			System.out.println(mid);
			a.data = A[mid];
			int[] subleft = new int[mid];
			int[] subright = new int[A.length-1-mid];
			for (int i=0;i<mid;i++) {
				subleft[i] = A[i];
			}
			for (int i=mid+1;i<A.length;i++) {
				subright[i-mid-1]=A[i];
			}
			System.out.println("subleft length= "+subleft.length);

			System.out.println("subright length= "+subright.length);

			Node left = new Node(0);
			Node right = new Node(0);
			
			a.left = left;
			a.right = right;
			a.left.p = a;
			a.right.p = a;
			createminheightTree(a.left,subleft);
			createminheightTree(a.right,subright);	
		}
		
		return;
				
	}
	
	public Node createminheightTree_solution(int[] A, int start, int end) {
		if (start>end) {
			return null;
		}
		
		int mid = (start+end)/2;
		
		Node n = new Node(A[mid]);
		
		n.left = createminheightTree_solution(A,start,mid-1);
		n.right = createminheightTree_solution(A,mid+1,end);
		
		//System.out.println(n.data);
		return n;
		
	}
	
	
	public static void main(String[] args) {
		int[] A = {1,2,3,4,5,6,7,8,9,10,11};
		MinHeightTree  mht = new MinHeightTree ();
		//Node a= new Node(0);
		//mht.createminheightTree(a,A); 
		mht.createminheightTree_solution(A, 0, A.length-1);
		
	}

}
