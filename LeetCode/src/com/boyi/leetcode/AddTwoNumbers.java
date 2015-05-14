//You are given two linked lists representing two non-negative numbers. 
//The digits are stored in reverse order and each of their nodes contain a single digit. 
//Add the two numbers and return it as a linked list.
//
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8

// breaks when 3+4 digits

package com.boyi.leetcode;

public class AddTwoNumbers {

	public Node addtwo(Node n1, Node n2) {
		
		if (n1 == null && n2 != null) {
			return n2;
		}
		
		if (n1 != null && n2 == null ) {
			return n1;
		}
		
		if (n1 == null && n2 == null) {
			return null;
		}
		
		Node head = null;
		Node n = null;
		int forward = 0;
		
		while (!(n1 == null && n2 == null)) {
			
			
			int sum =0;
			if (n1 != null && n2!= null) {
				sum = n1.val + n2.val;
			}
			
			if (n1 != null && n2 == null) {
				sum = n1.val;
			}
			
			if (n1 == null && n2!= null) {
				sum = n2.val;
			}
			
			sum = sum + forward;
		//	System.out.println(sum);
			
			if (sum >= 10) {
				if (n == null) {
					n = new Node(sum-10);
					head = n;
				} else {
					n.next = new Node(sum-10);  // first assign next then move 
					n=n.next;
				}
				forward = 1;
			} else {
				if (n == null) {
					n = new Node(sum);
					head = n;
				} else {
					n.next = new Node(sum);
					n=n.next;
				}
				forward = 0;
			}
			
			n1 = n1.next;
			n2 = n2.next;	
			//System.out.println(n.val);
			
		}
		
		if (forward ==1) {
			n.next = new Node(1);
		}
		
		return head;	
	}
	
  public Node addtwo_trial(Node n1, Node n2) {
		
		if (n1 == null && n2 != null) {
			return n2;
		}
		
		if (n1 != null && n2 == null ) {
			return n1;
		}
		
		if (n1 == null && n2 == null) {
			return null;
		}
		
		Node n = new Node(999);

		Node head = n ;
		int forward = 0;
		
		while (!(n1 == null && n2 == null)) {
			
			
			int sum =0;
			if (n1 != null && n2!= null) {
				sum = n1.val + n2.val;
			}
			
			if (n1 != null && n2 == null) {
				sum = n1.val;
			}
			
			if (n1 == null && n2!= null) {
				sum = n2.val;
			}
			
			sum = sum + forward;
		//	System.out.println(sum);
			
			if (sum >= 10) {
				n.next = new Node(sum-10);
				n = n.next;
				forward = 1;
			} else {
				n.next = new Node(sum);
				n = n.next;
				forward = 0;
			}
			
			n1 = n1.next;
			n2 = n2.next;	
			//System.out.println(n.val);
			
		}
		
		if (forward ==1) {
			n.next = new Node(1);
		}
		
		return head.next;	
	}

	
	public static void main(String[] args) {
		
       Node n1 = new Node(2);
       
       n1.next = new Node(4);
       n1.next.next = new Node(3);
       
       Node n2 = new Node(5);
       n2.next = new Node(6);
       n2.next.next = new Node(7);
       //n2.next.next.next = new Node(9);
       
       AddTwoNumbers  atn = new AddTwoNumbers();
       Node  head = atn.addtwo(n1, n2);
       Node head_trial = atn.addtwo_trial(n1, n2);
       

       
       while (head!=null) {
    	   System.out.println(head.val);
    	   head = head.next;
       }
       
       while (head_trial!=null) {
    	   System.out.println(head_trial.val);
    	   head_trial = head_trial.next;
       }
       
       
  
       
	}
	
}
