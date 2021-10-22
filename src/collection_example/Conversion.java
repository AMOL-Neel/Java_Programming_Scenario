package collection_example;

import java.util.ArrayList;
import java.util.Arrays;

public class Conversion 
{
	public static void main(String[] args) 
	{
		String[] str = {"kannad","aurangabad","phulambri","paithan","nevasa"};
		
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(str));
		System.out.println(al);
		System.out.println();
		
		//conversion of collection to array with generics version 
		
		ArrayList<String> all = new ArrayList<String>();
		all.add("amol");
		all.add("gitesh");
		all.add("ganesh");
		all.add("vinod");
		all.add("jitu");
		System.out.println();
		String[] str1 = new String[all.size()];
		all.toArray(str1);
		
		for(String st:str1)
		{
			System.out.println(st);
		}
		
		// conversion of collection of array with normal version 
		
		ArrayList alist = new ArrayList();
		alist.add("amol");
		alist.add(200);
		alist.add(345.5f);
		alist.add(45.5);
		alist.add('a');
		System.out.println();
		Object[] o = alist.toArray();
		System.out.println();
		
		for(Object oo:o)
		{
			System.out.println(oo);
		}
		
	}

}
