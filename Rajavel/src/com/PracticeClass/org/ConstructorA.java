package com.PracticeClass.org;

public class ConstructorA {
	
	public ConstructorA() {
		int a = 7;
		int b = 11;
		int c = a+b;
		System.out.println("Virat Kohli Jersey Number - " +c);
	}
	
	public ConstructorA(String name) {
		System.out.println("Indian Captain  " +name);
	}
	
	public ConstructorA(int a,int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	public void method() {
		System.out.println("Other Method O/P");
	}
	
	public static void main(String[] args) {
		ConstructorA a = new ConstructorA();
		ConstructorA b = new ConstructorA("King Kohli"); 
		ConstructorA c = new ConstructorA(49,50);
		b.method(); // here a. or b. or c. also output came
	}

}
