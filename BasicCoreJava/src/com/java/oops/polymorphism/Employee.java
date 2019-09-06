package com.java.oops.polymorphism;

public class Employee {
	public void details(int id, String name) {
		System.out.println("empolyee details"+" " +id+" " +name);
	}

	public void details(String address, long number) {
		System.out.println("employee details"+" "+address+" " +number);
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.details(111, "anbu");
		emp.details("byepass road", 123456789);
		System.out.println(emp);
	}

}
