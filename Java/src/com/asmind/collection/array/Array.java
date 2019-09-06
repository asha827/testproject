package com.asmind.collection.array;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {
public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList<>();
	a.add(23);
	a.add(25);
	a.add(56);
	a.add(89);
	a.add(23);
	a.add(null);
	a.add(null);
	Iterator<Integer>it=a.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}