package com.asminds.searilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Desealization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream fin=new FileInputStream("C:\\Users\\Anand\\Desktop\\Test File\\Asha.txt");	
	ObjectInputStream i = new ObjectInputStream(fin);
	Employee e=(Employee)i.readObject();
	System.out.println(e.toString());
		
	}
	
	

}
