package com.pojo.org;

public class PojoB {
public static void main(String[] args) {
	
	PojoA a = new PojoA();
	a.setA(10);
	
	int a2 = a.getA();
	System.out.println(a2);
}
}
