package com.asminds.oops.abstraction;

public class SBI extends RBI {

	@Override
	public void withdraw(int ac, int pin, int amt) {
		if (ac == 1212) {
			if (pin == 2222) {
				if (amt < 1500) {
					System.out.println("sucessfully withdraw");

				} else {
					System.out.println("insuffient fund");
				}

			} else {
				System.out.println(" incorrect pin no");

			}
		} else
			System.out.println(" incorrect account no");

	}
public static void main(String[] args) {
	SBI s=new SBI();
	s.withdraw(1212, 2222, 1000);
	s.customercare();
}
}
