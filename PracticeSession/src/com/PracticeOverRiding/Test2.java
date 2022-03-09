package com.PracticeOverRiding;

public class Test2 extends Test1 {
	
	@Override
	public void add() {
		super.add();
		int a= 50;
		int b=100;
		int c=a+b;
		System.out.println("Second o/p "+c);
	}
	public static void main(String[] args) {
		Test2 t = new Test2 ();
		t.add();
	}

}
