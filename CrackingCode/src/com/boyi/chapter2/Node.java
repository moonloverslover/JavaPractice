package com.boyi.chapter2;


public class Node {
	
	Node next = null;
	int data;
	
	public Node(int d){
		data = d;
	}
	
	public void addpendToTail(int d){
		Node  end = new Node(d);
		Node n=this;
		while(n.next!=null){
			n=n.next;
		}
	    n.next = end; 
	}
	
	public Node deleteNode(Node head, int d){
		Node n = head;
		
		if (n.data == d) {
			return head.next; // moved head
		}
		
		while (n.next != null) {
			if (n.next.data == d) {
				n.next = n.next.next;
				return head; // head did not change
			}
			n = n.next;

		}
		
		return head;
	}
	
	public Node addToHead(Node head, int d) {
		Node n = new Node(d);
		n.next = head;
		return n;
	}
	
	public static void main(String[] args) {
		Node head = new Node(1);
		System.out.println(head.next);
		head.addpendToTail(2);
		head.addpendToTail(3);
		head.addpendToTail(4);
		head.addpendToTail(5);


		System.out.println(head.data);
		System.out.println(head.next.data);
		
		Node newhead = head.deleteNode(head, 2);
		System.out.println(newhead.next.data);
		
		Node newhead1 = head.addToHead(newhead,-1);
		System.out.println(newhead1.data);
		System.out.println(newhead1.next.data);
		System.out.println(newhead1.next.next.data);
		

		
				

	}
	

}
