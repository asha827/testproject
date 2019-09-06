package com.asminds.constuctor;

public class Employee extends Hr {
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		super();
		System.out.println("constructor");
	}

	public Employee(int id, String name, double salary) {
		super(100);
		super.setHike(111);
		
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.demo();
	}
	public void demo() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
