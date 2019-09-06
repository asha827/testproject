package com.java.oops.abstraction;

public class Addition1 implements Addition,Addition2{

	@Override
	public void sum(int a, int b) {
		System.out.println("values"+" "+(a+b));
		// TODO Auto-generated method stub
		
	}
public static void main(String[] args) {
	Addition1 a=new Addition1();
	a.sum(4, 3);
	a.mul(4, 4);
}
@Override
public void mul(int c, int d) {
	System.out.println("values"+" "+(c*d));
	
	
	// TODO Auto-generated method stub
	
}
	
}


