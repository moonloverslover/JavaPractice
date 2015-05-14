package com.boyi.chapter4;

public class CheckBST {
	
  public Integer last_printed = null;
  
  public boolean isBST(Node n) {
	  if (n == null) {
		  return true;
	  }
	  
	  if (!isBST(n.left)) {
		  return false;  
	  }
	  
	  if (last_printed != null && n.data <= last_printed) {
		  return false;
	  }
	  last_printed = n.data;
	  
	  if(!isBST(n.right)) {
		  return false;
	  }
	  
	  return true;	  
  }
  
  public boolean isBST_2(Node n, Integer min, Integer max) {
	  
	  if (n == null) {
		  return true;
	  }
	  
	  if ( (min!=null && n.data < min) || (max!=null && n.data > max))  {
		  return false;
	  }
	  
	  if ( (!isBST_2(n.left,min,n.data)) || (!isBST_2(n.right,n.data,max))) {
		  return false;  
	  }
	  
	  return true; 
  }

}
