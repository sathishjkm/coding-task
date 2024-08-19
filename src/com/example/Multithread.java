package com.example;

public class Multithread {
	public static void main(String args[]) {
		Book book = new Book();;
		Num num = new Num();
		
		book.start();
		num.start();
		System.out.println("Bye");
	}
}

class Book extends Thread{
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("update db");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
	
class Num extends Thread {
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

