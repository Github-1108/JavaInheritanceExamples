
class rectangle{
	int length=10;
	int width=2;
	void area(int length,int width)
	{
		this.length=length;
		this.width=width;
		int a1;
		a1= length*width;
		System.out.println("area of the rectangle is:"+" "+a1);
	}
}class shapes extends rectangle
{
	void area()
	{
		int a;
		a= length*width;
		System.out.println("area of the rectangle is:" +a);
	}
}
public class this_variable {

	public static void main(String[] args) {

		/*this_variable obj=new this_variable();
		obj.area();
		obj.area(6, 10);*/
	
     shapes s=new shapes();
     s.area();
     s.area(5, 6);
     
     
	}
}

