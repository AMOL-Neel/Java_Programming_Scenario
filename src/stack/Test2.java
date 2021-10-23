package stack;

import java.util.LinkedList;
import java.util.ListIterator;

public class Test2 
{
	public static void main(String[] args) 
	{
		LinkedList<Book> ll = new LinkedList<Book>();
		
		ll.add(new Book(111, "java", "amol"));
		ll.add(new Book(222, "selenium", "akash"));
		ll.add(new Book(333, "Cucumber", "Ketan"));
		
		ListIterator<Book> l1 = ll.listIterator();
		
		while(l1.hasNext())
		{
			Book b = l1.next();
			
			System.out.println(b.Bid+" "+b.Bname+" "+b.Auname);
		}
		
		for(Book b1:ll)
		{
			System.out.println(b1.Bid+" "+b1.Bname+" "+b1.Auname);			
		}
		
		
		
	}

}
