package com.mhsn.string;

import java.util.HashSet;
import java.util.Set;

public class StringCombinations {

	
	
	private static void printAllCombinationOfString(String str){
		
		
		Set<Character> s = new HashSet<Character>();
		
		for(int i =0; i<str.length(); i++){
			if(s.add(str.charAt(i))){ // for checking duplicates
				combination(str, i, "");		
			}
		}
		}
	
	
	private static void combination(String str, int index, String output){
		//output = ""   index = 0
		if(index < str.length()){
			output = output + str.charAt(index);
			System.out.println(output);
			for(int i = index; i< str.length(); i++){
				combination(str, i + 1, output);
				}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		printAllCombinationOfString("ABCD");
	}
	
	
	
	
	
	
	
	
	
	
}
