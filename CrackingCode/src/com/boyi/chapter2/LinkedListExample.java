package com.boyi.chapter2;

public class LinkedListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		
		
		Node n = n1;
		Node head = n;
		
		
		
		
		n=n.next;
//		n=n2;
//		n=n.next;
//		n=n3;
		
//		n.next = n2;
//		n=n.next;
//		n.next = n3;
//		
		
		while(n!=null) {
			System.out.println(n.data);
			n = n.next;
		}

	}

}
