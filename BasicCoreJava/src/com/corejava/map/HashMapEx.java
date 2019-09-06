package com.corejava.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEx {
	
	public static void main(String[] args) {
		
		LinkedHashMap<Costomer, Product>h=new LinkedHashMap <>();
		h.put(new Costomer(01, "kalai", "chennai"), new Product("pen", 10));
		h.put(new Costomer(02, "selvan", "delhi"), new Product("note", 10));
		h.put(new Costomer(03, "selvi", "bangulure"), new Product("Bag", 10));
		h.put(new Costomer(04, "rakshan", "tvm"), new Product("box", 10));
		//h.forEach((k,v)-> System.out.println(k+" "+v));
		Iterator<Entry<Costomer,Product>>entries=h.entrySet().iterator();
		while(entries.hasNext()) {
			Map.Entry<Costomer, Product> entry = entries.next();
			System.out.println(entry.getKey() +"  "+ entry.getValue());
		}
		
	}

}
