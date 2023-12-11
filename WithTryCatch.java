package exception;

public class WithTryCatch {

	public static void main(String[] args) {
		try
		{
			int x=20;
			int y=0;
			int z=x/y;
			
			System.out.println("value of z: " + z);

		}
		catch(ArithmeticException e)
		{
			System.out.println("Pls ensure the denominator is never ZERO");
		}
	}

}
