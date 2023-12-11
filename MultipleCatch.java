package exception;

public class MultipleCatch {

	public static void main(String[] args) {
	try
	{		
		int arr[] =new int[5];
		  arr[2]=20/1;
		  
	}
	

	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("pls ensure the index is less than 5");
	}
	catch(ArithmeticException e)
	{
		System.out.println("pls ensure the denominator is not ZERO");
	}
		
	catch(Exception e)
	{
	System.out.println("some exception occurred");
	}
	finally
	{
		System.out.println("finally block is executed whether you get an exception or you do not get an exception");
	}
	System.out.println("Hi");
	
}
}