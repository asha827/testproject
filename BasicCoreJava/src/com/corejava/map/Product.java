package com.corejava.map;

public class Product {
	String  name;
	int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	

}
