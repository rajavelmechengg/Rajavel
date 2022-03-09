package com.ConstrctorTopic.org;

public class Constructor {
public Constructor() {
System.out.println("Welcome 2022");
}
public Constructor (String bikename) {
System.out.println("My Bike Name Is " + bikename);
}
public Constructor (int bikecc) {
	System.out.println( bikecc);
}
public static void main(String[] args) {
	Constructor a  = new Constructor();
	Constructor a1 = new Constructor("Gixer");
	Constructor a2 = new Constructor (155);
}
}
