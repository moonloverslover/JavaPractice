//Write a program to shuffle a deck of 52 cards and shuffle them equally to 4 players


package com.boyi.careercupproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ShuffleCardsToFour {
	
	public static void shuffleluck(ArrayList<String> allcards){
  
		ArrayList<String> cards1 = new ArrayList<String>();
		ArrayList<String> cards2 = new ArrayList<String>();
		ArrayList<String> cards3 = new ArrayList<String>();
		ArrayList<String> cards4 = new ArrayList<String>();

		
		for (int i=0;i<allcards.size();i++) {
			String nowcard=allcards.get(i);
			
			if (!cards1.contains(nowcard)) {
				cards1.add(nowcard);
			}else if (!cards2.contains(nowcard)) {
				cards2.add(nowcard);
			}else if (!cards3.contains(nowcard)) {
				cards3.add(nowcard);
			}else {
				cards4.add(nowcard);
			}	
			
		}
		
		System.out.print(cards1+"\n");
		System.out.print(cards2+"\n");
		System.out.print(cards3+"\n");
		System.out.print(cards4+"\n");

	}
	

	public static void main(String[] args) {
		
		ArrayList<String> cards = new ArrayList<String>(Arrays.asList("DEUCE", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING", "ACE"));
		ArrayList<String> allcards = new ArrayList<String>();
		allcards.addAll(cards);
        allcards.addAll(cards);
		allcards.addAll(cards);
		allcards.addAll(cards);
		
		Collections.shuffle(allcards);
		
		shuffleluck(allcards);	

	}

}
