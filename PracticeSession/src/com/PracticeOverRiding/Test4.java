package com.PracticeOverRiding;

public class Test4 extends Test3 {
	
@Override
public void mobile() {
	//super.mobile();
	System.out.println("ROG 5");
}

@Override
	public void earbuds() {
		//super.earbuds();
		System.out.println("Buds Pro");
	}

 /*public void bike() {
System.out.println("ola electric");
}*/

public static void main(String[] args) {
	// upcasting
	Test4 t = new Test4();
	t.mobile();
	t.earbuds();
	
	t.car();
	//t.bike();
}

}
