package com.OverRiding.org;

public class TestDrive1 {
	
	public void car() {
		// TODO Auto-generated method stub
    System.out.println("MERCEDES BENZ");
	}
	public void van() {
		// TODO Auto-generated method stub

		System.out.println("Tempo Traveller");
	}
	public static void main(String[] args) {
		TestDrive1 t = new TestDrive2();
		 t.car();
		 t.van();
	}

}
