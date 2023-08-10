
public class Throwexception {

    static void votersage(int age){
			
			if(age<18) 
				
				throw new ArithmeticException("not eligible to vote");
			else
				
			System.out.println("elgible");
		}
   public static void main(String args[])
   {
	   votersage(20);
	   System.out.println("please proceed to vote");
	   
   }
	}




