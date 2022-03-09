package com.OverRiding.org;

public class TestDrive2 extends TestDrive1 {
	 @Override
	public void car() {
		// TODO Auto-generated method stub
		super.car();
		System.out.println("BMW");
	}
	 @Override
	public void van() {
		// TODO Auto-generated method stub
		super.van();
		System.out.println("Audi");
	}
	 public static void main(String[] args) {
		TestDrive2 t= new TestDrive2();
		t.car();
		t.van();
		
	}
}
