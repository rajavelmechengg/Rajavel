package com.PracticeClass.org;

public class ConstructorB2 extends ConstructorA {
	
	 public ConstructorB2() {
		 System.out.println("This is Constrctor Method");

	}
	 public void ConstructorA() {
		 System.out.println("Expected Result Not Came");
	}
	 
	 public static void main(String[] args) {
		ConstructorB2 a = new ConstructorB2();
		//ConstructorB b = new ConstructorB();
		a.ConstructorA();
		a.method();
	}
	 
	

}

// This Prog Trail and Error Prog dont Confuse