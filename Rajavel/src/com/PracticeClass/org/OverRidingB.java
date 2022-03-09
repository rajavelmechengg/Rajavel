package com.PracticeClass.org;

public class OverRidingB extends OverRidingA {

@Override
	public void method1() {
		super.method1();
}	

@Override 
	public void method2() {
		super.method2();
	}

@Override
	public void method3() {
		super.method3();
	}

@Override
	public void method4() {
		super.method4();
	}

public static void main(String[] args) {
	OverRidingB a = new OverRidingB();
	a.method1();
	a.method2();
	a.method3();
	a.method4();
}


}


