package com.Scanner.org;

import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args) {
		
		Scanner ex = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		int num = ex.nextInt();
		System.out.println("You have enter a number   "+num);
		
		System.out.println("Enter a Name");
		
		String name = ex.next();
		System.out.println("You have Enter a name     " +name);
		
		System.out.println(" Enter a Sentence");
		
		String nextLine = ex.nextLine();
		System.out.println("You have enter a Sentence  "+ nextLine);
	}

}
