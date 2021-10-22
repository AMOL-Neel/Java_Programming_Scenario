package collection_example;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test15
{

	public static void main(String[] args) 
	{
		ArrayList<Book> al = new ArrayList<Book>();
		al.add(new Book(111, "java", "ravi_sir"));
		al.add(new Book(222, "selenium", "akash_sir"));
		al.add(new Book(333, "java By ratan", "ratan_sir"));
		al.add(new Book(444, "english", "manish_sir"));
		
		ListIterator<Book> lstr = al.listIterator();
		lstr.add(new Book(555, "cucumber", "amol_sir"));
		
		while(lstr.hasNext())
		{
			Book bb =lstr.next();
			if(bb.id==444)
				lstr.remove();
		
		}
		
		for(Book b:al)
		{
			System.out.println(b.id+" "+b.name+" "+b.auther);
		}
		
	}
}
