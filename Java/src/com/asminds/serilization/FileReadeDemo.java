package com.asminds.serilization;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadeDemo{
	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("doc.txt");
		int i;
		while((i=f.read())!=-1){
			System.out.println((char)i);
			f.close();
			
		}
	}
	

}
