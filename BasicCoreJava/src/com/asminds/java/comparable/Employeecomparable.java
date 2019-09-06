package com.asminds.java.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Employeecomparable {
	
	
public static void main(String[] args) {
 
	ArrayList<Employee>a=new ArrayList<>();
	a.add(new Employee("priya", 3, 111));
	a.add(new Employee("kavi",2, 88));
	a.add(new Employee("aa", 1, 9));
	Collections.sort(a);
	
	for(Employee s:a) {
		System.out.println(s);
	}
	
}
}
