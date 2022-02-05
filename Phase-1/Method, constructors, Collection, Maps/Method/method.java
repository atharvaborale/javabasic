package com.method.basic;

public class method {
	
	public void print (String name)
	{
    System.out.println("My name is "+name);
	}
    
	public int cube(int a)
	{
		return a*a*a;
	}
	
	public String name (String n1, String n2)
	{
		return n1+""+n2;
	}
public static void main(String[] args) {
	
	method obj=new method();
	obj.print("atharva");
			
	System.out.println("Cube root is " +obj.cube(50));
	
//	obj.name("abc", "xyz");
	System.out.println("Answer " +obj.name("abc", "xyz"));
	
}
}


