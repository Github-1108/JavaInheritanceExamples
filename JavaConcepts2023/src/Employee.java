
public class Employee extends Employer {
	
	void salary() {
		System.out.println("salry of employee is decided by the employer");
	}
	public static void main(String[] args)
{
	Employee obj=new Employee();
	obj.salary();
}
 // object canot created for the abstract class, so we create obj for the current class
}

