package com.Abstraction.org;

public  class Interface_FullyAbstraction implements Interface_Fullyabs  {

	@Override
	public void mobile() {
		System.out.println("One Plus 9pro");
		//System.out.println("Iphone 13");
	}

	@Override
	public void bike() {
		System.out.println("Ola Electric Bike");
	}

	@Override
	public void car() {
		System.out.println("Fortuner");
	}
	
	public static void main(String[] args) {
		Interface_FullyAbstraction i = new Interface_FullyAbstraction ();
		i.mobile();
		i.bike();
		i.car();
	}

}
