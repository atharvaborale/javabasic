package array1;

public class Array1 {
	
	public static void main(String[] args) {
	int array[]= {20,52,85,22,74,28,55};
	
	System.out.println("Element at index 4 "+array[4]);
	
	System.out.println("Length of an array "+array.length);
	
	System.out.println("access same using for loop");
	for(int i=0;i<array.length;i++)
	{
		System.out.print(array[i]+" ,");
	}
	System.out.println();
	System.out.println("access same using for each loop");
	for(int a :array)
	{
		System.out.print(a+" ,");
	}
}
}