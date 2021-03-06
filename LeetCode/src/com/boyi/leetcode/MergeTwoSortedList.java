//Merge two sorted linked lists and return it as a new list. 
//The new list should be made by splicing 
//together the nodes of the first two lists.

package com.boyi.leetcode;

import com.boyi.leetcode.LinkedListCircleI.ListNode;

public class MergeTwoSortedList {

	public ListNode merge(ListNode l1, ListNode l2 ){
		
		
		if (l1 == null) {
			return l2;
		}
		
		if (l2 == null) {
			return l1;
		}
		
		ListNode node = null;
		ListNode head = null;
		
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				if (node == null) {
					node = l1;  // node is moving
					head = node; // head is stored in "head"
				} else {
					node.next = l1;
					node = node.next;
				}
				l1 = l1.next;
			} else {
				if (node == null) {
					node= l2;
					head = node;
				} else {
					node.next = l2;
					node = node.next;
				}
				l2 = l2.next;
			}
			
		} 
				
		if (l1 == null) {
			node.next = l2;
		}
		
		if (l2 == null) {
			node.next = l1;
		}
		
		return head; 
		
		
		
	}
		
	
	class ListNode { 
	       int val; 
	       ListNode next; 
			      
	       ListNode(int x) { 
	          val = x; 
	          next = null; 
	       }  
	    } 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
