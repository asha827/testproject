
package com.asmind.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ArrayListExamples {
	
	public static void main(String[] args) {
		
		Vector<String> list = new Vector<>();
		list.add("Asha");
		list.add("Anand");
		list.add("Sri");
		list.add("Asha");
		list.add("Anand");
		list.add("Sri");
		for (String i : list) {
			System.out.println(i);
			
		}
		
		//System.out.println(list);
		
	}

}
