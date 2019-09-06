package com.asminds.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class ListExample {
	public static void main(String[] args) {
		
LinkedList<String> a= new LinkedList< String>();
		a.add("kalai");
		a.add("kamali");
		a.add("priya");
		a.add("abi");
		a.add("mithra");
		a.add("kamali");
		a.add("priya");
		a.add("abi");
		a.add("mithra");
		//for (String s : a) {
			 
					//System.out.println(s);
					
				
		//}
		//ListIterator<String> i=a.listIterator();
				//while(i.hasNext()) {
					//System.out.println(i.next());
				//}
		Iterator<String> i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		}
}
	
		
		


		//System.out.println(a);
		
		
		
	



