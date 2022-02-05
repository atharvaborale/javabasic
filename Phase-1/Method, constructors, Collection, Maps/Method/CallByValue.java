package com.method.basic;

public class CallByValue {

	int a;
	void operation (int a)
	{
		this.a = a*10;
		//System.out.print(b);
	}
	
	public static void main(String[] args) {
		
		CallByValue c=new CallByValue();
		System.out.println("before call by value where default a=0" +c.a);
		
		c.operation(78);
		System.out.println("after call by value where a=78 " +c.a);
		
		
		c.operation(20);
		System.out.println("after call by value where a=20 " +c.a);
		
		

		
		
	}
	
}

