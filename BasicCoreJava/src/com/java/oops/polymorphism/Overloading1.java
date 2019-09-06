package com.java.oops.polymorphism;

public class Overloading1 extends Overriding {
	public void father()
	{
		System.out.println();
		
	}
public static void main(String[] args) {
	Overriding o=new Overriding();
	o.father("selvan");
	System.out.println(o);
	
}
}
