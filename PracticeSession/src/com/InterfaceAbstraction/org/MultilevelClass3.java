package com.InterfaceAbstraction.org;

public class MultilevelClass3 implements MultilevelInterface2 {

	@Override
	public void laptop(int a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tv() {
		System.out.println("Vu");
	}

	@Override
	public void laptop2() {
		System.out.println("Macbook");
	}

	@Override
	public void mobile2() {
		System.out.println("OnePlus 9pro");
	}

	public static void main(String[] args) {
		MultilevelClass3 x = new MultilevelClass3();
		x.laptop(0);
		x.tv();
		x.laptop2();
		x.mobile2();
	}

	
		
	}

