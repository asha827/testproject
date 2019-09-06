package com.java.oops.singleton;

public class SingletonEx {
	public static SingletonEx obj = null;
	public String name;

	private SingletonEx() {
		name = "JAVA PROGRAM";
	}

	public static SingletonEx getMethod() {
		if (obj == null) {
			obj = new SingletonEx();
		}
		return obj;
	}

	public void display() {
		System.out.println(name);
	}
}
