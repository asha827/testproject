package com.asminds.example.file;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
	public static void main(String[] args) throws IOException {
		java.io.FileReader f= new java.io.FileReader("C:\\Users\\Anand\\Desktop\\Test File\\Asha.txt");
		int j;
		while((j=f.read())!=-1) {
			System.out.print((char)j);
		}
		f.close();
	}

}
