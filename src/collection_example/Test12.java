package collection_example;

import java.util.ArrayList;
import java.util.Iterator;

public class Test12 
{
	public static void main(String[] args) 
	{
		ArrayList<Book> al = new ArrayList<Book>();
		al.add(new Book(111, "java", "ravi_sir"));
		al.add(new Book(222, "JBR", "ratan_sir"));
		al.add(new Book(333, "selenium", "akash_sir"));
		al.add(new Book(444, "English", "manish_sir"));
		
		
		Iterator<Book> itr  = al.iterator();
		while(itr.hasNext())
		{
			Book b =itr.next();
			if(b.id==444)
				itr.remove();
			if(b.name.equals("JBR"))
				itr.remove();
		}
		
		for(Book bb:al)
		{
			System.out.println(bb.id+     " "     +bb.name+      "  "      +bb.auther);
			
			
		}
		
	}

}
