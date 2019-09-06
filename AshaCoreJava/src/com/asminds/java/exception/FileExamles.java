package com.asminds.java.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExamles {

	public void fread() throws IOException {

		FileReader r = new FileReader("C:\\Users\\Anand\\Desktop\\Test File\\AshaTest.txt");
		int i;
		while ((i = r.read()) != -1) {

			System.out.println((char) i);

		}
	}

	public void fwrite() throws IOException, ClassCastException {

		FileWriter w = new FileWriter("C:\\Users\\Anand\\Desktop\\Test File\\AshaTest.txt");
		w.write("Hi Java");
		w.close();
		System.out.println(" File Has been Created");
	}

	public static void main(String[] args) throws IOException {
		FileExamles f = new FileExamles();
		f.fwrite();
		f.fread();

	}
}
