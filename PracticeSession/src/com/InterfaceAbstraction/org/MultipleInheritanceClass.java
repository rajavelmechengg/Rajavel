 package com.InterfaceAbstraction.org;

public class MultipleInheritanceClass implements MultipleParentA , MultipleParentB  {

	@Override
	public void village() {
		System.out.println("Dharapuram_Naillimadam");
	}

	@Override
	public void city() {
		System.out.println("Karur");
	}

	@Override
	public void livingcity() {
		System.out.println("Chennai");
	}

	@Override
	public void mobilename() {
		System.out.println("Asus Zenfone 5z");
	}

	@Override
	public void bikename() {
		System.out.println("M80");
	}

	@Override
	public void carname() {
		System.out.println("Ertiga");
	}
	
	public static void main(String[] args) {
		MultipleInheritanceClass m = new MultipleInheritanceClass();
		m.village();
		m.city();
		m.livingcity();
		m.mobilename();
		m.bikename();
		m.carname();
	}

}
