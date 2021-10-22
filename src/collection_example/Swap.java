package collection_example;

import java.util.ArrayList;
import java.util.Collections;

public class Swap
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("amol");
		al.add("sameer");
		al.add("gitesh");
		al.add("devanand");
		al.add("suyog");
		
		ArrayList<String> all= new ArrayList<String>(al);
		all.add("kannad");
		all.add("karmad");
		all.add("jalgaon");
		all.add("bhusaval");
		all.add("hasta");
		
		System.out.println();
		Collections.swap(all, 5, 9);
		System.out.println(all);
		
	}

}
