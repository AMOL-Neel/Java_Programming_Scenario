package collection_example;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_1 
{
	public static void main(String[] args)
	{
		ArrayList<String> al  = new ArrayList<String>();
		
		al.add("amol");
		al.add("sameer");
		al.add("suyog");
		al.add("gitesh");
		al.add("kiran");
		al.add("sujit");
		System.out.println("before sorting data: ");
		System.out.println(al);
		Collections.sort(al);
		System.out.println("after sorting data");
		System.out.println(al);
		System.out.println();
		
		// all wrapper classes
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(11);
		al1.add(12);
		al1.add(345);
		al1.add(567);
		al1.add(897);
		al1.add(1009);
		al1.add(1892);
		System.out.println("before sorting data: ");
		System.out.println(al1);
		Collections.sort(al1);
		System.out.println("after sorting data: ");
		System.out.println(al1);
		System.out.println();
		
		ArrayList<Float> al2 = new ArrayList<Float>();
		al2.add(45.5f);
		al2.add(55.5f);
		al2.add(433.5f);
		al2.add(75.5f);
		al2.add(85.5f);
		al2.add(1.55f);
		System.out.println("before sorting data: ");
		System.out.println(al2);
		Collections.sort(al2);
		System.out.println("after sorting data");
		System.out.println(al2);
		
	
		
	}

}
