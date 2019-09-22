package com.mhsn.string;

import java.util.HashSet;
import java.util.Set;



/*
* Solving N queens problem using 1 D array
* 
* 1 D Array can be represented as 
* 
* index	-  1  2  3  4
* value -  2  4  1  3
* 
* Here index number is representing the row number of 4X4 board 
* And the value at index is the column number.
* 
* Array    4x4 board
* 	2 	--  0 1 0 0
*	4 	-- 	0 0 0 1
*	1 	-- 	1 0 0 0
*	3 	-- 	0 0 3 0
* 
* 
*
*/


public class NQueenProblemUsing1DArray {

	private static void nQueen(int[] arr, int n, int count){
					
		for(int i = 1; i <= n; i++){
				// If not diagonal and if column number is not already exist in the set (that means no other queen should sit on the same column)
				if(isSafePlace(arr, count, i)){
					arr[count] = i;// i represents column number where a queen can sit 
					if(count == n-1) // If all queens are successfully set on the places
					{
						for(int a: arr){
							System.out.print(a +" ");	
						}
						System.out.println();	
					}
					nQueen(arr, n, count+1); // check for next queen place
					// removing column number and from array and set for backtracking 
					arr[count] =0;
				}else if(count == n-1 && i == n){ // if it reaches to the end of the board
					return;
				}
			}
	}
		
	private static boolean isSafePlace(int[] arr, int row, int col){
		int t =0;
		// To check if queens are not sitting diagonally
		// row-t, col+t, col-t where t tends from 0 to n 
		while(row-t > 0){ // while row is greater than 0
			t++;
			// checking for right side diagonal
			if(col+t <=arr.length && arr[row-t] == col+t){
				return false;
				}
			// checking for left side diagonal
			else if(col-t >0 && arr[row-t] == col-t){
				return false;
			}//checking if in the same column
			else if(arr[row-t] == col){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		int n=5;
		nQueen(new int[n], n, 0);
	}
	
	
	
	
}
