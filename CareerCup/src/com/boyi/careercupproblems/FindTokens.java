//write a method in java which takes argument as text string and array of token strings and find number of occurrences for each of the tokens in text string.



package com.boyi.careercupproblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindTokens {

	
	
	public static void main(String[] args) {
      String[] tokens = {"This", "is", "boy"} ;
  	  String text = "this is the new tech this boy and where is this boy and there is this boy";
  	  Map<String, Integer> mapout=count(tokens,text);
  	  System.out.print(mapout);
	}
	
	
	public static Map<String,Integer> count(String[] tokens, String text) {
		
		Set<String> tokenset = new HashSet<String>();
		for(String s:tokens){
			tokenset.add(s.toLowerCase());
		}
		
		Map<String, Integer> mapout = new HashMap<String, Integer>();
		String[] textsp = text.split(" ");
		
		for(int i=0;i<textsp.length;i++){
			
			String temp = textsp[i].toString();
			if (tokenset.contains(temp))
			
			   if (mapout.containsKey(temp)) {
				 mapout.put(temp, mapout.get(temp)+1);
			   }else{
				 mapout.put(temp,1);
			   }
			
		}
		
		return mapout;
	}

}
