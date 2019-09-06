package com.asminds.searilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileWriterObject {

	public static void main(String[] args) throws IOException {

		Employee e = new Employee(111, "aaa", 1000.0);
		FileOutputStream fin = new FileOutputStream("C:\\Users\\Anand\\Desktop\\Test File\\Asha.txt");
		ObjectOutputStream out = new ObjectOutputStream(fin);
		out.writeObject(e);
		out.close();
		fin.close();
		System.out.println(" File has been created");
	}
}
