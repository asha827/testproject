package com.java.oops.abstraction;

public class Shapes1 extends Shapes {

	@Override
	public void circle() {
		System.out.println("circle");
		// TODO Auto-generated method stub
		
	}
public static void main(String[] args) {
	
	Shapes1 s=new Shapes1();
			s.circle();
			s.rectangle();
			{
				System.out.println(s);
			}
	
	
}
}
