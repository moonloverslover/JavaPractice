

package com.boyi.careercupproblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class FirstNonRepeated {
	
	public static void main(String[] args){
		
		String st = "aaaaarrrrtrthsgergfesdfdhgr";
		
		char[] chars =  st.toCharArray();
		
		Map<Character, Integer> stmap = new HashMap<Character, Integer>();
		Queue<Character> stque = new LinkedList<Character>();

		
		for (int i=0;i<chars.length;i++){
			
			if (stmap.containsKey(chars[i])){
			   	stmap.put(chars[i], stmap.get(chars[i])+1);
			}
			else{
				stmap.put(chars[i], 1);
				stque.add(chars[i]);
			}	
		}
		
		while (!stque.isEmpty()) {
			Character temp = stque.poll();
			if (stmap.get(temp) == 1) {
				System.out.print(temp);
				break;
			}
		}
	   
		//System.out.print(stque);

        
	}

}
