package collection_example;

import java.util.ArrayList;
import java.util.Arrays;

public class ConversionAtoC 
{

	public static void main(String[] args) 
	{
		// conversion of arrays to collection
		
		String[] s = {"amol","suyog","sameer","gitesh"};
		
		ArrayList<String> a1 = new ArrayList<String>(Arrays.asList(s));
		a1.add("neel");
		a1.add("neel");
		a1.add("purnpatre");
		a1.add("patil");
		System.out.println(a1);
		System.out.println();
		
		// conversion of generics collection to array
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("java");
		a2.add("selenium");
		a2.add("cucumber");
		a2.add("testNg");
		a2.add("maven");
		System.out.println("before conversion of array");
		System.out.println(a2);
		System.out.println();
		
		String[] s1 = new String[a2.size()];
		a2.toArray(s1);
		
		for(String ss:s1)
		{
			System.out.println(ss);
		}
		
		
		// conversion of normal collection to array
		ArrayList a3 = new ArrayList();
		a3.add("aurangabad");
		a3.add('a');
		a3.add(null);
		a3.add("mumbai");
		a3.add(25.5f);
		a3.add(100);
		System.out.println("before convert into array");
		System.out.println(a3);
		System.out.println("after convert into array");
		Object[] o =a3.toArray();
		
		for(Object oo:o)
		{
			System.out.println(oo);
		}
		
		
 	}

}
