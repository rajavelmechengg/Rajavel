package com.PracticeClass.org;

public class ConstructorB extends ConstructorA {
	
	 public ConstructorB() {
		 System.out.println("This is Constrctor Method");

	}
/*	 public void ConstructorA() {
		 System.out.println("Expected Result Not Came");
	} */
	 
	 public static void main(String[] args) {
		ConstructorB a = new ConstructorB();
		//ConstructorB b = new ConstructorB();
		//a.ConstructorA();
		a.method();
	}
	 
	

}

// This Prog Trail and Error Prog dont Confuse