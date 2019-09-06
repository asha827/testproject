package com.asminds.java.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class SetExample {
public static void main(String[] args) {
	
	LinkedHashSet<Integer>h=new LinkedHashSet<Integer>();
	h.add(23);
	h.add(76);
	h.add(89);
	h.add(23);
	h.add(76);
	h.add(89);
	h.add(45);
	Iterator<Integer> l=h.iterator() ;{
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
	}
	//ListIterator<Integer> list=h.listIterator();
	//while(list.hasNext())
	//{
		//System.out.println(list.next());
	//}
	//System.out.println("Previous");
	//System.out.println();
	//while(list.hasPrevious())
	//{
		//System.out.println(list.previous());
	//}
	//for (Integer i : h) {
		//System.out.println(i);
		
	//}
	//System.out.println(h);
	
}
}
