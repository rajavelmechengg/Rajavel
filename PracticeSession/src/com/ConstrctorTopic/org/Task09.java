package com.ConstrctorTopic.org;

public class Task09 {
	
	int a;
	// Classname and All the Method names are Same.
	
	
public Task09() {
  //int a=25;
	a = 25;
   System.out.println(a);
}

//The above method name is Non-parameterised/default Constructor.
//The below method name is Parameterised Constructor.

public Task09(String coursename) {
System.out.println("Java Selenium For "+ coursename);
}

public Task09(int durationmonths) {
System.out.println("Month Of Duration Is " + durationmonths);
}
public static void main(String[] args) {
	Task09 a  = new Task09();
	Task09 a1 = new Task09("Automation Testing");
	Task09 a2 = new Task09(2);
	System.out.println(a.a);
	
}
}
