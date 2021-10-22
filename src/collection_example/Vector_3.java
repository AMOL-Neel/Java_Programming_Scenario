package collection_example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class Vector_3 
{
	public static void main(String[] args) 
	{
		String[] str = {"amol","AMOL","vinay","VINAY","ashish","ASHISH"};
		
		Vector<String> v = new Vector<String>(Arrays.asList(str));
		System.out.println(v);
		
		Iterator<String> itr = v.iterator();
		
		while(itr.hasNext())
		{
			String s = itr.next();
			if(s.contains("amol"))
				itr.remove();
			if(s.contains("vinay"))
				itr.remove();
			if(s.contains("ashish"))
				itr.remove();
		}
		
		for(String st:v)
		{
			System.out.println(st);
		}
		
	}

}
