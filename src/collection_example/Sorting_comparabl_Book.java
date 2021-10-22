package collection_example;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_comparabl_Book 
{
	public static void main(String[] args) 
	{
		ArrayList<Book_1> al = new ArrayList<Book_1>();
		al.add(new Book_1(111, "c", "danish_rache"));
		al.add(new Book_1(12, "java", "ratan_sir"));
		al.add(new Book_1(123, "selenium", "akash_sir"));
		al.add(new Book_1(134, "advanced java", "ravi_sir"));
		
		Collections.sort(al);
		
		for(Book_1 b1:al)
		{
			System.out.println(b1.id+" "+b1.name+" "+b1.author);
			
		}
		
	}

}
