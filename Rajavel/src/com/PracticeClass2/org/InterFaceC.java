package com.PracticeClass2.org;

public class InterFaceC implements InterFaceA, InterFaceB {

	@Override
	public void methodA(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}

	@Override
	public void methodB(int a, int b) {
		
	}

	@Override
	public void task1(int a, int b) {
		
	}

	@Override
	public void task2(int a, int b, int c) {
		
	}
	
	public static void main(String[] args) {
		InterFaceC i = new InterFaceC();
		i.methodA(25,50);
	}

}
