//Given a linked list, return the node where the cycle begins. 
//If there is no cycle, return null.
//
//Follow up:
//Can you solve it without using extra space?



package com.boyi.leetcode;

public class LinkedListCircleII {

	public ListNode whereitbegins(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		
		while (fast.next != null) {
			
			fast = fast.next.next;

			if (fast == null) {
				return null;
			}
			
			slow = slow.next;

			if (fast == slow) {
				
				slow = head;
				while (slow != fast) {
					slow = slow.next;
					fast = fast.next;
				}
				
				return slow;
			}
		}
		
		return null;
	}
	
	
	
	class ListNode {
		int val;
		ListNode next = null;
		
		ListNode(int d) {
			val = d;
		}	
	}
	
}
