
public class StringExamples {

	public static void main(String[] args) {
	
		String s1="Automation";  // creating a string using string literal
		
		char[] ch= {'j','a','v','a'}; // string is a sequence of characters //creating an array and passing the array to constructors
		
		String s2= new String(ch); // creating string using new keyword, here string is an object that represents a seq of characters
		               // string(ch) is parametrized constructors
		
		
		String s3=new String("selenium"); 
		String s4="Walcane";// creating string usaing new keyword
		String s6="Automation";
		//System.out.println(s1.equals(s6));
		
		/*System.out.println(s1);
		System.out.println(s2.isEmpty());
		System.out.println(s3.length());
		System.out.println(s3);
		System.out.println(s1.concat(s3));
		System.out.println(s1);
		System.out.println(s1.equals(s2));*/
		// String s5=s4.replace('a','e');
		//System.out.println(s5);
		//System.out.println("replaced string is:"+s5);
		//System.out.println("original string is:"+s4);
		s4=s4.replace('a', 'e');
		String replace=s4.replace("en","om");
		System.out.println(replace);
		s3=s3.toUpperCase();
		//System.out.println(s3.toUpperCase());
		System.out.println(s3);
		System.out.println(s3.toLowerCase());
		
		String str="Immutable String";
		String str1="Mutable String";
		System.out.println(str.trim());
		System.out.println(str.trim()+str1);
		/*String s1="java string";  
		s1.concat("is immutable");  
		System.out.println(s1.concat("is immutable")); 
		System.out.println(s1);  
		s1=s1.concat(" is immutable so assign it explicitly");  
		System.out.println(s1);  */

	}

}
