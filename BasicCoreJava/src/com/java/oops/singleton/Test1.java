package com.java.oops.singleton;

public class Test1 {
	public static void main(String[] args) {
		
		
		SingletonEx s= SingletonEx.getMethod();
		SingletonEx s1= SingletonEx.getMethod();
		SingletonEx s2= SingletonEx.getMethod();
		
		s.name=(s.name.toLowerCase());
		System.out.println(s.name);
		System.out.println(s1.name);
		System.out.println(s2.name);
	}

}
