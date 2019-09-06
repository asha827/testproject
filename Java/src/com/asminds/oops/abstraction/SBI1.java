package com.asminds.oops.abstraction;

public class SBI1 implements RBI1 {

	@Override
	public void withdraw(int id, int pin, int amt) {
		// TODO Auto-generated method stub
		System.out.println("collect amt");
	}

	@Override
	public void deposite(int id, int pin, int amt) {
		// TODO Auto-generated method stub
		System.out.println("collect amt");
	}
	
public static void main(String[] args) {
	SBI1 s=new SBI1();
	s.withdraw(11, 222, 1000);
	s.deposite(99, 888, 500);
	
}
}

