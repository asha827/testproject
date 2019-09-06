package com.asminds.java.constructor;

public class Customer1 extends Offer{
	private int id;
	private String name;
	private String address;

	public Customer1() {
		System.out.println("constructor");
	}

	public Customer1(int id, String name, String address) {
		super(100);
	
		
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.show();

	}

	public void show() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
