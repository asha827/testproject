package com.asminds.java.exception;

public class ComplitimeExceptionExamples {
	
	public static void main(String[] args) {
		/*try {
		int i=10;
		System.out.println(i/0);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Don't / by zero"+e);
		}*/
		try {
			 
			String s=null;  
			System.out.println(s.length());
		
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
