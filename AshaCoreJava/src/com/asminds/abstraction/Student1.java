package com.asminds.abstraction;

public class Student1 extends Student {
	//int id;
	//String name;
	//String department;

	@Override
	public void details(int id, String name, String department) {

		System.out.println(id + " " + name + " " + department);
	}

	public static void main(String[] args) {
		Student1 s = new Student1();
		s.details(1, "kumar", "IT");
		s.show();

	}
}
