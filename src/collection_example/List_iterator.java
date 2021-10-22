package collection_example;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_iterator {
	public static void main(String[] args) {
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

		// using generics version 
		
		ListIterator<String> li = al.listIterator();
		while (li.hasNext()) {
			String str = li.next();
			System.out.println(str);
		}
		System.out.println();

		// by using normal version of collection
		ListIterator li1 = al.listIterator();
		while(li1.hasNext())
		{
			String str =(String)li1.next();
			System.out.println(str);
		}
	}

}
