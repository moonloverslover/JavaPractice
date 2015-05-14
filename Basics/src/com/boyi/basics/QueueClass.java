package com.boyi.basics;

import java.util.LinkedList;
import java.util.Queue;


public class QueueClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(9);
        System.out.println(q.remove()); // first in, first out

	}

}
