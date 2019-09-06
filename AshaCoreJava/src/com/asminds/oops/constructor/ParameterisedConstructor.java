package com.asminds.oops.constructor;

public class ParameterisedConstructor {
	int id;
	String name;
	String designation;
	public ParameterisedConstructor(int id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	void show() {
		System.out.println(id+" "+name+" "+designation);
	}
	
}
