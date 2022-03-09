package com.Array.org;

public class ArrayEx1 {
	public static void main(String[] args) {
		int [] a = new int [5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		
		System.out.println(a[3]);
		
		
		int length = a.length;
		System.out.println(length);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(i+" ");
			}
			
			System.out.println();
			
		}
		
	}

}
