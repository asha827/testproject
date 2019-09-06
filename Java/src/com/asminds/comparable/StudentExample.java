package com.asminds.comparable;

public class StudentExample implements Comparable<StudentExample> {
	int id;
	String name;
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
	@Override
	public String toString() {
		return "StudentExample [id=" + id + ", name=" + name + "]";
	}
	public StudentExample(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(StudentExample o) {
		
		return name.compareTo(o.name);
		
		
		// TODO Auto-generated method stub
	}
	

}
