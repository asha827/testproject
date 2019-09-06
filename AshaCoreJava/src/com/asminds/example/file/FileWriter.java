package com.asminds.example.file;

import java.io.IOException;

public class FileWriter {
	public static void main(String[] args) throws IOException {
	 java.io.FileWriter f =new java.io.FileWriter("C:\\Users\\Anand\\Desktop\\Test File\\Asha.txt");
	 f.write("project file");
	 f.close();
	 System.out.println("file writed sucessfully");
	}

}
