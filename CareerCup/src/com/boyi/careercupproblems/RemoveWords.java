//Using a Java data structure, eliminate all unnecessary/stop words from a string. Assume you are given the string 
//"To be or not to be - that is the question: Whether it is nobler in the mind to suffer, the slings and arrows of outrageous fortune. Or to take up arms against a sea of troubles, and by opposing end them" 
//The unnecessary words to remove are "a", "be", "to", "the", "that", "this", "or" 
//So the resulting string should be like this 
//"not - is question: Whether it is nobler in mind suffer¡­



package com.boyi.careercupproblems;

import java.util.HashSet;
import java.util.Set;

public class RemoveWords {

	public static void main(String[] args) {
		
		//method 1
//		String sentence = "To be or not to be - that is the question: Whether it is nobler in the mind to suffer, the slings and arrows of outrageous fortune. Or to take up arms against a sea of troubles, and by opposing end them";
//		String words="a be to the that this or"; 
//		
//		String[] w =words.split(" ");  // find space and split	
//		String[] s =sentence.split(" ");  // find space and split
//		String output = new String();
//		String temp = new String();
//		
//		int n=w.length;
//		int N=s.length;
//		int i,j;
//		
//		for(i=0;i<N;i++){
//			temp=s[i];
//			for (j=0;j<n;j++){
//				if (s[i].toLowerCase().equals(w[j])) {
//					temp = "";
//				}
//			}
//			if (!temp.isEmpty()) {
//			output=output+" "+ temp; }
//		}
//
//		System.out.print(output.trim());
		
		
		
		//method 2		
		String sentence = "To be or not to be - that is the question: Whether it is nobler in the mind to suffer, the slings and arrows of outrageous fortune. Or to take up arms against a sea of troubles, and by opposing end them";
		String words="a be to the that this or"; 
		
		String[] stopWords = words.split(" ");
		String[] splitStr = sentence.split(" ");

		
		HashSet<String> hashStopWords = new HashSet<String>();
		for (String arrStr : stopWords) {
			hashStopWords.add(arrStr);
		}

		int j = 0;
		for (int i = 0; i < splitStr.length; i++) {
			
			if (!hashStopWords.contains(splitStr[i].toLowerCase())) {
				splitStr[j] = splitStr[i];
				j++;

			}
		}
		
		for (int i=0;i<j;i++)
		System.out.print(splitStr[i]+" ");
		
		
		
		
		//learn
		String[] wds = {"a","b","c"};
		for (String str:wds){
			System.out.println(str);
		}
		
	}
	

}
