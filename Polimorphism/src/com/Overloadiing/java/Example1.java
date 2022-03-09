package com.Overloadiing.java;

public class Example1 {
public void add() {
	// TODO Auto-generated method stub

	int a = 5;
	int b = 10;
	int c = (a+b);
	System.out.println("First Method Console "+c);
}
public void add(int a) {
	int b = 50;
	int c = a+b;
	System.out.println("Second Method Console "+c);
	
}
public void add (int a,int b) {
	int c = a+b;
	System.out.println("Third Method Console  "+c);
}
public static void main(String[] args) {
	Example1 x =new Example1();
	x.add();
	x.add(100);
	x.add(200,300);
}
}

