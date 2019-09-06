package com.asminds.corejava.hellojava;

public class IfExample {

	public static void main(String[] args) {

		int pamount = 50400;
		if (pamount > 1000) {
			
			if(pamount>=50000) {
				
				if(pamount>=20000) {
					System.out.println(" 20 % Discount");
				}
				System.out.println(" 10 % Discount");
			} 
			
			System.out.println(" Your Eligible for 5% Discount");
		} else if(pamount>500) 
		{
			System.out.println("2 %Discount");
		}
		
		
		else {
			System.out.println(" Pen free");
		}

		System.out.println(" Welcome to Saravana store...!");
		
	}

}

