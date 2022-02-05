package com.method.basic;

public class MethodOverloading {
	
	public int name(int a, int b)
	
	{
		return a+b;
	}
	
	public int name(int a, int b, int c)
	
	{
		return a+b+c;
	}
	
	public float name(float a, float b, float c)
	
	{
		return a+b+c;
	}

	public static void main(String[] args) {
		
		MethodOverloading c= new MethodOverloading();
		System.out.println("Addition of int a&b " +c.name(40,50));
		
		System.out.println("Addition of int a,b&c " +c.name(40,50,20));
		
		System.out.println("Addition of float a&b " +c.name(12.5f,8.5f,8.6f));


		
		
	}
}


