package com.boyi.chapter1;

public class ReplaceSpaces_solution {

	public static void main(String[] args) {
		String a = " d fjd gkm ";
		int length= a.length();
		int spacecounts=0;
		char[] chars = a.toCharArray();
		for(int i=0;i<length;i++){
			if (chars[i]==' '){
			  spacecounts++;	
			}
		}
		
		int newlength =length+2*spacecounts;
		
		char[] charsnew = new char[newlength];
		
		//chars[newlength]='\0';  WTF
		
		for(int i=length-1;i>=0;i--){
			
			if(chars[i]==' '){
				charsnew[newlength-1]='0';
				charsnew[newlength-2]='2';
				charsnew[newlength-3]='%';
				
				newlength=newlength-3;

			}else{
				
				charsnew[newlength-1]=chars[i];
				newlength=newlength-1;

			};
			
		}
		
		System.out.print(new String(charsnew));
	}

	
	
}
