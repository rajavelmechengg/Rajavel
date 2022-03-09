package com.PracticeClass.org;

public class FullAbstractionB implements FullAbstractionA {

	@Override
	public void day() {
		System.out.println("Monday");
	}

	@Override
	public void month() {
		System.out.println("December");
	}

	@Override
	public void year() {
		System.out.println("2022");
	}
	
	public static void main(String[] args) {
		FullAbstractionB c = new FullAbstractionB();
		c.day();
		c.month();
		c.year();
	}

}
