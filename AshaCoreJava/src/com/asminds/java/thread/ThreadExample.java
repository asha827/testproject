package com.asminds.java.thread;

public class ThreadExample extends Thread {
	public void run() {
		System.out.println("new Thread" +getPriority());
		System.out.println(" "+getName());
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadExample t = new ThreadExample();
		t.start();
		ThreadExample t1 = new ThreadExample();
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setName("aaa");
		t1.sleep(1000);
		
		t1.start();
		
	}

}
