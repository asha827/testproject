package com.asminds.oops.polymorphism;

public class Overloading {
	
	public void add(int a) {
		System.out.println("One arg method"+a);
	}
	
	public void add(int b,int c) {
		System.out.println("two arg "+(b+c));
	}
	
	public  void add(String s) {
		System.out.println(s);	
	}
	
	public static void main(String[] args) {
		
		Overloading overloading= new Overloading();
		overloading.add(110);
		overloading.add(12, 30);
		overloading.add("aaa");
		
		
	}
	
}
