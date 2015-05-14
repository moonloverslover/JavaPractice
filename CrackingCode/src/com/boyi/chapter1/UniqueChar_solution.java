package com.boyi.chapter1;



public class UniqueChar_solution {

	public static void main(String[] args) {
		String st = "cuhsafiuu";
		boolean output = check(st);
        System.out.print(output);
	}

	
	public static boolean check(String st){
	
		if (st.length()>256){
			return false;
		}
		boolean[] checker = new boolean[256];  //default is false
		//System.out.println(char_set[0]);
		for(int i=0;i<st.length();i++){
		  int value = st.charAt(i);
		  if (checker[value]){
			  return false;
		  }
		  checker[value]=true;	
		}
		
		return true;
	}

}


//a-z: 97-122
//p|=2 WTF????????
//(1<<val)=2^val