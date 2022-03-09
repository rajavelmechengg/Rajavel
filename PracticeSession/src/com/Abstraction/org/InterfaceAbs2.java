package com.Abstraction.org;

public class InterfaceAbs2 implements InterfaceAbs1 {

	@Override
	public void institute() {
		System.out.println("Greens Technology");
	}

	@Override
	public void location() {
		System.out.println("Chennai");
	}

	@Override
	public void course() {
		System.out.println("Software Testing");
	}
	
	public static void main(String[] args) {
		InterfaceAbs2 i = new InterfaceAbs2 ();
		i.institute();
		i.location();
		i.course();
	}

}
