package com.PracticeClass.org;

public class SingleInheritance2 extends SingleInheritance {
	
	public void institutename() {
		System.out.println("Greens Technology");
	}
	
	public void city() {
		System.out.println("Chennai");
	}
	
	public static void main(String[] args) {
		SingleInheritance2 s = new SingleInheritance2();
		s.institutename();
		s.city();
		s.add();
		s.sub();
	}

}
