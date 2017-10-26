package com.java.interview;

import java.util.Random;

public class RandomUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		for(int i =0; i<20; i++){
			System.out.println(r.ints(90, 100).iterator().nextInt());
		}
		
	}

}
