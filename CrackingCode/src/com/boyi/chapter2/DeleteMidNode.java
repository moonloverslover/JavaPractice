package com.boyi.chapter2;

public class DeleteMidNode {

	public boolean deletemid(Node c) {
		
		if (c == null || c.next == null) {
			return false;
		}
		
		c.data = c.next.data;
		c.next = c.next.next;
		return true;
		
	}
	
	

}
