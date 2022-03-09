package com.BasicCalulation.gtec;

public class MultiCalculations {
public void add() {
	// TODO Auto-generated method stub

	int a = 9;
	int b = 9;
	int c = (a+b);
	System.out.println(c);
}
public void sub() {
	// TODO Auto-generated method stub

	int a = 38;
	int b = 10;
	int c = (a-b);
	System.out.println(c);
}
public void mul() {
	// TODO Auto-generated method stub

	int a = 19;
	int b = 2;
	int c = (a*b);
	System.out.println(c);
}
public void div() {
	// TODO Auto-generated method stub

	int a = 96;
	int b = 2;
	int c = (a/b);
	System.out.println(c);
}
public static void main(String[] args) {
	MultiCalculations x = new MultiCalculations();
	x.add();
	x.sub();
	x.mul();
	x.div();
}
}

