package com.PracticeOverRiding;

public class Test1 {
public void add() {

	int a =5;
	int b= 10;
	int c = a+b;
	System.out.println("First o/p " + c);
}
public static void main(String[] args) {
	Test1 t= new Test2();
	t.add();
}
}
