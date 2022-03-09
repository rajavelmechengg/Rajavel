package com.PracticeClass.org;

public class This_SuperKW1 extends This_SuperKW2 {
	
	int x = 3;
	
	public void task() {
		int x = 99;
	System.out.println(x);	
	System.out.println(this.x);
//	System.out.println(super.x);
// super Keyword is possible only when the parent class is inherited in the child class . 
		
	}
	public static void main(String[] args) {
		This_SuperKW1 t = new This_SuperKW1();
		t.task();
		System.out.println(t.x);
		System.out.println(t.j);
	}

}
