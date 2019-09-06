package com.java.collection;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		
		
		
		LinkedList<Student1> l = new LinkedList<>();
		Student1 s = new Student1(111, "asha", 89);
		
l.add(s);
		l.add(new Student1(222, "abi", 90));
		l.add(new Student1(333, "loga", 70));
		l.add(new Student1(444, "priya", 88));
		for (Student1 f : l) {
			System.out.print(f.getId());
			System.out.println(f.getName());
			System.out.println(f.getMarks());

		}
	}

}
