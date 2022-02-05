package com.javabasic.checkedexception;
import java.io.FileReader;
public class CheckedException2 {

	
	public static void main(String[] args) {
		//compile time: FileNotFoundException
		FileReader file= new FileReader("C://test//user.txt");
		
	}
}
