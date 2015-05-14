//Print below series in java 
//*** 1*** 
//**2 *2** 
//*3*3*3* 
//4*4*4*4

package com.boyi.careercupproblems;

public class PrintSeries {
	
    public static void printseries(int nrow, int ncol) {
    	
    	for (int i=0;i<nrow;i++) {
    		
    		String[] temp = new String[ncol];
   
    		
    		for (int j=0;j<ncol;j++){
    			temp[j]="*";
    		}
    		
    		if ((i+1)%2==1) {
        		for (int j=(ncol-1)/2-i;j<=(ncol-1)/2+i;j=j+2) {
        			temp[j]=String.valueOf(i+1);
        		}

    		}else{
    			for (int j=(ncol-1)/2-i;j<=(ncol-1)/2+i;j=j+2) {
        			temp[j]=String.valueOf(i+1);
        		}
    			
    		}
    		
    		for(int j=0;j<ncol;j++){
    		System.out.print(temp[j]);
    		}
    		
    		System.out.print("\n");
    		
    	}
    }


	public static void main(String[] args) {
		int nrow=6;
		int ncol=11;
        printseries(nrow,ncol);
	}

}
