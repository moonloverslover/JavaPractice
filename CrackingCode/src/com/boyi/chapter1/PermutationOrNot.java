package com.boyi.chapter1;

public class PermutationOrNot {

	public static void main(String[] args) {
      String a1="cons  ole";
      String a2="celsono";
      String sorted1=bubblesort(a1);
	  System.out.print(sorted1+"\n");
      String sorted2=bubblesort(a2);
	  System.out.print(sorted2+"\n");

      if (sorted1.equals(sorted2)){
    	  System.out.print("yes");
      }else{
    	  System.out.print("no");
      }
	}

	
	
	public static String bubblesort(String st){
		
		char[] chars = st.toCharArray();

		for(int i=0;i<chars.length-1;i++){
			
			for (int j=0;j<chars.length-i-1;j++){
				int left = chars[j]; // convert char to int directly
				int right = chars[j+1];
				if (left>right) {
					Character temp = chars[j];
					chars[j]=chars[j+1];
					chars[j+1]=temp;
				}
			}
			
		}
	return new String(chars);	
	}
}
