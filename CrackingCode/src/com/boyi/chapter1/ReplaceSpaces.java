package com.boyi.chapter1;

public class ReplaceSpaces {

	public static void main(String[] args) {
      String a = " df jd   gkm ";
      System.out.print(replace(a));
	}

	public static String replace(String st){
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<st.length();i++){
			int val = st.charAt(i);
			
			if (val==32){
				sb.append("%20");
			}else{
				sb.append(st.charAt(i));
			}
		}
		
		return sb.toString();
		
	}
	
}


// space=32