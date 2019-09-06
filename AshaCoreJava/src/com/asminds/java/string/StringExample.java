package com.asminds.java.string;

public class StringExample {
	public static void main(String[] args) {
		
		String name="Welcome to Asminds to Technology in in  Asminds Tech";
		String name1="Asha";
		String name2="selvan";
		String name3="selvi";
		
		String a[];
		
		a=name.split(" ");
			for (int i = 0; i < a.length; i++) {
				
				for (int j = i+1; j < a.length; j++) {
					if(a[i].equals(a[j])) {
						System.out.println(" Duplicate Words "+a[j]);
					}
					
					
				}
				
			}	
		
		
		
		
		//System.out.println(name.trim());
		//System.out.println(name.substring(5));
		//System.out.println(name.substring(6, 16));
		
		
		
		
		/*System.out.println(name.length());
		System.out.println(name.compareTo(name1));
		System.out.println(name1.startsWith("b"));
		System.out.println(name.endsWith("a"));*/
	}

}
