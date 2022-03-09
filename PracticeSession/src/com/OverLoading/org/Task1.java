package com.OverLoading.org;

public class Task1 {
	public void number() {

		int u = 25;
		int v = 75;
		int w = u+v;
		System.out.println("First o/p  "+w);
	}

	 public void number (int u) {
		 
		 int v= 125;
		 int w= u+v;
		 System.out.println("Second o/p  "+w);
	 }
	  
	 public void number (int u,int v) {
		 
		 int w = u+v;
		 System.out.println("Third o/p  "+w);
	 }
	 public static void main(String[] args) {
		Task1 t = new Task1();
		t.number();
		t.number(175);
		t.number(100, 200);
	}
}
