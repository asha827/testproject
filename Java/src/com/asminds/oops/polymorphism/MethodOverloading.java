package com.asminds.oops.polymorphism;

public class MethodOverloading {
	protected static void method(int a) {
		System.out.println("value is" + a);
	}

	protected static void method(int c, int b) {
		System.out.println("value is  " + (c + b));
	}

	public static void main(String[] args) {
		method(5);
		method(5, 10);
	}

}
