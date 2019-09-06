package com.asminds.polymorphism;

public class Overloading {
	
	public void method( int id, String name) {
		System.out.println(" values "+id+" "+name);
		
	}
	public void method(double salary,String Deparment  ) {
		System.out.println(" values"+salary+" "+Deparment);
	}
public static void main(String[] args) {
	Overloading m=new Overloading();
	m.method(111, "aaa");
	m.method(10000, "EEE");
	System.out.println();
}
}

