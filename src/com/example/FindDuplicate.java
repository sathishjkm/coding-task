package com.example;

import java.util.HashSet;

public class FindDuplicate {

	public static void main(String args[]) {
		
		int[] array = {1,2,3,4,5,2,5,8,1};
		findDuplicate(array);
	}

	private static void findDuplicate(int[] array) {
		HashSet<Integer> count = new HashSet<Integer>();
		HashSet<Integer> dublicates = new HashSet<Integer>();
		for(int num : array) {
			if(!count.add(num)) {
				dublicates.add(num);
			}
		}
		System.out.println(dublicates);		
	}
}
