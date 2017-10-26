package com.java.interview;

public class ReverseString {
	
	public static void main(String args[]){
		
		System.out.println( new ReverseString().returnReverse("Sameer"));
	}
 public String returnReverse(String input){
	 StringBuilder str = new StringBuilder();
	 for (int i = input.length()-1 ; i>=0; i--){
		 //System.out.println(i);
		 char a = input.charAt(i);
		 str.append(a);
		
		 
	 }
	 return str.toString();
	 
 }
}
