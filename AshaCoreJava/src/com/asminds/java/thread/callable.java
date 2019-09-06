package com.asminds.java.thread;

import java.util.concurrent.Callable;

public class callable implements Callable<Student> {

	@Override
	public Student call() throws Exception {
		// TODO Auto-generated method stub

		return null;
	}

	public static void main(String[] args) {
		callable c=new callable();
		Thread t=new Thread();
		t.start();
		
		

	}
}
