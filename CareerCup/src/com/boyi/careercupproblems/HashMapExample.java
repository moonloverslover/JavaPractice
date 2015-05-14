package com.boyi.careercupproblems;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Long> m1 = new HashMap<String, Long>();
		
		m1.put("Chinese", new Long(100000));   
		m1.put("English", new Long(20000));   
		m1.put("French", new Long(3000));   
		m1.put("Korean", new Long(400));   
		
		
		System.out.println("The HashMap holds " + m1.size() + " elements");   
		
		System.out.println("The value for Key \"Korean\" is " + m1.get("Korean").toString());   
			   
		System.out.println(m1);   

	}

}
