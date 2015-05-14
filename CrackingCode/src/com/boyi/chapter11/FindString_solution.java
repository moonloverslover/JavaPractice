// no right


package com.boyi.chapter11;

public class FindString_solution {

	public static void main(String[] args) {
	      String[] strs={"at","","","","dog","","","toy"};
	      String[] strsFilled=fillempty(strs);
	      for(String s:strsFilled){
	    	  System.out.println(s);
	      }
	      int index=findStringRecursive(strsFilled,"dog",0,strs.length-1);
	      System.out.println(index);
	}
		
	
	
	public static String[] fillempty(String[] strs){
		
		if (strs[0]==""){
			strs[0]="a";
		}
		
		
		for(int i=1;i<strs.length;i++){
		  if (strs[i]==""){
			  String temp=strs[i-1];
			  strs[i]=temp.charAt(0)+"filled";
		  }
		}
		
		return strs;
		
	}
	public static int findStringRecursive(String[] strs, String x, int low, int high){
		
		if (low>high){
			return -1;
		}
		
		int mid=(low+high)/2;
		String strmid = strs[mid];
		int control=strmid.charAt(0); 
		int target=x.charAt(0);
		if(target>control){
			return findStringRecursive(strs,x,mid+1,high);
		}else if(target<control){
			return findStringRecursive(strs,x,low,mid-1);
		}else{
			return mid;
		}
				
				
		
	}
		
}



