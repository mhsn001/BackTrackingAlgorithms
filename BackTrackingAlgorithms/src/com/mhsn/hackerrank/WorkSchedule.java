package com.mhsn.hackerrank;

public class WorkSchedule {
	static String pattern;
	public static void findSchedule(int weekHours, int dayHours, String workPattern){
		pattern = workPattern;
		int length = 0;
		int sum = 0;
		for(int i = 0; i< workPattern.length(); i++){
			if(workPattern.charAt(i) == '?'){
				length++;
			}else{
				sum += Integer.valueOf(""+workPattern.charAt(i));
			}
		}
		if(sum == weekHours){
			return;
		}	
		//remaining hours
		int remHrs = weekHours - sum;
		for(int a = 0; a <= remHrs; a++){
			int[] arr = new int[length];
			findRemainders(arr, dayHours, remHrs-a, 0, a);
		}
	}
	
	
	public static void findRemainders(int[] arr,int dayHrs, int remHrs, int index, int value){
		
		if(index >= arr.length || value >dayHrs ){
			return;
		}
		
		arr[index] = value;
		if(index == arr.length-1){
			if(remHrs != 0){
				return;
			}else{
				print(arr);
			}
		}
		for(int a = 0; a <= remHrs; a++){
			findRemainders(arr,dayHrs, remHrs - a, index+1, a);
		}
		
	}
	
	public static void print(int[] arr){
		System.out.println();
		for(int i=0, j=0; i<pattern.length(); i++){
			
			if(pattern.charAt(i) == '?'){
				System.out.print(arr[j]);
				j++;
			}else{
				System.out.print(pattern.charAt(i));
			}

		}
	}
	
	
	public static void main(String[] args) {
		
		
		//findSchedule(24, 4, "08??840");
		
		//findSchedule(56, 8, "???8???");
		
		findSchedule(3, 2, "??2??00");
		
		
	}
	
	
}
