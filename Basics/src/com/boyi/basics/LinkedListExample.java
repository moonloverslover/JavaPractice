package com.boyi.basics;

import java.util.LinkedList;

public class LinkedListExample {

	
	public static void main(String[] args) {
       LinkedList ll = new LinkedList();
       ll.add("F");
       ll.add("B");
       ll.add("D");
       ll.add("E");
       ll.add("C");
       System.out.println(ll);
       ll.addFirst("A");
       System.out.println(ll);
       ll.addLast("Z");
       System.out.println(ll);
       
       ll.removeFirst();
       System.out.println(ll);

       ll.removeLast();
       System.out.println(ll);
       
       ll.remove("B");
       System.out.println(ll);
       
       
	}

}
