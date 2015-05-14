//A method takes two array list as its arguments 
//Both ArrayList have list of objects similar to the example here below 
//AL1 = {A,A,B,L,C,F,D,E,F,D,Z,R} 
//AL2 = {C,E,X,Z,M,X,P,L,M,N,S,T,P,B,A} 
//The aim is to create a third arraylist AL3 which would contain only elements that are occuring exactly twice, even after combining both AL1 and AL2. 
//So, the resultant list should be as seen here below 
//AL3 = {B,C,F,D,Z,E,X,P,M} 
//What logic do we follow?



package com.boyi.careercupproblems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;



public class CombineAL {

	public static ArrayList<String> findpair(ArrayList<Character> a1, ArrayList<Character> a2){
		
		ArrayList<Character> all= new ArrayList<Character>(a1);
		ArrayList<String> aout = new ArrayList<String>();
		all.addAll(a2);
		
		Set<Character> unique= new HashSet<Character>(all);  //A Set is a Collection that contains no duplicates.
		
		//System.out.print(unique);

		for (int i=0;i<unique.size();i++){
		int temp=Collections.frequency(all,unique.toArray()[i]);
		if (temp==2){
			aout.add(unique.toArray()[i].toString());
		}
		}

		return aout;
		
		
    }
		
	
	public static void main(String[] args) {
		ArrayList<Character> a1 = new ArrayList<Character>(Arrays.asList('A','A','B','L','C','F','D','E','F','D','Z','R'));	
		ArrayList<Character> a2 = new ArrayList<Character>(Arrays.asList('C','E','X','Z','M','X','P','L','M','N','S','T','P','B','A'));	

		ArrayList<String> aout = findpair(a1,a2);
		System.out.print(aout);
	}

}
