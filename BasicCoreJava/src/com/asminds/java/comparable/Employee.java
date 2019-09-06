package com.asminds.java.comparable;

public class Employee  implements Comparable<Employee>{

	String name;
	int age;
	int id;
	
	public Employee(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

	@Override
	public int compareTo(Employee s) {
		
		/*if(age==s.age)
			
		return 0;
		else if(age>s.age)
			return +1;
		
		else
			return -1;
*/
		return name.compareTo(s.name);

	}
	
}
