package com.mhsn.string;

public class StringPermutations {

	
	
	private static void stringPermutaion(String str){
		
		permutation(str,0, "");
		
		
	}
	
	
	private static void permutation(String str, int index, String output){
		
		if(index >= str.length()){
			System.out.println(str);
		}
				
		for(int j = index; j< str.length(); j++){
			
			StringBuffer sb = new StringBuffer(str);
			char ch = str.charAt(index);
			sb.setCharAt(index, str.charAt(j));
			sb.setCharAt(j, ch);
			permutation(sb.toString(), index+1, output);
		}
		
		
	}
	
	public static void main(String[] args) {
		stringPermutaion("ABCDE");
	}
	
	
	
}
