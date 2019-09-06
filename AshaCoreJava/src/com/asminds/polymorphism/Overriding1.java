package com.asminds.polymorphism;

public class Overriding1 extends Overriding{
	public void display(int a,int b) {
		System.out.println("values"+(a+b));
	}
public static void main(String[] args) {
	Overriding1 o=new Overriding1();
	o.display(4, 8);
			
}
}
