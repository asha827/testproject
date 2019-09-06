package com.asminds.constuctor;

public class Hr {
	private int hike;

	public int getHike() {
		return hike;
	}

	public void setHike(int hike) {
		this.hike = hike;
	}

public  Hr() {
	System.out.println("im a default superclass constructor");
}

	public Hr(int hike) {
		super();
		this.hike = hike;
		System.out.println("one arugment constructor "+hike);
	}

	public void test() {
		System.out.println("im a super class test method");
	}
}
