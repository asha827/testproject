package com.asminds.oops.multilevelinheritance;

public class Arithmetic4 extends Arithmetic3 {
	public void mod(int a,int b) {
		System.out.println("modules of a%b is "+(a%b));
		
	}
public static void main(String[] args) {
	Arithmetic4 a=new Arithmetic4();
	a.add(9, 9);
	a.sub(10, 20);
	a.mul(6, 6);
	a.div(4, 20);
	a.mod(2, 2);
	
	
}
}
