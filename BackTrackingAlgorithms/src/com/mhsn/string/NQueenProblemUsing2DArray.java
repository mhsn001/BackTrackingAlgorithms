package com.mhsn.string;

public class NQueenProblemUsing2DArray {

	
	
	private static boolean nQueen(int[][] board,int n, int row, int[] arr){
		
		
		if(row >= n){
			return true;
		}
		for(int i =0; i< n; i++){
			
			int col = i;
			int r = row;
			int t =0;
			boolean isDiagonal = false;
			
			while(r-t >= 0)
			{
				//System.out.println("r : "+r +" :: "+"t : "+t +" :: "+"col : "+col);
				if(col-t >=0 && board[r-t][col -t] == 1){
					isDiagonal = true;
					break;
				}
				
				if(col+t < n && board[r-t][col +t] == 1){
					isDiagonal = true;
					break;
				}
				
				if(board[r-t][col] == 1){
					isDiagonal = true;
					break;
				}
				t++;				
			}
			
			
			if(!isDiagonal){
				board[row][i] = 1;
				arr[row] = i+1;
				if(nQueen(board, n, row+1, arr)){
					
					for(int a : arr){
						System.out.print(" "+a);
					}
					System.out.println();
					
					//return true;
				}
				board[row][i] =0;
				arr[row] = 0;
				
			}
			
			
		}
		
		
		
		
		return false;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	
	int n =8;	
	nQueen(new int[n][n], n, 0, new int[n]);
		
	}	
	
}
