
 class father{ // parent class
	
	int birthyear=1970;
	String nationality="Indian";
	String birthplace="Chennai";
	
	 void display() {   //if final in method, overriding is not possible
		
	System.out.println("Fathers identification is:"+birthyear+" "+nationality+" "+birthplace );
	}
	
}

class son extends father{  //child class  // if final classs, then extendes is not possible
	
	int birthyear=2000;
	String nationality="US";
	String birthplace="arizona";
	
	void display() { //achieving method overiding 
		
	System.out.println("sons identification is:"+birthyear+" "+nationality+" "+birthplace );
}
}

public class Inheritance extends son{
	
	public static void main(String[] args)
	{
		Inheritance obj=new Inheritance();
		obj.display();
		
	}
}

	
	
	
	


  