package com.PracticeClass.org;

public class Array_CntrlStatement {
	
	public static void main(String[] args) {
		
	
	int [] a = new int [10];
	a[0] = 11;
	a[2] = 22;
	a[3] = 33;
	a[4] = 44;
	a[5] = 55;
	a[6] = 66;
	a[7] = 77;
	a[8] = 88;
	a[9] = 99;
	//a[10] = 101;
	
	System.out.println(a[3]);
	
	int length = a.length;
	System.out.println(length);
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		
		
		if (i==3) {
			//break;
			//continue;
		}
		
	}
	
	
}
}