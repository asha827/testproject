package com.asminds.serilization;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo{
	public static void main(String[] args) throws IOException {
		FileWriter f=new FileWriter("Doc.txt");
		f.write("hello world");
		f.close();
		System.out.println("file writen completed");
		
		
		
	}

}
