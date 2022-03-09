package com.PracticeClass.org;

public class SingleInheritance {

	public void add() {

		int a = 50;
		int b= 100;
		int c = a+b;
		System.out.println(c);
	}

	public void sub() {

		int u = 500;
		int v = 75;
		int w = u-v;
		System.out.println(w);
	}
	
	public static void main(String[] args) {
		SingleInheritance2 i = new SingleInheritance2(); //Up Casting
		i.add();
		i.sub();
		i.city();
		i.institutename();
	}
}
