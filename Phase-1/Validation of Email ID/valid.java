package com.projects;
import java.util.ArrayList;
import java.util.Scanner;


public class valid {

	public static void main(String[] args) {
		
		boolean flag=false;
		ArrayList<String> l=new ArrayList<String>();
		l.add("atharva@gmail.com");
		l.add("test@gmail.com");
		l.add("test2@gmail.com");
		
		System.out.println(l);
		System.out.println("Enter the email?");	
		
		Scanner sc =new Scanner(System.in);
		String input=sc.next();
		
		for( int i=0;i<l.size();i++) {
        if(l.contains(input)) {
        	System.out.println("Valid email");
        	flag =true;
        	break;
        }
		}
        if (flag==false) {
        	System.out.println("Invalid email");
        
        }
		
		

	}

}
