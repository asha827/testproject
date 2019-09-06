package com.asminds.encapsulation;

public class employeeDemo {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(111);
		e.setName("aaa");
		e.setSalary(1000);
		e.setDesignation("manager");;
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getDesignation());
		
		
	}

}
