//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
//
//For example, given n = 3, a solution set is:
//
//"((()))", "(()())", "(())()", "()(())", "()()()"
// why??????

package com.boyi.leetcode;

import java.util.ArrayList;

public class GenerateParentheses {

	public ArrayList<String> generatepth(int n){
		ArrayList<String> res = new ArrayList<String>();
		generate(n,n,"",res);
		return res;	
	}
	
	public void generate(int left, int right, String str, ArrayList<String> res){
		if (left==0 && right==0){
			res.add(str);
			return;
		}
		
		if (left>0){
			generate(left-1,right,str+'(',res);
			
		}
		if (right>left){
			generate(left,right-1,str+')',res);
			
		}
	}
	
	
	public static void main(String[] args) {
		GenerateParentheses gp = new GenerateParentheses();
		ArrayList<String> res = gp.generatepth(2);
		System.out.println(res);
	}

}
