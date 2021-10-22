package collection_example;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_cursor {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("amol");
		al.add("sameer");
		al.add("suyog");
		al.add("ganesh");
		al.add("sagar");
		al.add("sandeep");
		System.out.println("print arraylist data = ");
		System.out.println(al);

		// read the data by using iterator : normal version.
		Iterator i = al.iterator();
		while (i.hasNext()) {
			String str = (String) i.next();
			System.out.println(str);
		}
		System.out.println();

		// read the data by using iterator : with generics version
		Iterator<String> i1 = al.iterator();
		while (i1.hasNext()) {
			String str1 = i1.next();
			System.out.println(str1);
		}

	}

}
