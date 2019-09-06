package com.asminds.abstraction;



public class Test1 implements Test ,Test2 {

	@Override
	public void display(int a,int b) {
	//Scanner s=new Scanner(System.in);
	
	//System.out.println("Enter a:");
	//a=s.nextInt();
	//System.out.println("Enter b:");
	//b=s.nextInt();
	System.out.println("Value:" +(a+b));
	}
public static void main(String[] args) {
	Test1 t=new Test1();
	t.display(10, 90);
	t.show(4, 5);
	
}
@Override
public void show(int c, int d) {
	System.out.println("value:"+(c*d));
	
	
}
}
