package com.asminds.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparableExample {
public static void main(String[] args) {
	
	
	ArrayList<StudentExample> a=new ArrayList<>();
	a.add(new StudentExample(01, "aaa"));
	a.add(new StudentExample(02, "sss"));
	Collections.sort(a);
	for (StudentExample o:a) {
		System.out.println(o);
	}
}
}
