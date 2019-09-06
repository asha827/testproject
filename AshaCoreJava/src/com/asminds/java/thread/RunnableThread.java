package com.asminds.java.thread;

public class RunnableThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running Thread");
	}
public static void main(String[] args) {
	RunnableThread r=new RunnableThread();
	Thread t1=new Thread(r);
	
	t1.start();
	
}
}
