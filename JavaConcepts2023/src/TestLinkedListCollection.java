import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		LinkedList<String> ll=new LinkedList<String>(); //creating a linked list 
		ll.add("java");
		ll.add("new");
		ll.add("super");
		ll.add("this");
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
