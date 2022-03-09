package com.PracticeClass.org;

public class PartialAbstractionB extends PartialAbstractionA {

	@Override
	public void test3() {
		System.out.println("Hard Work Never Fails");
	}
	
	@Override
	public void test2() {
		super.test2();
	}
	
	@Override
	public void test1() {
		super.test1();
	}
	
	public static void main(String[] args) {
		PartialAbstractionB x = new PartialAbstractionB();
		x.test1();
		x.test2();
		x.test3();
	}

}
