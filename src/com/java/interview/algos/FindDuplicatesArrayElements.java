package com.java.interview.algos;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] intArr = {1,2,3,6,78,21,4,5};

System.out.println(findIfArrayHasDuplicates(intArr));


}
	
	//complexity is N*N
	public static boolean findIfArrayHasDuplicates(int[] array){
	
		
		int[] newArr = new int[array.length];
		List<Integer> intList = new ArrayList<Integer>();
		
		for (int var: array){
			if(intList.contains(var)){
				return true;
			}else{
				intList.add(var);
			}
		}
		return false;
	}	
}
