package com.PracticeClass.org;

public class This_SuperKW2 {
	
	int j = 7;
	
	public void task2() {
		int x = 88;
		System.out.println(x);
		System.out.println(this.j);
	}
	public static void main(String[] args) {
		This_SuperKW2 t = new This_SuperKW2();
		t.task2();
		System.out.println(t.j);
	}

}
