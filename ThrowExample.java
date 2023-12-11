package exception;

public class ThrowExample {
	
	static void age_validation(int age)
	{
		if (age<18)
			 throw new ArithmeticException("not eligible to vote,drive");
		else
			System.out.println("eligible to vote,drive");
	}
	
	
	public static void main(String[] args) {
		ThrowExample.age_validation(17);

	}

}
