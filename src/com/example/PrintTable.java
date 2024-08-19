package com.example;

public class PrintTable {
	
	public static void main(String []args) {
		System.out.println("print table form 1 to 10");
		for(int a =1 ;a<=3; a++) {
			for(int i = 1; i<=15; i++) {
				System.out.println(i + "x" +a + "=" + a * i);
			}
		}
	}
}
