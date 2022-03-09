package com.PracticeClass.org;

public class Overloading11 extends OverLoading {
	
	@Override
	public void overload() {
		super.overload();
	}
	
	@Override
	public void overload(float number) {
		super.overload(number);
	}

	public static void main(String[] args) {
		Overloading11 a = new Overloading11();
		a.overload();
		a.overload(44.77f);
		
	}
}
