package com.Abstraction.org;

public class PartialAbs2 extends PartialAbs1 {
	
	@Override
	public void district() {
		super.district();
	}
	
	
	@Override
	public void state() {
		super.state();
	}
	

	@Override
	public void country() {
		System.out.println("India");
	}
	
	public static void main(String[] args) {
		PartialAbs2 p= new PartialAbs2 ();
		p.district();
		p.state();
		p.country();
	}

}
