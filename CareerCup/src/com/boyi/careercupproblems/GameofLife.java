//How would you structure the game of life (classes, functions etc...)? How would you structure the board if it was played on a sphere?

package com.boyi.careercupproblems;

public class GameofLife {
	
	Integer[][] board;
	static int row;
	static int col;
	
	
	
	public GameofLife(Integer[][] seed){
		
		row = seed.length;
		col = seed[0].length;
		
		board = new Integer[row][col];
		
		board = seed;
		
	}
	
	
	public void evolveonestep(){
		
		Integer[][] boardnew = new Integer[row][col];
		boardnew = board;
		
		for (int i=1;i<row-1;i++){
			for (int j=1;j<col-1;j++){
			
		    boardnew[i][j] = flip(i,j,board);	
				
				
			}		
		}
		
		board = boardnew;
	}
	
	
	public int flip(int i,int j, Integer[][] board){
		
		int temp1=board[i-1][j-1];
		int temp2=board[i-1][j];
		int temp3=board[i-1][j+1];
		int temp4=board[i][j-1];
		int temp5=board[i][j+1];
		int temp6=board[i+1][j-1];
		int temp7=board[i+1][j];
		int temp8=board[i+1][j+1];
		
		int condition = temp1+temp2+temp3+temp4+temp5+temp6+temp7+temp8;
        int returnvalue=0;
        int state =board[i][j];
        
        if (state==1){
        	switch (condition) {
    		case 0:  returnvalue=0; break;  
    		case 1:  returnvalue=0; break;
    		case 2:  returnvalue=1; break;
    		case 3:  returnvalue=1; break;
    		case 4:  returnvalue=0; break;
    		case 5:  returnvalue=0; break;
    		case 6:  returnvalue=0; break;
    		case 7:  returnvalue=0; break;
    		case 8:  returnvalue=0; break;
    		}
        }else{
        	switch (condition) {
    		case 0:  returnvalue=0; break;  
    		case 1:  returnvalue=0; break;
    		case 2:  returnvalue=0; break;
    		case 3:  returnvalue=1; break;
    		case 4:  returnvalue=0; break;
    		case 5:  returnvalue=0; break;
    		case 6:  returnvalue=0; break;
    		case 7:  returnvalue=0; break;
    		case 8:  returnvalue=0; break;
    		}
        }
		
		return returnvalue;
	}
	
	
	
	
	
	

	public static void main(String[] args) {
      Integer[][] seed = {{0,0,0,0,0},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,0},{0,0,0,0,0}};
      GameofLife gl = new GameofLife(seed);
      int steps=1;
      int i=0;
      while (i<steps) {
    	  gl.evolveonestep();
    	  i++;
      }
      
      for (i=0;i<row;i++){
			for (int j=0;j<col;j++){
			System.out.print(gl.board[i][j]);
			}		
			System.out.print("\n");
	  }
	
	}
}
