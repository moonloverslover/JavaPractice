//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
//determine if the input string is valid.
//
//The brackets must close in the correct order, "()" and "()[]{}" are all valid 
//but "(]" and "([)]" are not. 

//What about "([]){}"

package com.boyi.leetcode;

import java.util.Stack;

public class ValidParentheses {

	public boolean validate(String str){
		
		if (str.charAt(0) == ')' || str.charAt(0) == ']' || str.charAt(0) == '}') {
			return false;
		}
		char[] chars = str.toCharArray();
		
		if (chars.length%2 != 0) {
			return false;
		}
		

		for (int i=0;i<chars.length/2;i++) {
			if (!((chars[2*i]=='[' && chars[2*i+1]==']') ||(chars[2*i]=='(' && chars[2*i+1]==')') ||(chars[2*i]=='{' && chars[2*i+1]=='}'))) {
				return false;
			}
		    
		}
				
		return true;
	}
	
	public boolean validate_solution (String str) {
		Stack<Character> st = new Stack<Character>();
		st.push(str.charAt(0));
		
		for (int i=1;i<str.length();i++) {
			if ( !st.empty() && isMatch(st.peek(), str.charAt(i)) ) {
				st.pop();
			}else{
				st.push(str.charAt(i));
			}
			//System.out.println(st);	
		}
		
		if (st.empty()){
			return true;
		}
		
		return false;	
	}
	
	public boolean isMatch(Character a, Character b) {
		
		if (   (a=='{'&&b=='}') ||  (a=='['&&b==']') || (a=='('&&b==')')  ) {
			return true;	
		}
		return false;
	
	}
	
	
	public static void main(String[] args) {
		ValidParentheses vp = new ValidParentheses();
		System.out.println(vp.validate("([]){}"));
		System.out.println(vp.validate_solution("([]){}"));
	}

}
