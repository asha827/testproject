package com.asminds.java.Immutable;

import com.asminds.java.string.StringExample;

public class TestClass extends StringExample{
	public static void main(String[] args) {
		StringExamples e = new StringExamples(123, "Asha");
		System.out.println(e.getId());
		System.out.println(e.getName());
	}

}
