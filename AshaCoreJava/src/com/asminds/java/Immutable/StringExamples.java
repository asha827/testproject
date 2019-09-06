package com.asminds.java.Immutable;

public final class StringExamples {

	
	private final int id;
	private final String name;
	
	public StringExamples(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "StringExamples [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	

	
}
