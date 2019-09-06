package com.asminds.java.constructor;

public class Offer {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
public Offer()
{
	System.out.println("im a default constructor");
}

public Offer(int price) {
	super();
	this.price = price;
	System.out.println("one argu cons");
}
public void test() {
	System.out.println("super method");
}



}
