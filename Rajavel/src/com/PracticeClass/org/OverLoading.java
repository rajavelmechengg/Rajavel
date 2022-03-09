package com.PracticeClass.org;

public class OverLoading {

	public void overload() {
	int a = 11;
	int b = 22;
	int c = 33;
	int d =  a+b+c;
	System.out.println(d);
	}
	
	public void overload(int a) {
	int b = 44;
	int c = 55;
	int d = a+b+c;
	System.out.println(d);
	}
	
	public void overload(int a,int b) {
	int c = 66;
	int d = a+b+c;
	System.out.println(d);
	}
	
	public void overload (float number) {
	System.out.println("Polymorphism_ Over Loading  " +  number );
	}
	
	public static void main(String[] args) {
	OverLoading x = new OverLoading();
	x.overload();
	x.overload(77);
	x.overload(88,99);
	x.overload(55.555f);
	}
}
