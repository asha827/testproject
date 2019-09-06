package com.asminds.java.exception;

import java.io.FileWriter;

public class Voting {
public static void main(String[] args) throws AgeNotEnought {
	
	/*int age=17;
	if(age<=17) {
		throw new AgeNotEnought(age);
	}*/
	try {
	int i=10;
	System.out.println(i/0);
	}catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	
	finally {
		System.out.println(" DB Or File Opration Closed");
	} 
}
}
