package com.boyi.chapter11;

public class FindString_solution_2 {

	public static void main(String[] args) {
	      String[] strs={"at","","","","","dog","","toy"};
	      
	      int index=findStringRecursive(strs,"dog",0,strs.length-1);
	      System.out.println(index);
	}
		
	public static int findStringRecursive(String[] strs, String x, int low, int high){
		
		if (low>high){
			return -1;
		}
		
		int mid=(low+high)/2;
		
		
		if(strs[mid].isEmpty()){
			int left=mid-1;
			int right=mid+1;
			while(true){
			  if(left<low && right>high){
				  return -1;
			  }else if(right<=high && !strs[right].isEmpty()){
				  mid = right;
				  break;
			  }else if(left>=low && !strs[left].isEmpty()){
				  mid = left;
				  break;
			  }
			  
			  right++;
			  left--;
			
			}  
		}
		
		
		if(x.equals(strs[mid])){
			return mid;
		}else if(x.compareTo(strs[mid])>0){
			return findStringRecursive(strs,x,mid+1,high);
		}else{
			return findStringRecursive(strs,x,low,mid-1);
		}
				
				
		
	}
		
}