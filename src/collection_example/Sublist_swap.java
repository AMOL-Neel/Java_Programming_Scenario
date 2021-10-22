package collection_example;

import java.util.ArrayList;
import java.util.Collections;

public class Sublist_swap
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("amol");
		al.add("sonu_dada");
		al.add("sam");
		al.add(null);
		al.add("gitesh");
		al.add("suyog");
		System.out.println("before swaping data =");
		System.out.println(al);
		System.out.println();
		Collections.swap(al, 3, 5);
		System.out.println("after swaping data =");
		System.out.println(al);
		System.out.println();
		
		ArrayList<String> all = new ArrayList<String>(al.subList(1, 4));
		System.out.println(all);
		System.out.println();
		
		
	}

}
