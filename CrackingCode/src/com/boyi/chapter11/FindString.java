package com.boyi.chapter11;

import java.util.ArrayList;

public class FindString {

	public static void main(String[] args) {
      String[] strs={"at","","","dog","","","","dog"};
      findwhich(strs,"dog");
	}
	
	
	public static void findwhich(String[] strs, String target){
	  
	    ArrayList<Integer> indices = new ArrayList<Integer>();

//		for(String s:strs){
//			if (s==target){
//				indices.add(s.);
//			}
//		}
		
		for(int i=0;i<strs.length;i++){
			if (strs[i]==target){
				indices.add(i);
			}
		}
		
		for(int i=0;i<indices.size();i++){
			System.out.println(indices.get(i).toString());
		}
		
	}

}
