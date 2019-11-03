package com.mhsn.hackerrank;

public class BookCricket {
	
	static int number;
	
	public static void main(String[] args) {
		int n = 6;
		int table[] = new int[]{2,4,6};
		
		for(int i = 0; i< table.length; i++){
			combination(table, n, 0, i);
		}
		System.out.println(number);
		
	}
	
	static void combination(int table[], int n, int currentScore, int index){
		
		currentScore += table[index];
		int temp = n - currentScore;
		if(temp<0){
			return;
		}else if(temp ==0){
			number++;
			return;
		}
		for(int i = 0; i< table.length; i++)
		combination(table, n, currentScore, i);
		
	}
		
}
