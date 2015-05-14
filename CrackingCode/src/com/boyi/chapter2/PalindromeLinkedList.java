package com.boyi.chapter2;

import java.util.ArrayList;
import java.util.Stack;

public class PalindromeLinkedList {

	
	public boolean isPalindrome(Node head) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();

		Node n = head;
		while (n.next!=null){
			al.add(n.data);
			n = n.next;
		}
		al.add(n.data);
		
		for (int i=0;i<(int)al.size()/2;i++) {
			if (al.get(i) != al.get(al.size()-i-1)) {
				return false;
			}
		}
		
		return true;	
	}
	public boolean isPalindrome_2(Node head) {
		
		Node n = head;
		Stack<Integer> st = new Stack<Integer>();
		
		while (n != null) {
			st.push(n.data);
			n = n.next;
		}
		n= head;
		while (n != null) {
			if (n.data != st.pop()) {
				return false;	
			}
			n = n.next;
		}

		return true;
	}
	
	
	public boolean isPalindrome_solution(Node head) {
		Node fast = head;
		Node slow = head;
		
		Stack<Integer> st = new Stack<Integer>();
		
		while (fast != null && fast.next != null) {
			st.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if (fast != null) {     // if the length is in odd, skip the middle.
			slow = slow.next;
			
		}
		
		while (slow != null) {
			if(st.pop() != slow.data){
				return false;
			}
			slow = slow.next;
		}
		
		return true;	
	}
	
	
	public static void main(String[] args) {
      Node head = new Node(1);
      head.addpendToTail(2);
      head.addpendToTail(2);
      head.addpendToTail(1);
      
      PalindromeLinkedList  pll = new PalindromeLinkedList ();
      System.out.println(pll.isPalindrome(head));
      System.out.println(pll.isPalindrome_2(head));
      System.out.println(pll.isPalindrome_solution(head));
	}

}
