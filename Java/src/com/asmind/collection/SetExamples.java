package com.asmind.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExamples {
	
	public static void main(String[] args) {
		
		TreeSet<Integer>s = new TreeSet<>();
		s.add(3534);
		s.add(354);
		s.add(34);
		s.add(349);
		s.add(354);
		s.add(34);
		for (Integer i : s) {
			System.out.println(i);
		}
		//System.out.println(s);
	}

}
