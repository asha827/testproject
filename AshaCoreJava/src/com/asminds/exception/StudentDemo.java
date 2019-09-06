package com.asminds.exception;

import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) throws Exception {
		
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter your age");
		 int i=s.nextInt();
		if(i<18)
			throw new Exception("your minior");
		else
			System.out.println("your major");
	} }