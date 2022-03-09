package com.Abstraction.org;

public class PartialClassImplement extends PartialAbstraction {

	@Override
	public void school() {
		super.school();
		//System.out.println("C.S.I");
	}
	
	@Override
	public void college() {
		super.college();
	}
	
	@Override
	public void company() {
		System.out.println("Nordex India PVT LTD");
	}
	
	public static void main(String[] args) {
		PartialClassImplement p = new PartialClassImplement ();
		p.school();
		p.college();
		p.company();
	}

	
}
