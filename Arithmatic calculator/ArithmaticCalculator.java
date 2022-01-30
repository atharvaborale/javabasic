package com.myspace.helloworld;

import java.util.Scanner;

public class ArithmaticCalculator {
	
	public static void main(String[] args) {
		
	   Scanner sc = new Scanner(System.in);
	   double a,b,c;
	   char d;
	   
	   System.out.println("Enter first value");
	   a=sc.nextDouble();
	   
	   System.out.println("Enter second value");
	   b=sc.nextDouble();
	   
	   System.out.println("Enter arithmatic operator +, - , * , / or % to calculate");
	   d=sc.next().charAt(0);
	   
	   if(d=='+')
	   {
		   c=a+b;
		   System.out.println(a +" "+d +" "+b +"= "+" "+ c );   
	   }
	   if(d=='-')
	   {
		   c=a-b;
		   System.out.println(a +" "+d +" "+b +"= "+" "+ c);   
	   }
	  if(d=='*')
	   {
		   c=a*b;
		   System.out.println(a +" "+d +" "+b +"= "+" "+ c);   
	   }
	  if(d=='/')
	   {
		   c=a/b;
		   System.out.println(a +" "+d +" "+b +"= "+" "+ c);   
	   }
	   if(d=='%')
	   {
		   c=a%b;
		   System.out.println(a +" "+d +" "+b +"= "+" "+ c);   
	   }
	  
	}
}
