package exception;

import java.io.IOException;

class ThrowEx
{
	void method1(int num) throws IOException, ClassNotFoundException
	{
		if (num==1)
		{
			throw new IOException("IO exception occurred");
		}
		else
		{
			throw new ClassNotFoundException("class not found exception");
		}
		
	}
	
}

public class ExampleThrowS {

	public static void main(String[] args) {
		
		
			
			try {
				ThrowEx obj = new ThrowEx();
				obj.method1(2);
			} 
			catch (ClassNotFoundException e)
			{
				System.out.println("Class Not found exception");
			} catch (IOException e) {
				System.out.println("IO exception");
			}
		
		
	}

}
