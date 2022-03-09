package com.PracticeClass.org;

public class Variables1 {

		public static int x = 18;
		 		int y = 14;              //Class Variable
		 		int a = 7;
		 		double q;
	public void method1() {
		//int a = 12;
		int b = 25;					// Local Variables
		int c = a+b+x+y;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Variables1 v = new Variables1();
		v.method1();
		System.out.println((x));
		System.out.println(v.y);
		System.out.println(v.a);
		System.out.println(v.q);
		
	}
	
}
