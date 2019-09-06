package com.asminds.java.exception;

public class AgeNotEnought extends Exception{

public AgeNotEnought() {
	System.out.println("Your Age is Not Enought");
}

public AgeNotEnought(int age) {
	System.out.println("Your Age is Not Enought"+age);
}

}
