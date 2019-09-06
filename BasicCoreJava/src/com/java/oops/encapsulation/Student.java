package com.java.oops.encapsulation;

public class Student {
	
	public int id;
	private String name;
	protected String address;
	long number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", number=" + number + "]";
	}
	
	public static void main(String[] args) {
		Student s= new Student();
		s.id=111;
		s.address="asgli";
		s.number=1267895444;
		System.out.println(s);
				
	
		
	}
	

}
