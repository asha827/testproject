package com.asminds.java.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample1 {
	public static void main(String[] args) {
		HashMap<Integer, Integer> h= new HashMap<>();
		h.put(121, 101);
		h.put(122, 102);
		h.put(123, 103);
		h.put(124, 104);
		h.put(125, 105);
		h.put(126, 106);
		
		h.forEach((k,v)->System.out.println(k +" "+ v));
		
		/*for(Map.Entry<Integer, Integer> ob : h.entrySet()) {
			System.out.println(ob.getKey());
			System.out.println(ob.getValue());
		}
	 */
		
		/*Iterator entries = h.entrySet().iterator();
		while (entries.hasNext()) {
		    Map.Entry entry = (Map.Entry) entries.next();
		   
		    System.out.println("Key = " + entry.getKey() );
		}
		*/
			
		}
		
		
		
	
	}
