
public class Exceptionhandling {

	public static void main(String[] args) {

         try {
		int data=50/0; // Exception in thread "main" java.lang.ArithmeticException: / by zero
		//               //at Exceptionhandling.main(Exceptionhandling.java:7)
		String s=null;
		s.length();

	}catch(ArithmeticException exp) {
		
		System.out.println("arithmetic Exception is handled and the flow of the code is mainted");
	
}catch(NullPointerException n)
         {
	System.out.println("null pointer handled");
         }
	finally {
		int a=10;
		int b=560;
		int sum=a+b;
		System.out.println(sum);
		System.out.println("clean code");
	}
}
}

