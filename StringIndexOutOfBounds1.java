package exception;

public class StringIndexOutOfBounds1 {

	public static void main(String[] args) {
		String str ="Rohit Sharma";
		System.out.println(str.length());
		
		   char ch= str.charAt(15);
		   System.out.println(ch);

	}

}
