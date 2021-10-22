package collection_example;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_iterator_1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("amol");
		al.add("vishal");
		al.add("suyog");
		al.add("sujit");
		al.add("sameer");
		al.add("xerox");
		al.add("zebra");
		al.add("gitesh");
		al.add("babasaheb");
		al.add("jayant");
		al.add("kunal");
		System.out.println(al);
		System.out.println();

		ListIterator li = al.listIterator();
		while(li.hasNext())
		{
			String str =(String)li.next();
			System.out.println(str);
		}
		
		while(li.hasPrevious())
		{
			String str =(String)li.previous();
			System.out.println(str);
		}
		
	}

}
