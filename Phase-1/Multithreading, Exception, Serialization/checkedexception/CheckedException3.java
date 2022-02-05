package com.javabasic.checkedexception;
import java.sql.DriverManager;
public class CheckedException3 {

	

	public static void main(String[] args) {
		//compile time : SQLException
		DriverManager.getConnection("");
	}
}
